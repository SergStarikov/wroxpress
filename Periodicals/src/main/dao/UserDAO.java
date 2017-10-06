package main.dao;

import main.entities.User;

public interface UserDAO extends GenericDAO<User> {
    User findById();
}
