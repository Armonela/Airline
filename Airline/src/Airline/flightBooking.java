
package Airline;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;



public class flightBooking extends javax.swing.JFrame {

    
    public flightBooking() {
        initComponents();
        autoid();
        hidden();
    } 
    
    Connection con;
    PreparedStatement pst;
    
   

    private void autoid(){
        
         try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "");
      
           Statement st = con.createStatement();
           ResultSet d = st.executeQuery("select max(flgid) from flight");
           
           d.next();
           String a = d.getString("max(flgid)");
           if( a == null){
               
               flgidd.setText("FLG001");
           }
           else{
               long fid = Long.parseLong(a.substring(3, a.length()));

               
               fid++;
               flgidd.setText("FLG"+ String.format("%03d", fid));
               
           }
            
        }
        catch(Exception ex){
        
        }



    }

    private void hidden(){
        jLabel12.setVisible(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtflg = new javax.swing.JTextField();
        fldate = new com.toedter.calendar.JDateChooser();
        txtsor = new javax.swing.JComboBox<>();
        txtdepa = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdtime = new javax.swing.JTextField();
        txtartime = new javax.swing.JTextField();
        txtcost = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        flgidd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Flight Booking");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 150, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("X");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Flight Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel2.setText("Source");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel3.setText("Depature");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel4.setText("Date");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
        jPanel3.add(txtflg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 150, -1));
        jPanel3.add(fldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 150, -1));

        txtsor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shqiperi", "Greqi", "Itali", "Angli", "Amerike", "Afrike", "Gjermani", "Spanje" }));
        txtsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsorActionPerformed(evt);
            }
        });
        jPanel3.add(txtsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 120, 150, -1));

        txtdepa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shqiperi", "Greqi", "Itali", "Angli", "Amerike", "Afrike", "Gjermani", "Spanje" }));
        jPanel3.add(txtdepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 190, 150, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 330, 310));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Depature Time");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel6.setText("Arrival Time");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel7.setText("Flight Price");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jPanel4.add(txtdtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 150, -1));
        jPanel4.add(txtartime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 150, -1));
        jPanel4.add(txtcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 150, -1));

        jButton1.setText("Flight");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 40));

        jButton2.setText("Reset");
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, 40));

        jButton3.setText("Cancel");
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 204, 0));
        jLabel12.setText("Fluturimi u shtua me sukses");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 210, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 360, 310));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 255));
        jLabel8.setText("Flight ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        flgidd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flgidd.setForeground(new java.awt.Color(255, 0, 0));
        flgidd.setText("jLabel9");
        jPanel1.add(flgidd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(346, 116, 720, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        String idd = flgidd.getText();
        String flname = txtflg.getText();
        String sour = txtsor.getSelectedItem().toString();
        String depa = txtdepa.getSelectedItem().toString();
        
        SimpleDateFormat dat = new SimpleDateFormat("dd-MM-yyyy");
        String date =dat.format(fldate.getDate());

        String depatime = txtdtime.getText();
        String arritime = txtartime.getText();
        String price = txtcost.getText();
        
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "");
           pst = con.prepareStatement("insert into flight(flgid,flgname,source,depa,date,deptime,arritime,flgcost) values(?,?,?,?,?,?,?,?)");
           pst.setString(1,idd);
           pst.setString(2,flname);
           pst.setString(3,sour);
           pst.setString(4,depa);
           pst.setString(5,date);
           pst.setString(6,depatime);
           pst.setString(7,arritime);
           pst.setString(8,price);

           int x = pst.executeUpdate();
           
            if(x > 0){
              JOptionPane.showMessageDialog(this, "The flight was successfully added to the database.");
              jLabel12.setVisible(true);
              autoid();
              //flgidd.setText("");
              txtflg.setText("");
              txtsor.setSelectedIndex(-1);
              txtdepa.setSelectedIndex(-1);
              fldate.setDate(null);
              txtdtime.setText("");
              txtartime.setText("");
              txtcost.setText("");
 
           }
           else{
              JOptionPane.showMessageDialog(this, "Try again!");
           }
            
           
        }
        catch(Exception ex){
           System.err.println(ex);
        } 
  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsorActionPerformed

    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new flightBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fldate;
    private javax.swing.JLabel flgidd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtartime;
    private javax.swing.JTextField txtcost;
    private javax.swing.JComboBox<String> txtdepa;
    private javax.swing.JTextField txtdtime;
    private javax.swing.JTextField txtflg;
    private javax.swing.JComboBox<String> txtsor;
    // End of variables declaration//GEN-END:variables
}
