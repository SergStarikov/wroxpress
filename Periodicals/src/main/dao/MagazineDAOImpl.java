package main.dao;

import main.model.Category;
import main.model.Magazine;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MagazineDAOImpl implements MagazineDAO {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/periodics","root", "23031987");
    }

    private void closeConnection(Connection connection){
        if (connection == null) return;
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Magazine> findAllMagazines() {
        List<Magazine> result = new ArrayList<>();

        String sql = "select * from periodics";

        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Magazine magazine = new Magazine();
                magazine.setMagazineId(resultSet.getLong("magazine_Id"));
                magazine.setPublishYear(resultSet.getDate("publish_Year"));
                magazine.setTitle(resultSet.getString("title"));
                magazine.setCountry(resultSet.getString("country"));
                magazine.setLanguage(resultSet.getString("language"));
                magazine.setIndex(resultSet.getString("index"));
                magazine.setType(resultSet.getString("type"));

                result.add(magazine);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection(connection);
        }
        return result;
    }

    @Override
    public List<Category> findAllCategories() {
        List<Category> result = new ArrayList<>();
        String sql = "select * from category";

        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Category category = new Category();
                category.setCategoryId(resultSet.getLong("category_id"));
                category.setCategoryDescription(resultSet.getString("category_description"));
                result.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection(connection);
        }
        return result;
    }

    @Override
    public List<Magazine> searchMagazinesByKeyword(String keyWord) {
        List<Magazine> result = new ArrayList<>();

        String sql = "select * from periodics where title like '%" + keyWord.trim();
        Connection connection = null;
        try {
            connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Magazine magazine = new Magazine();
                magazine.setMagazineId(resultSet.getLong("magazine_Id"));
                magazine.setPublishYear(resultSet.getDate("publish_Year"));
                magazine.setTitle(resultSet.getString("title"));
                magazine.setCountry(resultSet.getString("country"));
                magazine.setLanguage(resultSet.getString("language"));
                magazine.setIndex(resultSet.getString("index"));
                magazine.setType(resultSet.getString("type"));

                result.add(magazine);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection(connection);
        }
        return result;
    }

    @Override
    public void insert(Magazine magazine) {

    }

    @Override
    public void update(Magazine magazine) {

    }

    @Override
    public void delete(Long magazineId) {

    }
}
