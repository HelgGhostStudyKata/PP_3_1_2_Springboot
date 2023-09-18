package com.example.pp_3_1_2_springboot.dao;

import com.example.pp_3_1_2_springboot.model.User;

import java.util.List;

public interface UserServiceDAO {
    public List<User> getAll();

    User get(Long id);

    void add(User user);

    void update(Long id, User user);

    void delete(Long id);
}
