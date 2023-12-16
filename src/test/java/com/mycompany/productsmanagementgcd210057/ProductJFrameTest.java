package com.mycompany.productsmanagementgcd210057;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductJFrameTest {

    @Test
    @DisplayName("Test Add Product")
    void addProduct() {
        ProductJFrame productJFrame = new ProductJFrame();

        // Test adding a valid product
        productJFrame.txtProductID.setText("99");
        productJFrame.txtName.setText("Test Product");
        productJFrame.txtQuantity.setText("5");
        productJFrame.txtPrice.setText("10.99");
        productJFrame.txtDescribe.setText("Test Description");
        productJFrame.txtCategory.setText("Test Category");

        int initialSize = productJFrame.productList.size(); // lấy kích thước ban đầu của danh sách sản phẩm trước khi nút "Thêm"
        productJFrame.addBtn.doClick();
        int newSize = productJFrame.productList.size(); // lấy kích thước của danh sách sản phẩm sau khi nút "Thêm" được nhấp.

        assertEquals(initialSize + 1, newSize);

        // Test adding a product with invalid input (empty fields)
        productJFrame.txtProductID.setText(""); // Set a required field to an empty value
        initialSize = productJFrame.productList.size();
        productJFrame.addBtn.doClick();
        newSize = productJFrame.productList.size();

        assertEquals(initialSize, newSize);
    }


    @Test
    @DisplayName("Test Edit Product")
    void editProduct() {
        ProductJFrame productJFrame = new ProductJFrame();

        // Test editing a product
        productJFrame.txtProductID.setText("1");
        productJFrame.txtName.setText("Edited Product");
        productJFrame.txtQuantity.setText("8");
        productJFrame.txtPrice.setText("15.99");
        productJFrame.txtDescribe.setText("Edited Description");
        productJFrame.txtCategory.setText("Edited Category");

        int positionBeforeEdit = productJFrame.position;

        productJFrame.editBtn.doClick();

        assertEquals(8, productJFrame.productList.get(positionBeforeEdit).getProductQuantity());

        // Test editing a product with invalid input (empty fields)
        productJFrame.txtName.setText("");
        productJFrame.editBtn.doClick();

        assertNotEquals("", productJFrame.productList.get(positionBeforeEdit).getProductName());
    }

    @Test
    @DisplayName("Test Delete Product")
    void deleteProduct() {
        ProductJFrame productJFrame = new ProductJFrame();

        // Test deleting a product
        productJFrame.position = 1; // Assuming there is a product at position 1
        int initialSize = productJFrame.productList.size();

        productJFrame.deleteBtn.doClick();

        int newSize = productJFrame.productList.size();

        assertEquals(initialSize - 1, newSize);
    }

    @Test
    @DisplayName("Test Search Product")
    void searchProduct() {
        ProductJFrame productJFrame = new ProductJFrame();

        // Test searching for a product
        productJFrame.searchField.setText("Doraemon");
        productJFrame.searchBtn.doClick();

        assertEquals(1, productJFrame.tableShowProducts.getRowCount());

    }
}
