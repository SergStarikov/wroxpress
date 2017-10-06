package main.dao;

import main.entities.Category;
import main.entities.Magazine;

import java.util.List;

public interface MagazineDAO extends GenericDAO<Magazine>{
    List<Category> findAllCategories();
    List<Magazine> searchMagazinesByKeyword(String keyWord);

}
