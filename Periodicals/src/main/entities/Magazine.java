package main.entities;


import java.util.Date;


public class Magazine {
    private Long magazineId;
    private String title;
    private Date publishYear;
    private String language;
    private String country;
    private String index;
    private String type;

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

    public Date getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Date publishYear) {
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

    @Override
    public String toString() {
        return "Magazine{" +
                "magazineId=" + magazineId +
                ", title='" + title + '\'' +
                ", publishYear=" + publishYear +
                ", language='" + language + '\'' +
                ", country='" + country + '\'' +
                ", index='" + index + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
