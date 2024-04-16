
package Airline;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class updatecust extends javax.swing.JFrame {

   
    public updatecust() {
        initComponents();
    }

    Connection con;
    PreparedStatement pst;
    String path = null;
    byte[] userimages = null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtnid = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        txtcont = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddr = new javax.swing.JTextArea();
        txtdob = new com.toedter.calendar.JDateChooser();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        imagess = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Update Customer Information");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Update Customer"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("First name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 40, -1, -1));

        jLabel3.setText("Last name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 82, -1, -1));

        jLabel4.setText("Gender");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 125, -1, -1));

        jLabel5.setText("NID No");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 170, -1, -1));

        jLabel6.setText("Pass No");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 211, -1, -1));

        jLabel7.setText("DOB");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 257, -1, -1));

        jLabel8.setText("Address");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        jLabel9.setText("Contact");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        jLabel10.setText("Image");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));
        jPanel3.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 165, -1));

        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });
        jPanel3.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 165, -1));
        jPanel3.add(txtnid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 165, -1));
        jPanel3.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 165, -1));
        jPanel3.add(txtcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 120, 200, 20));

        txtaddr.setColumns(20);
        txtaddr.setRows(5);
        jScrollPane1.setViewportView(txtaddr);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 200, 60));
        jPanel3.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 160, -1));

        r1.setText("Male");
        jPanel3.add(r1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, -1));

        r2.setText("Female");
        jPanel3.add(r2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 70, -1));

        imagess.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(imagess, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 120, 120));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, 40));

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 10, 250));

        jButton5.setText("UpdateFoto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 233, -1, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 710, 340));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Customer ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, 20));
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 180, 30));

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 90, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        setBounds(340, 110, 730, 469);
    }// </editor-fold>//GEN-END:initComponents

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        String idd = txtid.getText();
        
        try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "");
          
          pst = con.prepareStatement("select *from newcust where regid=?");
          
          pst.setString(1, idd);
          ResultSet rs = pst.executeQuery();
          
          if(rs.next() == true){
              String name = rs.getString("fname");
              String lstname = rs.getString("lname");
              String gen = rs.getString("gender");
              
              if(gen.equals("Male")){
                  r2.setSelected(false);
                  r1.setSelected(true);
              
              }
              else{
                  r1.setSelected(false);
                  r2.setSelected(true);
              }
              String nid = rs.getString("nid_no");
              String pass = rs.getString("pass_no");
              String dat = rs.getString("dob");
              Date dos = new SimpleDateFormat("dd-MM-yyyy").parse(dat);
              
              String addrs = rs.getString("addr");
              String conts = rs.getString("cont");
              Blob im = rs.getBlob("image");
              
              byte[] x = im.getBytes(1, (int)im.length());
              ImageIcon ico = new ImageIcon(x);
              Image ims = ico.getImage();
              Image icon =ims.getScaledInstance(imagess.getWidth(), imagess.getHeight(), Image.SCALE_SMOOTH);
              ImageIcon newIcon = new ImageIcon(icon);
              
              txtfname.setText(name.trim());
              txtlname.setText(lstname.trim());
              txtnid.setText(nid.trim());
              txtpass.setText(pass.trim());
              txtdob.setDate(dos);
              txtaddr.setText(addrs.trim());
              txtcont.setText(conts.trim());
              imagess.setIcon(newIcon);
              
          }
          
        }
        catch(Exception ex){
            System.err.print(ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String idd =  txtid.getText();
       String name = txtfname.getText();
       String lname = txtlname.getText();
       String gender;
       
       if(r1.isSelected()){
          gender = "Male";
       }
       else{
          gender = "Female";
       }
       String nid = txtnid.getText();
       String pass = txtpass.getText();
       SimpleDateFormat dft = new SimpleDateFormat("dd-MM-yyyy");
       String date = dft.format(txtdob.getDate());
       String addrs = txtaddr.getText();
       String conts = txtcont.getText();
       
       
       try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "");
          pst = con.prepareStatement("update newcust set fname=?,lname=? ,gender=?, nid_no=?, pass_no=?,dob=?, addr=?,cont=? where regid=?");
          pst.setString(1, name);
          pst.setString(2, lname);
          pst.setString(3, gender);
          pst.setString(4, nid);
          pst.setString(5, pass);
          pst.setString(6, date);
          pst.setString(7, addrs);
          pst.setString(8, conts);
          pst.setString(9,idd);
          
          int x = pst.executeUpdate();
          
          if(x > 0){
              JOptionPane.showMessageDialog(this, "The client was successfully updated.");
          }
          else{
              JOptionPane.showMessageDialog(this, "Try again!");
          }
          
          
       }
       catch(Exception ex){
          System.err.println(ex);
       }
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try{
            JFileChooser images = new JFileChooser();
            images.showOpenDialog(null);
            File f = images.getSelectedFile();
            FileNameExtensionFilter fi1 = new FileNameExtensionFilter("*.images", "gpg","png","gift");
            images.addChoosableFileFilter(fi1);
            path = f.getAbsolutePath();
            Image im = ImageIO.read(images.getSelectedFile());
            ImageIcon icon = new ImageIcon(new ImageIcon(im).getImage().getScaledInstance(120,120,Image.SCALE_SMOOTH));
            imagess.setIcon(icon);

            File fx = new File(path);
            FileInputStream in = new FileInputStream(fx);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for(int i; (i=in.read(buf)) != -1; ){
                out.write( buf,0,i);
            }

            userimages = out.toByteArray();

        }
        catch(Exception ex){
            System.err.println(ex);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatecust().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagess;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextArea txtaddr;
    private javax.swing.JTextField txtcont;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtnid;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
