package com.mycompany.productsmanagementgcd210057;

/**
 *
 * @author tranmanhdat
 */
public class Product {
    private String productID;
    private String productName;
    private int productQuantity;
    private double productPrice;
    private String productCategory;
    private String productDescribe;

    public Product(String productID, String productName, int productQuantity, double productPrice, String productDescribe, String productCategory) {
        this.productID = productID;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.productDescribe = productDescribe;
        this.productCategory = productCategory;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public String getProductCategory() {
        return productCategory;
    }
    
    
}
