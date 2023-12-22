/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.productsmanagementgcd210057;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author tranmanhdat
 */
public class ConsignmentManagementJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProductManagementJFrame
     */
    private ArrayList<Item> itemList = new ArrayList<>();
    private DefaultTableModel tableModel;
    public ConsignmentManagementJFrame() {
        initComponents();
        tableModel = (DefaultTableModel) tableShowProducts.getModel();
        tableModel.setColumnIdentifiers(new Object[]{"Product ID", "Product Name", "Quantity", "Times (days)", "Price", "Category", "Consignor"});
        tableModel.setRowCount(0); // Xóa tất cả các hàng ban đầu trong bảng

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        introProject = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        productIDField = new javax.swing.JTextField();
        productQuantityField = new javax.swing.JTextField();
        productNameField = new javax.swing.JTextField();
        productConsignorField = new javax.swing.JTextField();
        productCategoryComboBox = new javax.swing.JComboBox<>();
        timesField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShowProducts = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        saveTableToTxtFileBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        introProject.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        introProject.setForeground(new java.awt.Color(103, 114, 71));
        introProject.setText("Manage Consignment of Items - GCD210057");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(introProject)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(introProject)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(186, 215, 121));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(103, 114, 71));
        jLabel1.setText("Product ID:");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(103, 114, 71));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(103, 114, 71));
        jLabel3.setText("Times (days):");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(103, 114, 71));
        jLabel4.setText("Quantity:");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(103, 114, 71));
        jLabel5.setText("Category:");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(103, 114, 71));
        jLabel6.setText("Consignor:");

        productNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameFieldActionPerformed(evt);
            }
        });

        productConsignorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productConsignorFieldActionPerformed(evt);
            }
        });

        productCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book", "Electronic", "Clothes" }));

        timesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(productQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productCategoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productConsignorField, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(timesField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(productQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productConsignorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        tableShowProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Times (days)", "Price", "Category", "Consignor"
            }
        ));
        tableShowProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableShowProductsMouseClicked(evt);
            }
        });
        tableShowProducts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableShowProductsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableShowProducts);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addBtn.setBackground(new java.awt.Color(186, 215, 121));
        addBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        addBtn.setForeground(new java.awt.Color(103, 114, 71));
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(204, 204, 255));
        editBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        editBtn.setForeground(new java.awt.Color(103, 114, 71));
        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 102, 102));
        deleteBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(103, 114, 71));
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        saveTableToTxtFileBtn.setBackground(new java.awt.Color(255, 204, 204));
        saveTableToTxtFileBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        saveTableToTxtFileBtn.setForeground(new java.awt.Color(102, 102, 102));
        saveTableToTxtFileBtn.setText("SAVE TABLE TO TXT");
        saveTableToTxtFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTableToTxtFileBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(204, 204, 255));
        cancelBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(103, 114, 71));
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
        });
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveTableToTxtFileBtn)
                .addGap(18, 18, 18)
                .addComponent(cancelBtn)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveTableToTxtFileBtn)
                    .addComponent(cancelBtn))
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productConsignorFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void timesFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void saveTableToTxtFileBtnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            FileWriter fileWriter = new FileWriter("productData.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Item item : itemList) {
                String productID = item.getProductID();
                String productName = item.getProductName();
                int quantity = item.getQuantity();
                int times = item.getTimes();
                double price = item.getCategory().getDefaultPrice() * quantity * times;
                String category = item.getCategory().getCategoryName();
                String consignor = item.getConsignor();

                // Ghi thông tin sản phẩm vào file dưới dạng CSV
                String productData = String.format("%s,%s,%d,%d,%.2f,%s,%s", productID, productName, quantity, times, price, category, consignor);
                bufferedWriter.write(productData);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            JOptionPane.showMessageDialog(this, "Product data saved to file successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving product data to file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void tableShowProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableShowProductsMouseClicked

    }

    private void tableShowProductsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableShowProductsKeyReleased
        // TODO add your handling code here:
        tableShowProductsMouseClicked(null);
    }//GEN-LAST:event_tableShowProductsKeyReleased

    private Category getCategoryByName(String categoryName) {
        switch (categoryName) {
            case "Book":
                return new Book();
            case "Electronic":
                return new Electronic();
            case "Clothes":
                return new Clothes();
            default:
                return null;
        }
    }

    private void clearFields() {
        productIDField.setText("");
        productNameField.setText("");
        timesField.setText("");
        productQuantityField.setText("");
        productCategoryComboBox.setSelectedIndex(0);
        productConsignorField.setText("");
    }
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String productID = productIDField.getText();
            String productName = productNameField.getText();
            int times = Integer.parseInt(timesField.getText());
            int quantity = Integer.parseInt(productQuantityField.getText());
            Category category = getCategoryByName(productCategoryComboBox.getSelectedItem().toString());
            String consignor = productConsignorField.getText();

            double price = category.getDefaultPrice() * times * quantity;

            Item newItem = new Item(productID, productName, times, quantity, category, consignor);
            itemList.add(newItem);

            Object[] rowData = {
                    newItem.getProductID(),
                    newItem.getProductName(),
                    newItem.getQuantity(),
                    newItem.getTimes(),
                    price,
                    newItem.getCategory().getCategoryName(),
                    newItem.getConsignor()
            };
            tableModel.addRow(rowData);

            clearFields();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int selectedRow = tableShowProducts.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to edit.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String productID = productIDField.getText();
            String productName = productNameField.getText();
            int times = Integer.parseInt(timesField.getText());
            int quantity = Integer.parseInt(productQuantityField.getText());
            Category category = getCategoryByName(productCategoryComboBox.getSelectedItem().toString());
            String consignor = productConsignorField.getText();

            double price = category.getDefaultPrice() * times * quantity;

            Item editedItem = new Item(productID, productName, times, quantity, category, consignor);
            itemList.set(selectedRow, editedItem);

            tableModel.setValueAt(editedItem.getProductID(), selectedRow, 0);
            tableModel.setValueAt(editedItem.getProductName(), selectedRow, 1);
            tableModel.setValueAt(editedItem.getQuantity(), selectedRow, 2);
            tableModel.setValueAt(editedItem.getTimes(), selectedRow, 3);
            tableModel.setValueAt(price, selectedRow, 4);
            tableModel.setValueAt(editedItem.getCategory().getCategoryName(), selectedRow, 5);
            tableModel.setValueAt(editedItem.getConsignor(), selectedRow, 6);

            clearFields();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = tableShowProducts.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        itemList.remove(selectedRow);
        tableModel.removeRow(selectedRow);
        clearFields();
    }

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String searchKeyword = searchField.getText().toLowerCase();
        DefaultTableModel model = (DefaultTableModel) tableShowProducts.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng hiện có trong bảng

        for (Item item : itemList) {
            String productID = item.getProductID().toLowerCase();
            String productName = item.getProductName().toLowerCase();
            String consignor = item.getConsignor().toLowerCase();

            if (productID.contains(searchKeyword) || productName.contains(searchKeyword) || consignor.contains(searchKeyword)) {
                Object[] rowData = {
                        item.getProductID(),
                        item.getProductName(),
                        item.getQuantity(),
                        item.getTimes(),
                        item.getCategory().getDefaultPrice() * item.getQuantity() * item.getTimes(),
                        item.getCategory().getCategoryName(),
                        item.getConsignor()
                };
                model.addRow(rowData);
            }
        }

    }



    private void productNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameFieldActionPerformed



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsignmentManagementJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsignmentManagementJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsignmentManagementJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsignmentManagementJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsignmentManagementJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel introProject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> productCategoryComboBox;
    private javax.swing.JTextField productConsignorField;
    private javax.swing.JTextField productIDField;
    private javax.swing.JTextField productNameField;
    private javax.swing.JTextField productQuantityField;
    private javax.swing.JButton saveTableToTxtFileBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JTable tableShowProducts;
    private javax.swing.JTextField timesField;
    // End of variables declaration//GEN-END:variables
}