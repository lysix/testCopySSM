package com.ly.service;

import com.ly.model.Person;
import com.ly.model.User;


import java.sql.SQLException;
import java.util.List;

public interface UserService {

    public int updatePassword(Person person) throws SQLException;

    public List<User> getAll() throws SQLException;

    public int updateSelfData(User user) throws SQLException;

    public User getSelfData(int id) throws SQLException;
}
