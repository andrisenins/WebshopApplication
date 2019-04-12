package lv.tsi.webshop.model;


// it should contain fields like id of type long,
// name of type String, description of type String,
// price of type float,
// pictureUrl of type String, productCategory of type ProductCategory.

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    private float price;
    private String pictureUrl;

    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;

    public Product() {
    }

    public Product(long id, String name, String description, float price, String pictureUrl, ProductCategory productCategory) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.pictureUrl = pictureUrl;
        this.productCategory = productCategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
