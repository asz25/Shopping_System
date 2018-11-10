
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awdsa
 */
public class SearchWindow extends javax.swing.JFrame {

    /**
     * Creates new form SearchWindow
     */
    
    ShoppingCartWindow window = new ShoppingCartWindow();
    ArrayList<Customer> custList = new ArrayList<Customer>();
    double total;
    int order;
    int current_index;
    Customer current_customer;
    
    public SearchWindow() {
        initComponents();
    }
    
    public SearchWindow(ArrayList<Customer> custList,double total, int order, ShoppingCartWindow window) {
        initComponents();
        this.custList = custList;
        this.total=total;
        this.order = order;
        this.window = window;
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
        jLabel2 = new javax.swing.JLabel();
        name_jTextField = new javax.swing.JTextField();
        order_jTextField = new javax.swing.JTextField();
        sname_jButton = new javax.swing.JButton();
        sorder_jButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result_jTextArea = new javax.swing.JTextArea();
        modify_jButton = new javax.swing.JButton();
        delete_jButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Search by name");

        jLabel2.setText("Search by order number");

        sname_jButton.setText("Search");
        sname_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sname_jButtonActionPerformed(evt);
            }
        });

        sorder_jButton.setText("Search");
        sorder_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorder_jButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Search Result");

        result_jTextArea.setColumns(20);
        result_jTextArea.setRows(5);
        jScrollPane1.setViewportView(result_jTextArea);

        modify_jButton.setText("Modify");
        modify_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modify_jButtonActionPerformed(evt);
            }
        });

        delete_jButton.setText("Delete");
        delete_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name_jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(order_jTextField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sname_jButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sorder_jButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modify_jButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete_jButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sname_jButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(order_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sorder_jButton))
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modify_jButton)
                        .addGap(18, 18, 18)
                        .addComponent(delete_jButton)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sorder_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorder_jButtonActionPerformed
        int desired_cust = Integer.parseInt(order_jTextField.getText());
        boolean foundIt = false;
        for(int i=0;i<custList.size();i++)
        {
            if(custList.get(i).getOrder()==desired_cust)
            {
                
                result_jTextArea.setText("Order number: " + custList.get(i).getOrder()+"\nCustomer: "+custList.get(i).getTitle()+" "+custList.get(i).getFirstN()+" "+custList.get(i).getLastN()+"\nOrder Cost: "+ String.format("%.2f",custList.get(i).getTotal()));
                foundIt = true;
                current_index = i;
                current_customer = custList.get(current_index);
            }
        }
        
        if(foundIt==false)
        {
            JOptionPane.showMessageDialog(null, "The order number specified did not match", "Order not found", 0);
        }
    }//GEN-LAST:event_sorder_jButtonActionPerformed

    private void sname_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sname_jButtonActionPerformed
        String desired_cust = name_jTextField.getText();
        boolean foundIt = false;
        for(int i=0;i<custList.size();i++)
        {
            String full_name = custList.get(i).getFirstN()+" "+custList.get(i).getLastN();
            if(full_name.equals(desired_cust))
            {
                
                result_jTextArea.setText("Order number: " + custList.get(i).getOrder()+"\nCustomer: "+custList.get(i).getTitle()+" "+custList.get(i).getFirstN()+" "+custList.get(i).getLastN()+"\nOrder Cost: "+ String.format("%.2f",custList.get(i).getTotal()));
                foundIt = true;
                current_index = i;
                current_customer = custList.get(current_index);
            }          
        }
        if(foundIt==false)
        {
            JOptionPane.showMessageDialog(null, "The order under the name specified was not found", "Order not found", 0);
        }
    }//GEN-LAST:event_sname_jButtonActionPerformed

    private void delete_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_jButtonActionPerformed
        custList.remove(current_index);
        dispose();
    }//GEN-LAST:event_delete_jButtonActionPerformed

    private void modify_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modify_jButtonActionPerformed
        CheckOutWindow checkoutwindow = new CheckOutWindow(custList,total,order,this,current_customer);
        checkoutwindow.setVisible(true);
        checkoutwindow.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_modify_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modify_jButton;
    private javax.swing.JTextField name_jTextField;
    private javax.swing.JTextField order_jTextField;
    private javax.swing.JTextArea result_jTextArea;
    private javax.swing.JButton sname_jButton;
    private javax.swing.JButton sorder_jButton;
    // End of variables declaration//GEN-END:variables
}