package com.devglan.userportal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
//
//    void delete(User user);
//
//    List<User> findAll();
//
//    User save(User user);
    
    User findByEmailAndPassword(String email, String psw);

    //User findOne(int id);
}
