package com.hb.service;


import com.hb.model.User;
import com.hb.repository.UserRepository;
import com.hb.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

    public User get(Integer id) throws NotFoundException {
        Optional<User> result = repo.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new NotFoundException("Could not find any users with ID" + id);
    }

    /*
    Implement for the delete handling
     */

    public void delete(int id) throws NotFoundException {
        long count = repo.countById(id);
        if (count == 0) {
            throw new NotFoundException("Could not find any users with ID" + id);
        }
        repo.deleteById(id);
    }
}
