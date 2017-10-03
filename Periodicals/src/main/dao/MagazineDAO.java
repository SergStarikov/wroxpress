package main.dao;

import main.beans.Category;
import main.beans.Magazine;

import java.util.List;

public interface MagazineDAO {
    public List<Magazine> findAllMagazines();
    public List<Category> findAllCategories();
    public List<Magazine> searchMagazinesByKeyword(String keyWord);
    public void insert(Magazine magazine);
    public void update(Magazine magazine);
    public void delete(Long magazineId);
}
