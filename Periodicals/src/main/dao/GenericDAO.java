package main.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {
    T create(T item);
    T update(T item);
    T delete(T item);
    T findById(Long id);
    List<T> findAll() throws SQLException;
    
}
