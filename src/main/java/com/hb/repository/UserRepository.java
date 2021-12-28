package com.hb.repository;

import com.hb.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {
    public long countById(int id);
}
