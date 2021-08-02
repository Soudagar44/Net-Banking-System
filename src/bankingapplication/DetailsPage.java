
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankingapplication;

/**
 *
 * @author Soudagar Londhe
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DetailsPage extends javax.swing.JFrame {
    Statement state;
    int id;
    public DetailsPage()
    {}
    public DetailsPage(int id1) 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        id=id1;
        getHeadName(id1); 
    }
    public void getHeadName(int id1)
    {
        try 
        {
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankingSystem","root","Sauda@8377");
            state=con.createStatement();
            String s1="select name from User_details where cust_id="+id1; 
            ResultSet rs=state.executeQuery(s1);
            if(rs.next())
            {
                String s2;
                s2=rs.getString("name");
                lblwel.setText("Welcome "+s2);
            }
            else
            {}
         
        } 
        catch (Exception ex) 
        {
            System.out.println("Error"); 
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnls = new javax.swing.JPanel();
        btndeposit = new javax.swing.JButton();
        btndetails = new javax.swing.JButton();
        btnwithdrawl = new javax.swing.JButton();
        btnapplyloan = new javax.swing.JButton();
        btntransfer = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        pnlmain = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();
        lbldep = new javax.swing.JLabel();
        lblamt = new javax.swing.JLabel();
        txtamt = new javax.swing.JTextField();
        btndepositmoney = new javax.swing.JButton();
        lblmsg = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        lblwith = new javax.swing.JLabel();
        lblamt1 = new javax.swing.JLabel();
        txtwith = new javax.swing.JTextField();
        btnwithmoney = new javax.swing.JButton();
        lblwithmsg = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        lblloanamt = new javax.swing.JLabel();
        lblloan1 = new javax.swing.JLabel();
        txtloanamt = new javax.swing.JTextField();
        lblloanreason = new javax.swing.JLabel();
        txtloanreason = new javax.swing.JTextField();
        btnapply = new javax.swing.JButton();
        lblloanmsg = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        lbltransferid = new javax.swing.JLabel();
        lblheadtransfer1 = new javax.swing.JLabel();
        txttransferid = new javax.swing.JTextField();
        lbltransferaccno = new javax.swing.JLabel();
        txttransferaccno = new javax.swing.JTextField();
        lbltransferamt = new javax.swing.JLabel();
        txttransferamt = new javax.swing.JTextField();
        btntran = new javax.swing.JButton();
        lbltransfermsg = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdetails = new javax.swing.JTextArea();
        lblbank = new javax.swing.JLabel();
        lblwel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnls.setBackground(new java.awt.Color(204, 204, 204));

        btndeposit.setBackground(new java.awt.Color(102, 102, 0));
        btndeposit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndeposit.setForeground(new java.awt.Color(255, 255, 255));
        btndeposit.setText("DEPOSIT");
        btndeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndepositActionPerformed(evt);
            }
        });

        btndetails.setBackground(new java.awt.Color(102, 102, 0));
        btndetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndetails.setForeground(new java.awt.Color(255, 255, 255));
        btndetails.setText("DETAILS");
        btndetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndetailsActionPerformed(evt);
            }
        });

        btnwithdrawl.setBackground(new java.awt.Color(102, 102, 0));
        btnwithdrawl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnwithdrawl.setForeground(new java.awt.Color(255, 255, 255));
        btnwithdrawl.setText("WITHDRAWL");
        btnwithdrawl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwithdrawlActionPerformed(evt);
            }
        });

        btnapplyloan.setBackground(new java.awt.Color(102, 102, 0));
        btnapplyloan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnapplyloan.setForeground(new java.awt.Color(255, 255, 255));
        btnapplyloan.setText("APPLY_LOAN");
        btnapplyloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapplyloanActionPerformed(evt);
            }
        });

        btntransfer.setBackground(new java.awt.Color(102, 102, 0));
        btntransfer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btntransfer.setForeground(new java.awt.Color(255, 255, 255));
        btntransfer.setText("TRANSFER_Money");
        btntransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransferActionPerformed(evt);
            }
        });

        btnlogout.setBackground(new java.awt.Color(102, 102, 0));
        btnlogout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setText("LOGOUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        pnlmain.setLayout(new java.awt.CardLayout());

        lbldep.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbldep.setText("Deposit Money:");

        lblamt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblamt.setText("Enter Amount to deposit: ");

        txtamt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btndepositmoney.setBackground(new java.awt.Color(153, 153, 153));
        btndepositmoney.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndepositmoney.setText("Deposit");
        btndepositmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndepositmoneyActionPerformed(evt);
            }
        });

        lblmsg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblamt, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbldep, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndepositmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(495, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lbldep, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblamt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtamt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btndepositmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pnlmain.add(p2, "card3");

        lblwith.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblwith.setText("Withdrawal Money:");

        lblamt1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblamt1.setText("Enter Amount to withdrawl ");

        txtwith.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnwithmoney.setBackground(new java.awt.Color(153, 153, 153));
        btnwithmoney.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnwithmoney.setText("Withdrawl");
        btnwithmoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwithmoneyActionPerformed(evt);
            }
        });

        lblwithmsg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblwithmsg.setText("Withdrawal Money:");

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtwith, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblwith, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblamt1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 558, Short.MAX_VALUE))
                    .addGroup(p3Layout.createSequentialGroup()
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnwithmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblwithmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblwith, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblamt1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtwith, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnwithmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblwithmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pnlmain.add(p3, "card4");

        lblloanamt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblloanamt.setText("Enter Amount for Loan:");

        lblloan1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblloan1.setText("Loan:");

        txtloanamt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtloanamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloanamtActionPerformed(evt);
            }
        });

        lblloanreason.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblloanreason.setText("Reason: ");

        txtloanreason.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtloanreason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloanreasonActionPerformed(evt);
            }
        });

        btnapply.setBackground(new java.awt.Color(153, 153, 153));
        btnapply.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnapply.setText("Apply");
        btnapply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapplyActionPerformed(evt);
            }
        });

        lblloanmsg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblloanmsg.setText("Loan Applied");

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p4Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(p4Layout.createSequentialGroup()
                                .addComponent(lblloanreason, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(txtloanreason, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblloan1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(p4Layout.createSequentialGroup()
                                    .addComponent(lblloanamt, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65)
                                    .addComponent(txtloanamt, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(p4Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(btnapply, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p4Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblloanmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblloan1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtloanamt)
                    .addComponent(lblloanamt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtloanreason)
                    .addComponent(lblloanreason, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(btnapply, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblloanmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pnlmain.add(p4, "card5");

        lbltransferid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbltransferid.setText("Customer_Id");

        lblheadtransfer1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblheadtransfer1.setText("Beneficiary's details:");

        txttransferid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txttransferid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttransferidActionPerformed(evt);
            }
        });

        lbltransferaccno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbltransferaccno.setText("Account No");

        txttransferaccno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txttransferaccno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttransferaccnoActionPerformed(evt);
            }
        });

        lbltransferamt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbltransferamt.setText("Amount_To_Transfer");

        txttransferamt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txttransferamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttransferamtActionPerformed(evt);
            }
        });

        btntran.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btntran.setForeground(new java.awt.Color(153, 153, 153));
        btntran.setText("Transfer");
        btntran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntranActionPerformed(evt);
            }
        });

        lbltransfermsg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltransfermsg, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p5Layout.createSequentialGroup()
                        .addComponent(lbltransferamt, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(txttransferamt, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(p5Layout.createSequentialGroup()
                            .addComponent(lbltransferaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(101, 101, 101)
                            .addComponent(txttransferaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(p5Layout.createSequentialGroup()
                            .addComponent(lbltransferid, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(101, 101, 101)
                            .addComponent(txttransferid, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p5Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btntran, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(384, Short.MAX_VALUE))
            .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p5Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(lblheadtransfer1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(679, Short.MAX_VALUE)))
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p5Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttransferid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltransferid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttransferaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltransferaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttransferamt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltransferamt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btntran, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbltransfermsg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p5Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(lblheadtransfer1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(509, Short.MAX_VALUE)))
        );

        pnlmain.add(p5, "card6");

        txtdetails.setColumns(20);
        txtdetails.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtdetails.setRows(5);
        jScrollPane1.setViewportView(txtdetails);

        lblbank.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblbank.setText("Bank Details:");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbank, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(lblbank, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        pnlmain.add(p1, "card2");

        lblwel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblwel.setText("WELCOME");

        javax.swing.GroupLayout pnlsLayout = new javax.swing.GroupLayout(pnls);
        pnls.setLayout(pnlsLayout);
        pnlsLayout.setHorizontalGroup(
            pnlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsLayout.createSequentialGroup()
                .addGroup(pnlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlsLayout.createSequentialGroup()
                        .addGroup(pnlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnapplyloan, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlsLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(pnlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnwithdrawl)
                                    .addGroup(pnlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btndetails, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btndeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btntransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(pnlmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlsLayout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(lblwel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlsLayout.setVerticalGroup(
            pnlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblwel)
                .addGap(27, 27, 27)
                .addGroup(pnlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlsLayout.createSequentialGroup()
                        .addComponent(btndetails, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btndeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnwithdrawl, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnapplyloan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btntransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndepositActionPerformed
        // TODO add your handling code here:
        p1.setVisible(false);
           p2.setVisible(true);
            p3.setVisible(false); 
            p4.setVisible(false);
             p5.setVisible(false);
             lblmsg.setText("");
             txtamt.setText("");
    
    }//GEN-LAST:event_btndepositActionPerformed

    private void btndetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndetailsActionPerformed
        // TODO add your handling code here:
         
          p1.setVisible(true);
           p2.setVisible(false);
            p3.setVisible(false); 
            p4.setVisible(false);
             p5.setVisible(false);
        try 
        {
           
            String s4="select * from User_details where cust_id="+id;          
            ResultSet rs1=state.executeQuery(s4);
            
            if(rs1.next())
            {
                int id2=rs1.getInt("cust_id");
                String id3=String.valueOf(id2);
                String name1=rs1.getString("name");
                int accno1=rs1.getInt("accno");
                String accno2=String.valueOf(accno1);
                String dob1=rs1.getString("dob");
                String type1=rs1.getString("type");
                int bal;
                bal = rs1.getInt("balance");
                String bal2;
                bal2=String.valueOf(bal);
                String s5="Cust_id: "+id3+"\nName: "+name1+"\nAccount No.: "+accno2+"\nDOB: "+dob1+"\nAccount_Type: "+type1+"\nBalance: "+bal2;
                 
                String s2="select * from Loan where cust_id="+id;
                ResultSet rs2=state.executeQuery(s2);
                if(rs2.next())
                {
                    String s6=String.valueOf(rs2.getInt("Amount"));
                    String s7=rs2.getString("Reason");
                    s5=s5+"\nLoan_Amount: "+s6+"\nLoan_Reason: "+s7;
                }
                
                 txtdetails.setText(s5);
            }
            else
            {}
       
        }
        catch(Exception ex)
        {
            System.out.println("Error");
        }
            
            
    }//GEN-LAST:event_btndetailsActionPerformed

    private void btnwithdrawlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwithdrawlActionPerformed
        // TODO add your handling code here:
        p1.setVisible(false);
           p2.setVisible(false);
            p3.setVisible(true); 
            p4.setVisible(false);
             p5.setVisible(false);
             
             lblwithmsg.setText("");
             txtwith.setText("");
    }//GEN-LAST:event_btnwithdrawlActionPerformed

    private void btnapplyloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapplyloanActionPerformed
        // TODO add your handling code here:
        p1.setVisible(false);
           p2.setVisible(false);
            p3.setVisible(false); 
            p4.setVisible(true);
             p5.setVisible(false);
             
             txtloanamt.setText("");
             txtloanreason.setText("");
             lblloanmsg.setText("");
    }//GEN-LAST:event_btnapplyloanActionPerformed

    private void btntransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransferActionPerformed
        // TODO add your handling code here:
        p1.setVisible(false);
           p2.setVisible(false);
            p3.setVisible(false); 
            p4.setVisible(false);
             p5.setVisible(true);
             
             lbltransfermsg.setText("");
             txttransferid.setText("");
             txttransferaccno.setText("");
             txttransferamt.setText("");
    }//GEN-LAST:event_btntransferActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        
        int res;
        res=JOptionPane.showConfirmDialog(null,"Do you want to Logout?","Confirm",JOptionPane.YES_NO_OPTION);
        if(res == JOptionPane.YES_OPTION)
        {
             new WelcomeForm().setVisible(true);
                dispose();
            }
        else
        { }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btndepositmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndepositmoneyActionPerformed
        // TODO add your handling code here:
        
        try 
          {
              String s="select balance from User_details where cust_id="+id;
                ResultSet rs=state.executeQuery(s);
                int x=0;
                if(rs.next())
                {
                    x=rs.getInt("balance");
                }

                String str;
                str=txtamt.getText();
                int i=Integer.parseInt(str);
                if(i<0)
                {
                     JOptionPane.showMessageDialog(null,"Amount cannot be negative");
                }
                else
                {
                   
                    x=x+i;
                    String str1="update User_details set balance="+x+" where cust_id="+id;        
                    state.executeUpdate(str1);    
                    lblmsg.setText("Amount deposited ");
                }
          }
        catch(Exception e)
        {
            System.out.println("Error");
        }    
    }//GEN-LAST:event_btndepositmoneyActionPerformed

    private void btnwithmoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwithmoneyActionPerformed
        // TODO add your handling code here:
        try
        {
             String str1="select balance from User_details where cust_id="+id;
             ResultSet rs1=state.executeQuery(str1);
             int x=0;
             if(rs1.next())
             {
                 x=rs1.getInt("balance");
             }
             int i=Integer.parseInt(txtwith.getText());
             if(i>=0 && i<=x)
             {
                 x=x-i;
                 String str2="update User_details set balance="+x+" where cust_id="+id;        
                 state.executeUpdate(str2);    
                 lblwithmsg.setText("Withdrawl successful");
              }
             else
             {
                 JOptionPane.showMessageDialog(null,"Invalid");
             }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
       
    }//GEN-LAST:event_btnwithmoneyActionPerformed

    private void txtloanamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloanamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloanamtActionPerformed

    private void txtloanreasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloanreasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloanreasonActionPerformed

    private void btnapplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapplyActionPerformed
        // TODO add your handling code here:
        
        try
        {
            String str1=txtloanamt.getText();
            int amt1=Integer.parseInt(str1);
           

            String str2=txtloanreason.getText();
            if(amt1>=0)
            {
                String str="insert into Loan values("+id+","+amt1+",'"+str2+"')";
                state.executeUpdate(str);
                lblloanmsg.setText("Loan Applied");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
        
    }//GEN-LAST:event_btnapplyActionPerformed

    private void txttransferidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttransferidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttransferidActionPerformed

    private void txttransferaccnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttransferaccnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttransferaccnoActionPerformed

    private void txttransferamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttransferamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttransferamtActionPerformed

    private void btntranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntranActionPerformed
        // TODO add your handling code here:
        
        String s1=txttransferid.getText();
        int i=Integer.parseInt(s1);
        
        String s2=txttransferaccno.getText();
        int accno1=Integer.parseInt(s2);
        
        String s3=txttransferamt.getText();
        int amt1=Integer.parseInt(s3);
        
        try
        {
            String s5="select balance from User_details where cust_id="+i+" and accno="+accno1;
            ResultSet rs1=state.executeQuery(s5);
            int amt2=0,x=0,amt3=0;
            if(rs1.next())
            {
                amt2=rs1.getInt("balance");
                x=amt2+amt1;
                String s6="update User_details set balance="+x+" where cust_id="+i;
                state.executeUpdate(s6);
                
                String s7="select balance from User_details where cust_id="+id;
                ResultSet rs2=state.executeQuery(s7);
                if(rs2.next())
                {
                    amt3=rs2.getInt("balance");
                    x=amt3-amt1;
                    String s8="update User_details set balance="+x+" where cust_id="+id;
                    state.executeUpdate(s8);
                    lbltransfermsg.setText("Transferred Successful");
                    
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }//GEN-LAST:event_btntranActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(DetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnapply;
    private javax.swing.JButton btnapplyloan;
    private javax.swing.JButton btndeposit;
    private javax.swing.JButton btndepositmoney;
    private javax.swing.JButton btndetails;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btntran;
    private javax.swing.JButton btntransfer;
    private javax.swing.JButton btnwithdrawl;
    private javax.swing.JButton btnwithmoney;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblamt;
    private javax.swing.JLabel lblamt1;
    private javax.swing.JLabel lblbank;
    private javax.swing.JLabel lbldep;
    private javax.swing.JLabel lblheadtransfer1;
    private javax.swing.JLabel lblloan1;
    private javax.swing.JLabel lblloanamt;
    private javax.swing.JLabel lblloanmsg;
    private javax.swing.JLabel lblloanreason;
    private javax.swing.JLabel lblmsg;
    private javax.swing.JLabel lbltransferaccno;
    private javax.swing.JLabel lbltransferamt;
    private javax.swing.JLabel lbltransferid;
    private javax.swing.JLabel lbltransfermsg;
    private javax.swing.JLabel lblwel;
    private javax.swing.JLabel lblwith;
    private javax.swing.JLabel lblwithmsg;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel pnlmain;
    private javax.swing.JPanel pnls;
    private javax.swing.JTextField txtamt;
    private javax.swing.JTextArea txtdetails;
    private javax.swing.JTextField txtloanamt;
    private javax.swing.JTextField txtloanreason;
    private javax.swing.JTextField txttransferaccno;
    private javax.swing.JTextField txttransferamt;
    private javax.swing.JTextField txttransferid;
    private javax.swing.JTextField txtwith;
    // End of variables declaration//GEN-END:variables
}
