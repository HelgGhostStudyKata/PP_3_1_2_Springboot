package com.example.pp_3_1_2_springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pp_3_1_2_springboot.dao.UserServiceDAO;
import com.example.pp_3_1_2_springboot.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserServiceDAO userServiceDAO;

    @Autowired
    public UserServiceImpl(UserServiceDAO userServiceDAO) {
        this.userServiceDAO = userServiceDAO;
    }

    @Override
    public List<User> getAll() {
        return userServiceDAO.getAll();
    }

    @Override
    public User get(Long id) {
        return userServiceDAO.get(id);
    }

    @Override
    public void add(User user) {
        userServiceDAO.add(user);
    }

    @Override
    public void update(Long id, User user) {
        userServiceDAO.update(id, user);
    }

    @Override
    public void delete(Long id) {
        userServiceDAO.delete(id);
    }
}
