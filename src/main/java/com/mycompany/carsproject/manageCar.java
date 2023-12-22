/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.carsproject;

import com.mycompany.carsproject.Object.Car;
import com.mycompany.carsproject.Object.Car_DAO;
import com.mycompany.carsproject.Object.Customer;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manhl
 */
public class manageCar extends javax.swing.JFrame {
    private Car_DAO carDAO;
    /**
     * Creates new form manageCar
     */
    public manageCar() {
        carDAO = new Car_DAO();
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Gọi phương thức để hiển thị dữ liệu từ danh sách xe lên JTable
        
    }
    private void clearTextFields() {
        Text_Car_ID.setText("");
        Text_Brand.setText("");
        Text_Model.setText("");
        Choose_Status.setSelectedIndex(0); // Set về index đầu tiên hoặc giá trị mặc định
        Text_plate.setText("");
        Text_Price.setText("");
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Text_Car_ID = new javax.swing.JTextField();
        Text_Brand = new javax.swing.JTextField();
        Text_Model = new javax.swing.JTextField();
        Choose_Status = new javax.swing.JComboBox<>();
        Add = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        Clear_text_filed = new javax.swing.JButton();
        Text_Price = new javax.swing.JTextField();
        Text_plate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý xe");

        jLabel3.setText("Mã xe");

        jLabel4.setText("Nhãn hiệu");

        jLabel5.setText("Dòng");

        jLabel6.setText("Trạng thái");

        jLabel7.setText("Giá thuê");

        Text_Car_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_Car_IDActionPerformed(evt);
            }
        });

        Text_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_BrandActionPerformed(evt);
            }
        });

        Text_Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_ModelActionPerformed(evt);
            }
        });

        Choose_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1\t", "0" }));
        Choose_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Choose_StatusActionPerformed(evt);
            }
        });

        Add.setText("Thêm");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Edit.setText("Sửa");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setText("Xóa");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setText("Cập nhật");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Show.setText("Xem");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        Clear_text_filed.setText("Làm mới");
        Clear_text_filed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_text_filedActionPerformed(evt);
            }
        });

        Text_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_PriceActionPerformed(evt);
            }
        });

        Text_plate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_plateActionPerformed(evt);
            }
        });

        jLabel2.setText("Biển kiểm soát");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Car_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Text_plate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Model, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Choose_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Text_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(Clear_text_filed)
                        .addGap(18, 18, 18)
                        .addComponent(Add)
                        .addGap(18, 18, 18)
                        .addComponent(Edit)
                        .addGap(18, 18, 18)
                        .addComponent(Delete)
                        .addGap(18, 18, 18)
                        .addComponent(Update)
                        .addGap(18, 18, 18)
                        .addComponent(Show)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Car_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Choose_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Text_plate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Edit)
                    .addComponent(Delete)
                    .addComponent(Update)
                    .addComponent(Show)
                    .addComponent(Clear_text_filed))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã xe", "Nhãn hiệu", "Dòng", "Trạng thái", "Biển kiểm soát", "Giá thuê"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Back.setText("< Trở về");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Danh sách xe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        String carID = Text_Car_ID.getText();
        String brand = Text_Brand.getText();
        String model = Text_Model.getText();
        // Lấy giá trị từ checkbox (ví dụ: có được chọn hay không)
        boolean carStatus = "1".equals(Choose_Status.getSelectedItem().toString().trim());

        String licensePlate = Text_plate.getText();
        

    // Kiểm tra xem có bỏ trống ID không
        float price;
        try {
            price = Float.parseFloat(Text_Price.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá không hợp lệ. Vui lòng nhập một số.");
            return;
        }

    // Kiểm tra xem có bỏ trống ID không
        if (carID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã xe không được để trống.");
            return;
        }
         if (!carDAO.isCarIDExists(carID)) {
            JOptionPane.showMessageDialog(this, "Không được phép sửa mã xe.");
            return;
        }

        // Kiểm tra xem ID có trùng với bất kỳ xe nào trong danh sách không
        // Tiếp tục cập nhật thông tin xe
        // Tạo một đối tượng Car mới
        Car carToUpdate = new Car(carID, brand, model, carStatus, licensePlate, price);
    // Gọi phương thức DAO để cập nhật xe trong cơ sở dữ liệu
        carDAO.updateCar(carToUpdate);
        JOptionPane.showMessageDialog(this, "Cập nhật thông tin xe thành công!");
        clearTextFields();
        UpdateActionPerformed(evt);
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
          // Lấy giá trị từ JTextField txtCarID
        String carID = Text_Car_ID.getText();

        // Kiểm tra xem carID có giá trị hay không
        if (!carID.isEmpty()) {
        // Gọi phương thức deleteCar của đối tượng carDAO để xóa xe từ cơ sở dữ liệu
            carDAO.deleteCar(carID);
            JOptionPane.showMessageDialog(this, "Xóa xe thành công!");
        // Làm mới dữ liệu trên giao diện để hiển thị danh sách xe đã được cập nhật
            clearTextFields();
            UpdateActionPerformed(evt);

        } else {
        // Hiển thị thông báo lỗi nếu carID trống
            JOptionPane.showMessageDialog(this, "Mã xe không được để trống.");
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        List<Car> cars = carDAO.getAllCars();

        // Tạo một DefaultTableModel cho jTable1
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
        // Xóa các hàng hiện tại từ bảng
        model.setRowCount(0);

        // Điền bảng với dữ liệu từ danh sách khách hàng
        for (Car car : cars) {
            Object[] row = {
                 car.getCarID(),
                 car.getBrand(),
                 car.getModel(),
                 car.isCarStatus(),
                 car.getLicensePlate(),
                 car.getPrice()
            };
            model.addRow(row);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
          choiceForm choiceform = new choiceForm();

    // Hiển thị JFrame manageCustomers
        choiceform.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void Choose_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Choose_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Choose_StatusActionPerformed

    private void Clear_text_filedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_text_filedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Clear_text_filedActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String carID = Text_Car_ID.getText();
        String brand = Text_Brand.getText();
        String model = Text_Model.getText();
    
    // Lấy giá trị từ JComboBox và chuyển đổi sang kiểu boolean
        boolean carStatus = "1".equals(Choose_Status.getSelectedItem().toString().trim());


        String licensePlate = Text_plate.getText();
    
        float price;
        try {
            price = Float.parseFloat(Text_Price.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Giá không hợp lệ. Vui lòng nhập một số.");
            return;
        }

        // Kiểm tra xem có ô nào đó trống không
        if (carID.isEmpty() || brand.isEmpty() || model.isEmpty() || licensePlate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin.");
            return;
        }

        // Kiểm tra dữ liệu nếu cần thiết
        if (carDAO.isCarIDExists(carID)) {
            JOptionPane.showMessageDialog(this, "Mã xe đã tồn tại trong danh sách. Vui lòng chọn mã khác.");
            return;
        }

        // Tạo một đối tượng Car mới
        Car carMoi = new Car(carID, brand, model, carStatus, licensePlate, price);
    
        // Gọi phương thức DAO để thêm xe vào cơ sở dữ liệu
        carDAO.addCar(carMoi);

        // Cập nhật bảng để hiển thị dữ liệu đã cập nhật
        UpdateActionPerformed(evt);

        JOptionPane.showMessageDialog(this, "Thêm xe thành công!");
        clearTextFields();
    }//GEN-LAST:event_AddActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            String carID = jTable1.getValueAt(selectedRow, 0).toString();
            String brand = jTable1.getValueAt(selectedRow, 1).toString();
            String model = jTable1.getValueAt(selectedRow, 2).toString();
            boolean carStatus = (boolean) jTable1.getValueAt(selectedRow, 3);
            String licensePlate = jTable1.getValueAt(selectedRow, 4).toString();
            float price = Float.parseFloat(jTable1.getValueAt(selectedRow, 5).toString());

        // Display the information in your text fields
            Text_Car_ID.setText(carID);
            Text_Brand.setText(brand);
            Text_Model.setText(model);
        
        // Convert car status to "Available" or "Booked"
            Choose_Status.setSelectedItem(carStatus ? "1" : "0");

            Text_plate.setText(licensePlate);
            Text_Price.setText(String.valueOf(price));
        } else {
            JOptionPane.showMessageDialog(this, "Chọn một hàng để hiển thị thông tin.");
        }
    }//GEN-LAST:event_ShowActionPerformed

    private void Text_plateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_plateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_plateActionPerformed

    private void Text_Car_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_Car_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_Car_IDActionPerformed

    private void Text_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_BrandActionPerformed

    private void Text_ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_ModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_ModelActionPerformed

    private void Text_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_PriceActionPerformed

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
            java.util.logging.Logger.getLogger(manageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JComboBox<String> Choose_Status;
    private javax.swing.JButton Clear_text_filed;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Show;
    private javax.swing.JTextField Text_Brand;
    private javax.swing.JTextField Text_Car_ID;
    private javax.swing.JTextField Text_Model;
    private javax.swing.JTextField Text_Price;
    private javax.swing.JTextField Text_plate;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
