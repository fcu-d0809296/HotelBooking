package com.hb.repository;

import com.hb.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    long countById(int id);
    //public long countById(int id);
}
