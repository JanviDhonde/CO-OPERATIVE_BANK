/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;

/**
 *
 * @author Hemaa
 */
public class transfer extends javax.swing.JFrame {
Connection con = null;
PreparedStatement pre = null;
ResultSet res = null;
double newbalance1 ;
double newbalance2 ;
double fromoldbalance ;
double tooldbalance ;
    public transfer() {
        initComponents();
        date();
        done.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        confirmamount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fromidcard = new javax.swing.JTextField();
        transferamount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        toaccountnumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fromaccountnumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        bransh = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        done = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transfer");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BankingApplication");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transfer Your Money", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("$");

        jLabel7.setText("Transfer amount : ");

        jLabel8.setText("Confirm amount : ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("To_AccountNumber : ");

        confirmamount.setEditable(false);
        confirmamount.setEnabled(false);
        confirmamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confirmamountKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("$");

        fromidcard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fromidcardKeyTyped(evt);
            }
        });

        transferamount.setEditable(false);
        transferamount.setEnabled(false);
        transferamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                transferamountKeyTyped(evt);
            }
        });

        jLabel2.setText("Client_Idcard : ");

        toaccountnumber.setEditable(false);
        toaccountnumber.setEnabled(false);
        toaccountnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toaccountnumberKeyTyped(evt);
            }
        });

        jLabel10.setText("Transfer code : ");

        code.setEditable(false);
        code.setEnabled(false);

        jLabel11.setText("Date : ");

        date.setEditable(false);

        jLabel3.setText("Client_ AccountNumber : ");

        fromaccountnumber.setEditable(false);
        fromaccountnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fromaccountnumberKeyTyped(evt);
            }
        });

        jLabel12.setText("Transfer Bransh : ");

        bransh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bransh : ", "Damanhour", "Cairo", "Elmansoura", "Alexandria", "Kafr Elshekh" }));
        bransh.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fromidcard, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fromaccountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(transferamount, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(toaccountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(confirmamount, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(bransh, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(code, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fromidcard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fromaccountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(toaccountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(transferamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(confirmamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(bransh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        done.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(done)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(638, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(fromidcard.getText().equals("")){
  JOptionPane.showMessageDialog(null,"Complete Your Information","Missing Information",2);
        }
        else if (fromidcard.getText().length()!=14){
  JOptionPane.showMessageDialog(null,"Id_card should be 14 numbers","Wrong information",2);
        }
        else {
            String sql = "select * from client where IDCARD='"+fromidcard.getText()+"' ";
            try{
                con=Connect.connect();
                pre=con.prepareStatement(sql);
                res=pre.executeQuery();
                if(res.next()){
                    JOptionPane.showMessageDialog(null,"  Allawed to use","Success Operation",1);
                    fromaccountnumber.setText(res.getString("ACCOUNT_NUMBER"));
                    fromaccountnumber.setEnabled(true);
                    fromaccountnumber.setEditable(false);
                     toaccountnumber.setEnabled(true);
                toaccountnumber.setEditable(true);
                transferamount.setEnabled(true);
                transferamount.setEditable(true);
                confirmamount.setEnabled(true);
                confirmamount.setEditable(true);
                code.setEnabled(true);
                code.setEditable(true);
                date.setEnabled(true);
                done.setEnabled(true);
                bransh.setEnabled(true);
                }else {
            JOptionPane.showMessageDialog(null,"You have not Bank account\n","Wrong Information",2);
                } 
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void confirmamountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmamountKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_confirmamountKeyTyped

    private void fromidcardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromidcardKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_fromidcardKeyTyped

    private void transferamountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transferamountKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_transferamountKeyTyped

    private void toaccountnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toaccountnumberKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_toaccountnumberKeyTyped

    private void fromaccountnumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromaccountnumberKeyTyped
char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_fromaccountnumberKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
if(fromidcard.getText().equals("")||fromaccountnumber.getText().equals("")||
toaccountnumber.getText().equals("")||transferamount.getText().equals("")||
confirmamount.getText().equals("")||code.getText().equals("")){
JOptionPane.showMessageDialog(null,"Complete Your Information","Missing Information",2);
}else if(fromaccountnumber.getText().length()!=11||toaccountnumber.getText().length()!=11){
 JOptionPane.showMessageDialog(null,"Account number should be 11 numbers ","Wrong Information",2);
    }else if(Integer.parseInt(transferamount.getText())<100){
JOptionPane.showMessageDialog(null,"Transfer amount should be geater than or equal 100$ ","Failed Operation",2);    
    }else if(!transferamount.getText().equals(confirmamount.getText())){
JOptionPane.showMessageDialog(null,"Transfer amount & Confirm amount are not equal","Wrong Information",2);        
    }else {
        String sql4="select * from account where ACCOUNT_NUMBER='"+toaccountnumber.getText()+"' ";
        String sql = "select ACCOUNT_BALANCE from account where ACCOUNT_NUMBER='"+fromaccountnumber.getText()+"' ";
        try{
        con=Connect.connect();
        
        pre=con.prepareStatement(sql4);
        res=pre.executeQuery();
        if(res.next()){
        pre=con.prepareStatement(sql);
        res=pre.executeQuery();
        if(res.next()){
        fromoldbalance=Double.parseDouble(res.getString("ACCOUNT_BALANCE"));
        if(Double.parseDouble(res.getString("ACCOUNT_BALANCE"))>=Double.parseDouble(transferamount.getText())){
        newbalance1 = Double.parseDouble(res.getString("ACCOUNT_BALANCE"))-Double.parseDouble(transferamount.getText());    
        String sql1 = "update account set ACCOUNT_BALANCE='"+newbalance1+"' where ACCOUNT_NUMBER='"+fromaccountnumber.getText()+"' ";
        pre=con.prepareStatement(sql1);
        pre.execute();
String sql2 = "select ACCOUNT_BALANCE from account where ACCOUNT_NUMBER='"+toaccountnumber.getText()+"' ";
       pre=con.prepareStatement(sql2);
       res=pre.executeQuery();
   if(res.next()){
    tooldbalance= Double.parseDouble(res.getString("ACCOUNT_BALANCE"));   
    newbalance2 = Double.parseDouble(res.getString("ACCOUNT_BALANCE"))+Double.parseDouble(transferamount.getText());
String sql3 = "update account set ACCOUNT_BALANCE='"+newbalance2+"' where ACCOUNT_NUMBER='"+toaccountnumber.getText()+"' ";
   pre=con.prepareStatement(sql3);
   pre.execute();    
   JOptionPane.showMessageDialog(null,"Money has been Transfered successfully","Success Operation",1);
   sound();
   insert();
   op();
   New();
   }
        } 
        }
        }else{
   JOptionPane.showMessageDialog(null,"Account number where You want to send money is Wrong","Not Found",2);      
        }
        Connect.close(con);
        }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
        }
    }   
    }//GEN-LAST:event_doneActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
fromidcard.setText("");
toaccountnumber.setText("");
transferamount.setText("");
confirmamount.setText("");
code.setText("");
bransh.setSelectedIndex(0);
toaccountnumber.setEnabled(false);
fromaccountnumber.setEnabled(false);
transferamount.setEnabled(false);
confirmamount.setEnabled(false);
code.setEnabled(false);
bransh.setEnabled(false);
fromaccountnumber.setEditable(false);
toaccountnumber.setEditable(false);
transferamount.setEditable(false);
confirmamount.setEditable(false);
code.setEditable(false);
bransh.setEditable(false);
done.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bransh;
    private javax.swing.JTextField code;
    private javax.swing.JTextField confirmamount;
    private javax.swing.JTextField date;
    private javax.swing.JButton done;
    private javax.swing.JTextField fromaccountnumber;
    private javax.swing.JTextField fromidcard;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField toaccountnumber;
    private javax.swing.JTextField transferamount;
    // End of variables declaration//GEN-END:variables
    private void date() {
      Date d = new Date();
      SimpleDateFormat dd = new SimpleDateFormat("dd-MM-yyyy");
      date.setText(dd.format(d));
    }
      private void insert() {
  String sql = "insert into transfer (FROMIDCARD,FROMACCOUNTNUMBER,TOACCOUNTNUMBER,TRANSFERAMOUNT,CODE,FROMOLDBALANCE,FROMNEWBALANCE,TOOLDBALANCE,TONEWBALANCE,BRANSH,OPERATION,DATE) values ('"+fromidcard.getText()+"' ,'"+fromaccountnumber.getText()+"' , '"+toaccountnumber.getText()+"' ,'"+transferamount.getText()+"' ,'"+code.getText()+"' ,'"+fromoldbalance+"' ,'"+newbalance1+"' ,'"+tooldbalance+"' ,'"+newbalance2+"' ,'"+bransh.getSelectedItem()+"' ,'Transfer' , '"+date.getText()+"')";
  try{
pre=con.prepareStatement(sql);
pre.execute();
  } catch(Exception e){
 JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);      
  }}
    private void New() {
     fromidcard.setText("");
     fromaccountnumber.setText("");
     toaccountnumber.setText("");
     transferamount.setText("");
     confirmamount.setText("");
     code.setText("");
     toaccountnumber.setEnabled(false);
     transferamount.setEnabled(false);
     confirmamount.setEnabled(false);
     code.setEnabled(false);
     bransh.setSelectedIndex(0);
    }
     private void sound() {
      File in ;
      try{
     in =new File("C:\\Users\\Hemaa\\Documents\\NetBeansProjects\\BankingApplication\\src\\bankingapplication\\atm-2249.mp3");
     FileInputStream f = new FileInputStream(in);
     BufferedInputStream b = new BufferedInputStream(f);
     Player play = new Player(b);
     play.play();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
}
}
    private void op() {
     String sql = "insert into op (FROMIDCARD,FROMACCOUNTNUMBER,TOACCOUNTNUMBER,OPERATION,AMOUNT,FROMOLDBALANCE,FROMNEWBALANCE,TOOLDBALANCE,TONEWBALANCE,BRANSH,CODE,DATE) values ('"+fromidcard.getText()+"' ,'"+fromaccountnumber.getText()+"' , '"+toaccountnumber.getText()+"' , 'Transfer' ,'"+transferamount.getText()+"' ,'"+fromoldbalance+"' ,'"+newbalance1+"' ,'"+tooldbalance+"' ,'"+newbalance2+"' ,'"+bransh.getSelectedItem()+"' ,'"+code.getText()+"' ,'"+date.getText()+"' )";
    try{
    pre=con.prepareStatement(sql);
    pre.execute();
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
    }
    }
}
