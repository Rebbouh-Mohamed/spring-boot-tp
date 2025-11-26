package com.example.tp03.dao;

import com.example.tp03.model.User;
import java.util.List;

public interface UserDao {
    List<User> findAll();
    void save(User user);
    void deleteById(Long id);
}