package main.entities;


import java.math.BigDecimal;
import java.time.LocalDate;

public class Magazine {
    private Long magazineId;
    private String title;
    private LocalDate publishYear;
    private BigDecimal price;
    private String language;
    private String country;
    private String index;
    private String type;
    private String pictureURL;
    private Category category;

    public Long getMagazineId() {
        return magazineId;
    }

    public void setMagazineId(Long magazineId) {
        this.magazineId = magazineId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(LocalDate publishYear) {
        this.publishYear = publishYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magazine magazine = (Magazine) o;

        if (!magazineId.equals(magazine.magazineId)) return false;
        if (!title.equals(magazine.title)) return false;
        if (!publishYear.equals(magazine.publishYear)) return false;
        if (!price.equals(magazine.price)) return false;
        if (!language.equals(magazine.language)) return false;
        if (!country.equals(magazine.country)) return false;
        if (!index.equals(magazine.index)) return false;
        if (!type.equals(magazine.type)) return false;
        if (!pictureURL.equals(magazine.pictureURL)) return false;
        return category.equals(magazine.category);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + index.hashCode();
        return result;
    }


}
