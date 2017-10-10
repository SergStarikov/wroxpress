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

public class UserDAOImpl implements UserDAO {
    private Connection connection;
    @Override
    public User findById() {
        return null;
    }

    @Override
    public void create() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

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


}
