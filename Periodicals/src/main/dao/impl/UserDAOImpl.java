package main.dao.impl;

import main.dao.UserDAO;
import main.entities.Builders.UserBuilder;
import main.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO, AutoCloseable {

    @Override
    public User findByLoginPassword(String login, String password) {
        return null;
    }

    private Connection connection;
    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User create(User item) {
        return null;
    }

    @Override
    public User update(User item) {
        return null;
    }

    @Override
    public User delete(User item) {
        return  null;
    }

    @Override
    public List<User> findAll() throws SQLException {
        List<User> result = new ArrayList<>();
        try(PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM USER")){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new UserBuilder().buildUserId(resultSet.getLong("USER_ID"))
                        .buildFirstName("FIRST_NAME").buildLastName("LAST_NAME")
                        .buildPhoneNumber("PHONE_NUMBER").buildEmail("EMAIL").build();
                result.add(user);
            }
        }
        return result;
    }

    @Override
    public void close() throws Exception {

    }
}
