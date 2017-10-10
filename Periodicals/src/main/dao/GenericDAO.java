package main.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {
    void create();
    void update();
    void delete();
    List<T> findAll() throws SQLException;
    
}
