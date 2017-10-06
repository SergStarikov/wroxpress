package main.entities;

public class Category {
    private Long categoryId;
    private String categoryDescription;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryDescription='" + categoryDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (!categoryId.equals(category.categoryId)) return false;
        return categoryDescription.equals(category.categoryDescription);
    }

    @Override
    public int hashCode() {
        int result = categoryId.hashCode();
        result = 31 * result + categoryDescription.hashCode();
        return result;
    }
}
