package com.eri.productAnalysis.portal.model;



import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//@Document
public class Product {

    private ObjectId _id;

    public Product() {
        this._id = ObjectId.get();
    }
    @Id
    private int productId;

    private int price;

    private String description;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }
    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
