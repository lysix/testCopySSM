package com.ly.dao;

import com.ly.model.Person;
import com.ly.model.User;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public interface UserDao {
    public int updatePassword(Person person) throws SQLException;

    public List<User> getAll() throws SQLException;

    public int updateSelfData(User user) throws SQLException;

    public User getSelfData(int id) throws SQLException;
}
