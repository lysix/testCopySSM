package com.ly.service.impl;

import com.ly.dao.UserDao;
import com.ly.model.Person;
import com.ly.model.User;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int updatePassword(Person person) throws SQLException {
        return userDao.updatePassword(person);
    }

    @Override
    public List<User> getAll() throws SQLException {
        return userDao.getAll();
    }

    public int updateSelfData(User user) throws SQLException {
        return userDao.updateSelfData(user);
    }

    @Override
    public User getSelfData(int id) throws SQLException {
        return userDao.getSelfData(id);
    }
}
