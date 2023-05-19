package com.java.springboot.repository;

import com.java.springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
//    public List<User> findByEmail_id(String email_id);
    public User findByPassword(String password);
}
