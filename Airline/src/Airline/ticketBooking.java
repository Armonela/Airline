
package Airline;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;


public class ticketBooking extends javax.swing.JFrame {

    
    public ticketBooking() {
        initComponents();
        autoidcall();
    }

    Connection con;
    PreparedStatement pst;
    
    
    private void autoidcall(){
        
        try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "");
          Statement st = con.createStatement();
          ResultSet qu = st.executeQuery("select Max(ticid) from ticketbook");
          qu.next();
          qu.getString("Max(ticid)");
           if(qu.getString("Max(ticid)") == null){
               
               txtid.setText("TIB001");
           }
           else{
               
               long tid = Long.parseLong(qu.getString("Max(ticid)").substring(3, qu.getString("Max(ticid)").length()));
               
               tid++;
               txtid.setText("TIB"+ String.format("%03d", tid));
           }
          
          
          
        }
        catch(Exception ex){
          System.err.println(ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsor = new javax.swing.JComboBox<>();
        txtdep = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        searid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        flgid = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtfdate = new javax.swing.JTextField();
        txtarri = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ticket Booking ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("X");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.lightGray, null));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Source");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 42, -1));

        jLabel3.setText("Depature");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 55, -1));

        txtsor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shqiperi", "Greqi", "Itali", "Angli", "Amerike", "Afrike", "Gjermani", "Spanje" }));
        jPanel3.add(txtsor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 103, -1));

        txtdep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Shqiperi", "Greqi", "Itali", "Angli", "Amerike", "Afrike", "Gjermani", "Spanje" }));
        jPanel3.add(txtdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 101, -1));

        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 70, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FlgID", "Flg Name", "Source", "Depature", "Date", "Deptime", "Arritime", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setOpaque(false);
        jTable2.setShowGrid(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 410, 160));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Ticket ID");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtid.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 0, 0));
        txtid.setText("AutoIDCallDatabase");
        jPanel3.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Total Price");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("jLabel14");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 430, 340));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, java.awt.Color.lightGray, null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Customer ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setText("First Name");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel6.setText("Last Name");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Flight ID");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel8.setText("Flight Name");
        jLabel8.setName("Flight ID"); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel9.setText("Flight Date");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel4.add(searid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 100, -1));

        jButton2.setText("Find");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 60, 40));

        jLabel10.setText("Arrival Time");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel11.setText("Price");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel12.setText("Seats");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        firstname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        firstname.setText("jLabel13");
        jPanel4.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        lastname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lastname.setText("jLabel14");
        jPanel4.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        flgid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        flgid.setText("jLabel15");
        jPanel4.add(flgid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));
        jPanel4.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 150, -1));
        jPanel4.add(txtfdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));
        jPanel4.add(txtarri, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 150, -1));
        jPanel4.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 150, -1));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jSpinner1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jSpinner1InputMethodTextChanged(evt);
            }
        });
        jPanel4.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, -1));

        jButton3.setText("Ticket Booking");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 260, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(346, 116, 720, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
      String sour = txtsor.getSelectedItem().toString();
      String depa = txtdep.getSelectedItem().toString();  
      
      try{
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "");
         pst = con.prepareStatement("select * from flight where source =? and depa =?");
         pst.setString(1, sour);
         pst.setString(2,depa);
         
         ResultSet d = pst.executeQuery();
         ResultSetMetaData data = d.getMetaData();
         
         int x = data.getColumnCount();
         
         DefaultTableModel mod1 =(DefaultTableModel)jTable2.getModel();
         mod1.setRowCount(0);
         
         if(d.next()){
            Vector v2 = new Vector();
            
            for(int i=0; i<x; i++){
              v2.add(d.getString("flgid"));
              v2.add(d.getString("flgname"));
              v2.add(d.getString("source"));
              v2.add(d.getString("depa"));
              v2.add(d.getString("date"));
              v2.add(d.getString("deptime"));
              v2.add(d.getString("arritime"));
              v2.add(d.getString("flgcost"));
            }
            mod1.addRow(v2);
            
         }
         
         
      }
      catch(Exception ex){
        System.err.println(ex);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        

        //When you are clicking on the displayed row with the following data that are below,
//the data will be populated in the right pane of the interface

        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int x= jTable2.getSelectedRow();
        String idd = model.getValueAt(x, 0).toString();
        String flname = model.getValueAt(x, 1).toString();
        String fdate = model.getValueAt(x, 4).toString();
        String artime = model.getValueAt(x, 6).toString();
        String cost = model.getValueAt(x, 7).toString();
        
        flgid.setText(idd);
        txtfname.setText(flname);
        txtfdate.setText(fdate);
        txtarri.setText(artime);
        txtprice.setText(cost);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String search = searid.getText();
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "");
         pst = con.prepareStatement("select * from newcust where regid=?");
         pst.setString(1, search);
         ResultSet query = pst.executeQuery();
         if(query.next() == true){
           String name = query.getString("fname");
           String lname = query.getString("lname");
           firstname.setText(name);
           lastname.setText(lname);
           
           
         }
         
         
        }
        catch(Exception ex){
          System.err.println(ex);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSpinner1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jSpinner1InputMethodTextChanged
        
    
        
    }//GEN-LAST:event_jSpinner1InputMethodTextChanged

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
      int x = Integer.parseInt(txtprice.getText().toString());
      int y = Integer.parseInt(jSpinner1.getValue().toString());
      
      int total;
      
      total = x*y;
      jLabel14.setText(Integer.toString(total));
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String tic = txtid.getText();
        String ser = searid.getText();
        String name = firstname.getText();
        String last = lastname.getText();
        String flid = flgid.getText();
        String flname = txtfname.getText();
        String fdate = txtfdate.getText();
        String farri = txtarri.getText();
        String pric = txtprice.getText();
        String sets = jSpinner1.getValue().toString();
        String total = jLabel14.getText();
        
        
        try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/airline", "root", "");
          pst = con.prepareStatement("insert into ticketbook(ticid,custid,fname,lname,flgid,flname,fldate,arritime,price,seat,total) values(?,?,?,?,?,?,?,?,?,?,?)");
          pst.setString(1, tic);
          pst.setString(2, ser);
          pst.setString(3, name);
          pst.setString(4, last);
          pst.setString(5, flid);
          pst.setString(6, flname);
          pst.setString(7, fdate);
          pst.setString(8, farri);
          pst.setString(9, pric);
          pst.setString(10, sets);
          pst.setString(11, total);
          
          int x = pst.executeUpdate();
          
           if(x > 0){
               JOptionPane.showMessageDialog(this,"Rezervimi u krye me sukses.");
              
           }
           else{
              JOptionPane.showMessageDialog(this,"Rezervimi deshtoi");
           }
          
          
        }
        catch(Exception ex){
           System.err.println(ex);
        }
             
             
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

        this.setVisible(false);
    }//GEN-LAST:event_jLabel15MouseClicked

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel firstname;
    private javax.swing.JLabel flgid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField searid;
    private javax.swing.JTextField txtarri;
    private javax.swing.JComboBox<String> txtdep;
    private javax.swing.JTextField txtfdate;
    private javax.swing.JTextField txtfname;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtprice;
    private javax.swing.JComboBox<String> txtsor;
    // End of variables declaration//GEN-END:variables
}
