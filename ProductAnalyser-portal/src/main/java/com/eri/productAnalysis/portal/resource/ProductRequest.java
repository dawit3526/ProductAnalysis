package com.eri.productAnalysis.portal.resource;
public class ProductRequest {


    private int price;

    private String discription;

    public ProductRequest(int price, String discription) {
        this.price = price;
        this.discription = discription;
    }

    public int getPrice() {
        return price;
    }

    public String getDiscription() {
        return discription;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
