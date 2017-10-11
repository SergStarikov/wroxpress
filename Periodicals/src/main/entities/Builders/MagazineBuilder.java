package main.entities.Builders;

import main.entities.Category;
import main.entities.Magazine;

import java.math.BigDecimal;
import java.time.LocalDate;


public class MagazineBuilder {
    private Long magazineId = 0L;
    private String title = "some_magazine";
    private LocalDate publishYear = LocalDate.of(2017,10, 1);
    private BigDecimal price = BigDecimal.valueOf(0);
    private String language = "en";
    private String country = "USA";
    private String index ="0";
    private String type = "magazine";
    private String pictureURL = "someURL";
    private Category category = new Category();

    public MagazineBuilder buildMagazineId(Long magazineId) {
        this.magazineId = magazineId;
        return this;
    }

    public MagazineBuilder buildTitle(String title) {
        this.title = title;
        return this;
    }

    public MagazineBuilder buildPublishYear(LocalDate publishYear) {
        this.publishYear = publishYear;
        return this;
    }

    public MagazineBuilder buildPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public MagazineBuilder buildLanguage(String language) {
        this.language = language;
        return this;
    }

    public MagazineBuilder buildCountry(String country) {
        this.country = country;
        return this;
    }

    public MagazineBuilder buildIndex(String index) {
        this.index = index;
        return this;
    }

    public MagazineBuilder buildType(String type) {
        this.type = type;
        return this;
    }

    public MagazineBuilder buildPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
        return this;
    }

    public MagazineBuilder buildCategory(Category category) {
        this.category = category;
        return this;
    }

    public Magazine build(){
        Magazine magazine = new Magazine();
        magazine.setMagazineId(magazineId);
        magazine.setTitle(title);
        magazine.setPrice(price);
        magazine.setIndex(index);
        magazine.setCountry(country);
        magazine.setLanguage(language);
        magazine.setPublishYear(publishYear);
        magazine.setPictureURL(pictureURL);
        magazine.setType(type);
        magazine.setCategory(category);
        return magazine;
    }
}
