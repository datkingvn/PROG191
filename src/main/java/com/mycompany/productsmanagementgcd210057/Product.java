package com.mycompany.productsmanagementgcd210057;

class Item {
    private String productID;
    private String productName;
    private int times;
    private int quantity;
    private Category category; // Declare a Category field
    private String consignor;

    public Item(String productID, String productName, int times, int quantity, Category category, String consignor) {
        this.productID = productID;
        this.productName = productName;
        this.times = times;
        this.quantity = quantity;
        this.category = category; // Assign the Category object
        this.consignor = consignor;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getConsignor() {
        return consignor;
    }

    public void setConsignor(String consignor) {
        this.consignor = consignor;
    }

    public static double getDefaultPrice(Item item) {
        Category category = item.getCategory();
        if (category != null) {
            return category.getDefaultPrice();
        } else {
            // Handle the case where the category is not set
            return 0.0; // You can choose a default value or handle it differently
        }
    }

    @Override
    public String toString() {
        return "Product ID: " + productID +
                ", Name: " + productName +
                ", Times: " + times +
                ", Quantity: " + quantity +
                ", Category: " + (category != null ? category.getCategoryName() : "N/A") +
                ", Consignor: " + consignor;
    }
}

class Category {
    private String categoryName;
    private double defaultPrice;

    public Category(String categoryName, double defaultPrice) {
        this.categoryName = categoryName;
        this.defaultPrice = defaultPrice;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public double getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(double defaultPrice) {
        this.defaultPrice = defaultPrice;
    }
}

class Book extends Category {
    public Book() {
        super("Book", 10.0);
    }
}

class Electronic extends Category {
    public Electronic() {
        super("Electronic", 50.0);
    }
}

class Clothes extends Category {
    public Clothes() {
        super("Clothes", 20.0);
    }
}
