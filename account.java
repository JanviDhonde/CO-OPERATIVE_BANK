/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import sun.audio.*;

/**
 *
 * @author Hemaa
 */
public class account extends javax.swing.JFrame {
String gender = "";
String status = "";
Connection con = null;
PreparedStatement pre= null;
ResultSet res = null;
    public account() {
        initComponents();
        date();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        male = new javax.swing.JCheckBox();
        date = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox<>();
        number = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        female = new javax.swing.JCheckBox();
        marry = new javax.swing.JCheckBox();
        idcard = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mothername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fathername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        unmarry = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        day = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        balance1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taccount = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        update2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BankingApplication");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Client status : ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        buttonGroup2.add(male);
        male.setText("Male");
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        date.setEditable(false);
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 193, -1));
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 27, 193, -1));

        jLabel7.setText("Client phone : ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel11.setText("Client gender : ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year : ", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        jPanel2.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                numberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberKeyTyped(evt);
            }
        });
        jPanel2.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 103, 193, -1));

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 193, -1));

        buttonGroup2.add(female);
        female.setText("Female");
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        buttonGroup1.add(marry);
        marry.setText("Married");
        jPanel2.add(marry, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        idcard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idcardKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idcardKeyTyped(evt);
            }
        });
        jPanel2.add(idcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 65, 193, -1));

        jLabel5.setText("Client DOB : ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel2.add(mothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 193, -1));

        jLabel6.setText("Client address : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel9.setText("Mother name : ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel3.setText("Client id_card : ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 68, -1, -1));
        jPanel2.add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 193, -1));

        jLabel12.setText("Account Date : ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel8.setText("Father name : ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        buttonGroup1.add(unmarry);
        unmarry.setText("unMarried");
        jPanel2.add(unmarry, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jLabel2.setText("Client name : ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 30, -1, -1));

        jLabel4.setText("Account type : ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel13.setText("Account number : ");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 106, -1, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Account Type : ", "Saving account", "Current account" }));
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 140, 130, -1));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 190, 60));

        jLabel14.setText("Client balance : ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day : ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month : ", "Jan", "Fab", "Mar", "Apr", "May", "Jon", "Jul", "Oug", "Sep", "Oct", "Nov", "Dec" }));
        jPanel2.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));
        jPanel2.add(balance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 193, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 13, 83, -1));

        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setText("Delete account");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 13, -1, -1));

        add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add.setText("Create account");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("Update account");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 13, -1, -1));

        taccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        taccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taccountMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(taccount);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        update2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update2.setText("Refresh");
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(update2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        setSize(new java.awt.Dimension(986, 756));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
if(name.getText().equals("")||idcard.getText().equals("")||number.getText().equals("")||
type.getSelectedIndex()==0||day.getSelectedIndex()==0||month.getSelectedIndex()==0||
year.getSelectedIndex()==0||phone.getText().equals("")||address.getText().equals("")||
fathername.getText().equals("")||mothername.getText().equals("")||date.getText().equals("")
||balance1.getText().equals("")){
 JOptionPane.showMessageDialog(null,"Complete Your Information","Missing Information",2);
}else if (!male.isSelected()&&!female.isSelected()){
JOptionPane.showMessageDialog(null,"Select Your Gender","Missing Information",2);    
}else if (!marry.isSelected()&&!unmarry.isSelected()){
JOptionPane.showMessageDialog(null,"Select Your Status","Missing Information",2);    
}else {
    String sql = "select * from client where IDCARD='"+idcard.getText()+"'";
    String sql1 = "select * from client where ACCOUNT_NUMBER='"+number.getText()+"'";
    if(male.isSelected())gender="Male";
    else gender="Female";
    if(marry.isSelected())status="Married";
    else status = "unMarried";
    String sql2 = "insert into client (ACCOUNT_NUMBER,NAME,IDCARD,DOB,ADDRESS,PHONE,FATHERNAME,MOTHERNAME,STATUS,GENDER,DATE) values('"+number.getText()+"','"+name.getText()+"','"+idcard.getText()+"','"+day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem()+"','"+address.getText()+"','"+phone.getText()+"','"+fathername.getText()+"','"+mothername.getText()+"','"+status+"','"+gender+"','"+date.getText()+"')";
    String sql3 = "insert into account (ACCOUNT_NUMBER,ACCOUNT_TYPE,ACCOUNT_BALANCE,DATE) values ('"+number.getText()+"','"+type.getSelectedItem()+"','"+balance1.getText()+"','"+date.getText()+"')";
    con=Connect.connect();
    try{
    pre=con.prepareStatement(sql);
    res=pre.executeQuery();
    if(res.next()){
   JOptionPane.showMessageDialog(null,"This Client registered before","Wrong Information",2);
    }else {
    pre=con.prepareStatement(sql1);
    res=pre.executeQuery();
     if(res.next()){
   JOptionPane.showMessageDialog(null,"This AccountNumber registered before","Wrong Information",2);    
     }else {
    pre=con.prepareStatement(sql2);
    pre.execute();
    JOptionPane.showMessageDialog(null,"Account has been created successfully","Success Operation",1);
    pre=con.prepareStatement(sql3);
    pre.execute();refresh();
    Connect.close(con);
    New();
     }    
    }
        
    }catch(Exception e){
 JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);       
    }
}
    }//GEN-LAST:event_addActionPerformed

    private void idcardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idcardKeyTyped
 char c = evt.getKeyChar();
 if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
     getToolkit().beep();
     evt.consume();
 }
    }//GEN-LAST:event_idcardKeyTyped

    private void numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyTyped
 char c = evt.getKeyChar();
 if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
     getToolkit().beep();
     evt.consume();}
    }//GEN-LAST:event_numberKeyTyped

    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
 char c = evt.getKeyChar();
 if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
     getToolkit().beep();
     evt.consume();}
    }//GEN-LAST:event_phoneKeyTyped

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
if(number.getText().equals("")||idcard.getText().equals("")){
JOptionPane.showMessageDialog(null,"Enter Id_card and AccountNumber you want to delete","Missing Inforamtion",2);    
     }else {
    con=Connect.connect();
     String sql1 = "select * from client where ACCOUNT_NUMBER='"+number.getText()+"' and IDCARD='"+idcard.getText()+"'";
     String sql2= "delete from client where IDCARD='"+idcard.getText()+"'";
     String sql3= "delete from account where ACCOUNT_NUMBER='"+number.getText()+"'";
     try{
     pre=con.prepareStatement(sql1);
     res=pre.executeQuery();
     if(res.next()){
     int i = JOptionPane.showConfirmDialog(null,"Are You sure from deleting this Client");
     if(i==0){
     pre=con.prepareStatement(sql2);
     pre.execute();  
     JOptionPane.showMessageDialog(null,"Account has been deleted successfully","Success Operation",1);
     pre=con.prepareStatement(sql3);
     pre.execute();
     refresh();
     Connect.close(con);
     New();
     }
     }else {
    JOptionPane.showMessageDialog(null,"Wrong AccountNumber or Id_card\n\nThis Client is not registered","Wrong Information",2);
     }
     Connect.close(con);
     }catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);    
     }
}
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
 DefaultTableModel model = (DefaultTableModel) taccount.getModel();
      while(model.getRowCount()>0){
          for(int i =0;i<model.getRowCount();i++){
              model.removeRow(i);
          }
      }
    }//GEN-LAST:event_clearActionPerformed

    private void numberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyPressed
      con=Connect.connect();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String sql = "select ACCOUNT_NUMBER,ACCOUNT_TYPE,ACCOUNT_BALANCE,DATE from account where ACCOUNT_NUMBER='"+number.getText()+"'";
            try{
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            taccount.setModel(DbUtils.resultSetToTableModel(res));
           
            Connect.close(con);
            }catch(Exception e){
       JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
        }
        }
    }//GEN-LAST:event_numberKeyPressed

    private void idcardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idcardKeyPressed
      con=Connect.connect();
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String sql = "select NAME,IDCARD,ACCOUNT_NUMBER,ADDRESS,PHONE,STATUS,GENDER from client where IDCARD='"+idcard.getText()+"'";
            try{
            pre=con.prepareStatement(sql);
            res=pre.executeQuery();
            taccount.setModel(DbUtils.resultSetToTableModel(res));
            Connect.close(con);
            }catch(Exception e){
       JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
        }
        }
    }//GEN-LAST:event_idcardKeyPressed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
 if(marry.isSelected())status="Married";
 if(unmarry.isSelected())status="unMarried";
        if(idcard.getText().equals("")||number.getText().equals("")||name.getText().equals("")||
 phone.getText().equals("")||address.getText().equals("")||
 date.getText().equals("")||fathername.getText().equals("")||mothername.getText().equals("")||
 day.getSelectedIndex()==0||month.getSelectedIndex()==0
 ||year.getSelectedIndex()==0){
 JOptionPane.showMessageDialog(null,"Complete Your Information","Missing Information",2); 
     }else {
     String sql = "select * from client where IDCARD='"+idcard.getText()+"'";
     String sql1 = "update client set PHONE='"+phone.getText()+"' , ADDRESS='"+address.getText()+"' , STATUS='"+status+"' where IDCARD='"+idcard.getText()+"'" ; 
     String sql2 = "update account set ACCOUNT_TYPE='"+type.getSelectedItem()+"' where ACCOUNT_NUMBER='"+number.getText()+"'";
     con=Connect.connect();
     try{
      pre=con.prepareStatement(sql);
      res=pre.executeQuery();
      if(res.next()){
      pre=con.prepareStatement(sql1);
      pre.execute();
      JOptionPane.showMessageDialog(null,"Account has been Updated successfully","Success Operation",1);
      pre=con.prepareStatement(sql2);
      pre.execute();
      refresh();
      Connect.close(con);
      New();
      }
     }catch(Exception e){
  JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);        
     }
 }      
    }//GEN-LAST:event_updateActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
refresh();
    }//GEN-LAST:event_update2ActionPerformed

    private void taccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taccountMouseClicked
      int row  = taccount.getSelectedRow();
      String t = taccount.getModel().getValueAt(row, 1).toString();
      String sql = "select * from client where IDCARD ='"+t+"'";
      String t1 = taccount.getModel().getValueAt(row, 0).toString();
      String sql1 = "select * from account where ACCOUNT_NUMBER='"+t1+"'";
      try{
         con=Connect.connect();
          
         pre=con.prepareStatement(sql);
         res=pre.executeQuery();
         if(res.next()){
             String Idcard = res.getString("IDCARD");
             idcard.setText(Idcard);
             String Name = res.getString("NAME");
             name.setText(Name);
             String Number = res.getString("ACCOUNT_NUMBER");
             number.setText(Number);
             String Date = res.getString("DATE");
             date.setText(Date);
             date.setEditable(false);
             String Day = res.getString("DOB").split("-")[0];
             day.setSelectedItem(Day);
             String Month = res.getString("DOB").split("-")[1];
             month.setSelectedItem(Month);
             String Year = res.getString("DOB").split("-")[2];
             year.setSelectedItem(Year);
             String Address = res.getString("ADDRESS");
             address.setText(Address);
             String Phone = res.getString("PHONE");
             phone.setText(Phone);
             String Father = res.getString("FATHERNAME");
             fathername.setText(Father);
             String Mother = res.getString("MOTHERNAME");
             mothername.setText(Mother);
             String Gender = res.getString("GENDER");
             if(Gender.equals("Male"))male.setSelected(true);
             else if(Gender.equals("Female"))female.setSelected(true);
             String Status = res.getString("STATUS");
             if(Status.equals("Married"))marry.setSelected(true);
             else if(Status.equals("unMarried"))unmarry.setSelected(true);
             pre=con.prepareStatement(sql1);
         res=pre.executeQuery();
         if(res.next()){
             String Type = res.getString("ACCOUNT_TYPE");
             type.setSelectedItem(Type);
             String Balance = res.getString("ACCOUNT_BALANCE");
             balance1.setText(Balance);
            }
             Connect.close(con);
             name.setEnabled(true);
             day.setEnabled(true);
             month.setEnabled(true);;
             year.setEnabled(true);
             address.setEnabled(true);
             phone.setEnabled(true);
             fathername.setEnabled(true);
             mothername.setEnabled(true);
             type.setEnabled(true);
             balance1.setEnabled(true);
             male.setEnabled(true);
             female.setEnabled(true);
             marry.setEnabled(true);
             unmarry.setEnabled(true);
             date.setEnabled(true);
         }
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e.getMessage(),"Error",2);
      }
    }//GEN-LAST:event_taccountMouseClicked

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
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton add;
    public static javax.swing.JTextArea address;
    public static javax.swing.JTextField balance1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JButton clear;
    public static javax.swing.JTextField date;
    public static javax.swing.JComboBox<String> day;
    public static javax.swing.JButton delete;
    public static javax.swing.JTextField fathername;
    public static javax.swing.JCheckBox female;
    private javax.swing.JTextField idcard;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JCheckBox male;
    public static javax.swing.JCheckBox marry;
    public static javax.swing.JComboBox<String> month;
    public static javax.swing.JTextField mothername;
    public static javax.swing.JTextField name;
    public static javax.swing.JTextField number;
    public static javax.swing.JTextField phone;
    private javax.swing.JTable taccount;
    public static javax.swing.JComboBox<String> type;
    public static javax.swing.JCheckBox unmarry;
    public static javax.swing.JButton update;
    public static javax.swing.JButton update2;
    public static javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables

    private void New() {
      name.setText("");
      idcard.setText("");
      number.setText("");
      address.setText("");
      phone.setText("");
      mothername.setText("");
      fathername.setText("");
      date.setText("");  
      type.setSelectedIndex(0);
      day.setSelectedIndex(0);
      month.setSelectedIndex(0);
      year.setSelectedIndex(0);
      balance1.setText("");
     }

    private void date() {
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        date.setText(day+"-"+month+"-"+year);
    }

    private void refresh() {
      String sql = "select NAME,IDCARD,ACCOUNT_NUMBER,ADDRESS,PHONE,STATUS from client";
      try{
         con=Connect.connect();
         pre=con.prepareStatement(sql);
         res=pre.executeQuery();
         taccount.setModel(DbUtils.resultSetToTableModel(res));
      }catch(Exception e){
       JOptionPane.showMessageDialog(null,e.getMessage(),"Error",2);
      }
    }

}
