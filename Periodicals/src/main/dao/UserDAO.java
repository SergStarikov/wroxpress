package main.dao;

import main.entities.User;

public interface UserDAO extends GenericDAO<User> {
    User findByLoginPassword(String login, String password);
}
