package InterFace;

import code.SqlDBConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.regex.*;    // regex pakage import for chack validation

public final class Customer1 extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Customer1() {
        initComponents();
        conn = SqlDBConnect.connect();
        autoID();
      

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlnic = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txtgender = new javax.swing.JTextField();
        txtmobile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTextn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        namebox = new javax.swing.JLabel();
        NICbox = new javax.swing.JLabel();
        DOBbox = new javax.swing.JLabel();
        genbox = new javax.swing.JLabel();
        natiobox = new javax.swing.JLabel();
        mobox = new javax.swing.JLabel();
        ename = new javax.swing.JLabel();
        enic = new javax.swing.JLabel();
        egender = new javax.swing.JLabel();
        emobileno = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        edob = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        elastname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("First Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("NIC");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("DOB");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("gender");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("nationality");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Mobile no");

        txtfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfnameKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfnameKeyPressed(evt);
            }
        });

        txtlnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlnicKeyReleased(evt);
            }
        });

        txtdob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdobKeyReleased(evt);
            }
        });

        txtgender.setToolTipText("M or F");
        txtgender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgenderKeyReleased(evt);
            }
        });

        txtmobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmobileKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Address");

        jScrollPane1.setViewportView(jEditorPane1);

        jTextn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextnKeyReleased(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));

        namebox.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        namebox.setForeground(new java.awt.Color(255, 0, 0));

        NICbox.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        NICbox.setForeground(new java.awt.Color(255, 0, 0));

        DOBbox.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        DOBbox.setForeground(new java.awt.Color(255, 0, 0));

        genbox.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        genbox.setForeground(new java.awt.Color(255, 0, 0));

        natiobox.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        natiobox.setForeground(new java.awt.Color(255, 0, 0));

        mobox.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        mobox.setForeground(new java.awt.Color(255, 0, 0));

        ename.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        ename.setForeground(new java.awt.Color(204, 0, 0));

        enic.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        enic.setForeground(new java.awt.Color(204, 0, 0));

        egender.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        egender.setForeground(new java.awt.Color(204, 0, 0));

        emobileno.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        emobileno.setForeground(new java.awt.Color(204, 0, 0));

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));

        edob.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        edob.setForeground(new java.awt.Color(204, 0, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Last Name");

        txtlastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtlastnameKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlastnameKeyPressed(evt);
            }
        });

        elastname.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        elastname.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtfname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addComponent(jTextn)
                                .addComponent(txtgender)
                                .addComponent(txtmobile)
                                .addComponent(txtlnic)
                                .addComponent(txtdob)
                                .addComponent(txtlastname)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(natiobox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(genbox, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                        .addGap(182, 182, 182))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(elastname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(DOBbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(NICbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(namebox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(enic, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edob, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(egender, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(mobox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel3)
                                                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel12)
                                                    .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(elastname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel11)
                                                    .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtlnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edob, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NICbox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(DOBbox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(mobox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(genbox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(natiobox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Customer Details");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 102));
        jLabel9.setText("jLabel9");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Customer No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(374, 374, 374))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // customer details add 
            String cutomer_id = jLabel9.getText();
            String name = txtfname.getText();
            String NIC = txtlnic.getText();
            String DOB = txtdob.getText();
            String gender = txtgender.getText();
            String Mobile = txtmobile.getText();
            String natanolity = jTextn.getText();
            String address = jEditorPane1.getText();
            
            

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dpbank?", "root", "");

            pst = con.prepareStatement("insert into customer(cust_id,name,NIC,DOB,gender,mobile,nationality,Address) "
            + "values('" + cutomer_id + "','" + name + "','" + NIC + "','" + DOB + "','" + gender + "','" + Mobile + "','" 
            + natanolity + "','" + address + "')");

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Success");

////////   clear customer detals data //////////////////////////////////////////////////////////////////////////////////            
            jLabel9.setText("");
            txtfname.setText("");
            txtlnic.setText("");
            txtdob.setText("");
            txtgender.setText("");
            txtmobile.setText("");
            jTextn.setText("");
            jEditorPane1.setText("");
            txtlastname.setText("");

            autoID();

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

 //////////////////////////////////////////////////////////////////////////////////////////////////////////////       
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //close window
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtfnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnameKeyPressed
       
    }//GEN-LAST:event_txtfnameKeyPressed

    private void txtfnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnameKeyReleased
         
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtfname.getText());
        if(!match.matches()){
            ename.setText("Name is Incorrect");
                   
        }else{
            ename.setText(null);
        }
     

    }//GEN-LAST:event_txtfnameKeyReleased

    private void txtlastnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlastnameKeyPressed
      
    }//GEN-LAST:event_txtlastnameKeyPressed

    private void txtlastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlastnameKeyReleased
        // Enter value cheack
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtlastname.getText());
        if(!match.matches()){
            elastname.setText("Name is Incorrect");
                   
        }else{
            elastname.setText(null);
        } 
       
    }//GEN-LAST:event_txtlastnameKeyReleased

    private void txtlnicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlnicKeyReleased
        // NIC number cheack 
                String PATTERN = "^[0-9]{0,12}[V]{0,1}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match= patt.matcher(txtlnic.getText());
        if(!match.matches()){
            enic.setText(" NIC number is incorrect");
        }else{
            enic.setText(null);
        }
    }//GEN-LAST:event_txtlnicKeyReleased

    private void txtdobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdobKeyReleased
        // date of birth cheack 
        String PATTERN = "^[0-9]{0,4}[/][0-9]{0,2}[/][0-9]{0,2}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match= patt.matcher(txtdob.getText());
        if(!match.matches()){
            edob.setText("DOB is incorrect");
        }else{
            edob.setText(null);
        }
    }//GEN-LAST:event_txtdobKeyReleased

    private void txtgenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgenderKeyReleased
        // gender cheack
        String PATTERN = "^[M,F]{0,1}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match= patt.matcher(txtgender.getText());
        if(!match.matches()){
            egender.setText("Gender is incorrect");
        }else{
            egender.setText(null);
        }
    }//GEN-LAST:event_txtgenderKeyReleased

    private void txtmobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobileKeyReleased
        // Mobile number cheack
        String PATTERN = "^[0]{0,1}[0-9]{0,9}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match= patt.matcher(txtmobile.getText());
        if(!match.matches()){
            emobileno.setText("Mobile number is incorrect");
        }else{
            emobileno.setText(null);
        }
        
    }//GEN-LAST:event_txtmobileKeyReleased

    private void jTextnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextnKeyReleased
        // TODO add your handling code
        String PATTERN = "^[a-zA-Z]{0,20}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match= patt.matcher(jTextn.getText());
        if(!match.matches()){
            jLabel16.setText("Nationality is incorrect");
        }else{
            jLabel16.setText(null);
        }
        
    }//GEN-LAST:event_jTextnKeyReleased

    Connection con;
    PreparedStatement s;

    //////////////////////////////////////////////////////////////////////////////////////////////////
    //auto genarate customer number
    //when staet the acount firstly give a number to customer
    public void autoID() {
        try {
            String sql = "SELECT Max(cust_id) from customer";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            rs.next();
            if (rs.getString("Max(cust_id)") == null) {

                jLabel9.setText("CN001");
            } else {
                long id = Long.parseLong(rs.getString("Max(cust_id)").substring(2, rs.getString("Max(cust_id)").length()));
                id++;
                jLabel9.setText("CN" + String.format("%03d", id));
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
 /////////////////////////////////////////////////////////////////////////////////////////////////////////   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOBbox;
    private javax.swing.JLabel NICbox;
    private javax.swing.JLabel edob;
    private javax.swing.JLabel egender;
    private javax.swing.JLabel elastname;
    private javax.swing.JLabel emobileno;
    private javax.swing.JLabel ename;
    private javax.swing.JLabel enic;
    private javax.swing.JLabel genbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextn;
    private javax.swing.JLabel mobox;
    private javax.swing.JLabel namebox;
    private javax.swing.JLabel natiobox;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtlnic;
    private javax.swing.JTextField txtmobile;
    // End of variables declaration//GEN-END:variables

}
