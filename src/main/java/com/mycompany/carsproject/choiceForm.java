/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.carsproject;

import com.mycompany.carsproject.Login.Change_password;
import com.mycompany.carsproject.Login.New_account;
import javax.swing.JOptionPane;

/**
 *
 * @author manhl
 */
public class choiceForm extends javax.swing.JFrame {

    /**
     * Creates new form choiceForm
     */
    public choiceForm() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Manager_cars = new javax.swing.JButton();
        Manager_Customers = new javax.swing.JButton();
        Rental_Car = new javax.swing.JButton();
        Return_car = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Change_Password = new javax.swing.JButton();
        Create_account = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Manager_cars.setText("Quản lý xe ");
        Manager_cars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manager_carsActionPerformed(evt);
            }
        });

        Manager_Customers.setText("Quản lý khách hàng");
        Manager_Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manager_CustomersActionPerformed(evt);
            }
        });

        Rental_Car.setText("Thuê xe");
        Rental_Car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rental_CarActionPerformed(evt);
            }
        });

        Return_car.setText("Trả xe");
        Return_car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_carActionPerformed(evt);
            }
        });

        Exit.setText("Thoát");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Change_Password.setText("Đổi mật khẩu");
        Change_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_PasswordActionPerformed(evt);
            }
        });

        Create_account.setText("Tạo tài khoản mới");
        Create_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_accountActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Công ty dịch vụ cho thuê xe tự lái");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Manager_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(Manager_cars, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Rental_Car, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Create_account, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Return_car, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Change_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Manager_cars, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Manager_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Return_car, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rental_Car, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Change_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Create_account, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Manager_carsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Manager_carsActionPerformed
        // TODO add your handling code here:
        manageCar managecar = new manageCar();

    // Hiển thị JFrame manageCustomers
        managecar.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_Manager_carsActionPerformed

    private void Manager_CustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Manager_CustomersActionPerformed
        // TODO add your handling code here:
        manageCustomers ManageCustomersFrame = new manageCustomers();

    // Hiển thị JFrame manageCustomers
        ManageCustomersFrame.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_Manager_CustomersActionPerformed

    private void Rental_CarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rental_CarActionPerformed
        // TODO add your handling code here:
        RentalForm  rentalForm = new  RentalForm();

    // Hiển thị JFrame manageCustomers
        rentalForm.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_Rental_CarActionPerformed

    private void Return_carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_carActionPerformed
        // TODO add your handling code here:
        returnForm returnform = new returnForm();

    // Hiển thị JFrame manageCustomers
        returnform.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_Return_carActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
          // Hiển thị một hộp thoại xác nhận trước khi thoát
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát không?", "Xác nhận thoát", JOptionPane.YES_NO_OPTION);
    
    // Nếu người dùng chọn "Yes", thoát ứng dụng
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    // Nếu người dùng chọn "No" hoặc đóng hộp thoại, không làm gì cả
    }//GEN-LAST:event_ExitActionPerformed

    private void Change_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_PasswordActionPerformed
        // TODO add your handling code here:
        Change_password change_password = new Change_password();

    // Hiển thị JFrame manageCustomers
        change_password.setVisible(true);
    }//GEN-LAST:event_Change_PasswordActionPerformed

    private void Create_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_accountActionPerformed
        // TODO add your handling code here:
        New_account new_account= new New_account();

    // Hiển thị JFrame manageCustomers
        new_account.setVisible(true);
        
    }//GEN-LAST:event_Create_accountActionPerformed

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
            java.util.logging.Logger.getLogger(choiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choiceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new choiceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change_Password;
    private javax.swing.JButton Create_account;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Manager_Customers;
    private javax.swing.JButton Manager_cars;
    private javax.swing.JButton Rental_Car;
    private javax.swing.JButton Return_car;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}