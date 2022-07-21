package everestBank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WithdrawBalance extends JFrame implements ActionListener {

    //Initializing Label, Text, Button,
    JLabel lblBankName, lblWithdraw, lblMobile, lblCMobile, lblAmount, lblRemarks;
    JTextField txtMobile, txtCMobile, txtAmount, txtRemarks;
    JButton btnFinish, btnBack, btnExit;
    Container c;
    JPanel panelBody;
    Font heading = new Font(Font.SERIF,Font.CENTER_BASELINE,26);
    Font body = new Font(Font.SERIF,Font.CENTER_BASELINE,16);


    public WithdrawBalance(){

        setSize(500,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(1,1));
        setLocationRelativeTo(null);
        c=getContentPane();

        panelBody= new JPanel();
        panelBody.setSize(500,500);
        panelBody.setLayout(null);
        panelBody.setFont(body);
        panelBody.setBackground(Color.red);


        lblBankName = new JLabel("Everest Bank");
        lblBankName.setFont(heading);
        lblBankName.setBounds(100,20,100,20);
        lblBankName.setForeground(Color.red);


        lblWithdraw=new JLabel("Withdraw Balance ");
        lblWithdraw.setFont(body);
        lblWithdraw.setForeground(Color.white);
        lblWithdraw.setBounds(150,20,180,20);
        panelBody.add(lblWithdraw);

        lblMobile=new JLabel("Mobile ");
        lblMobile.setFont(body);
        lblMobile.setForeground(Color.white);
        lblMobile.setBounds(20,60,180,20);
        panelBody.add(lblMobile);

        lblCMobile=new JLabel("Confirm Mobile ");
        lblCMobile.setFont(body);
        lblCMobile.setForeground(Color.white);
        lblCMobile.setBounds(20,100,180,20);
        panelBody.add(lblCMobile);

        lblAmount=new JLabel("Amount ");
        lblAmount.setFont(body);
        lblAmount.setForeground(Color.white);
        lblAmount.setBounds(20,140,180,20);
        panelBody.add(lblAmount);

        lblRemarks=new JLabel("Remarks");
        lblRemarks.setFont(body);
        lblRemarks.setForeground(Color.white);
        lblRemarks.setBounds(20,180,180,20);
        panelBody.add(lblRemarks);

        txtMobile=new JTextField();
        txtMobile.setFont(body);
        txtMobile.setBounds(240,60,200,20);
        panelBody.add(txtMobile);

        txtCMobile=new JTextField();
        txtCMobile.setFont(body);
        txtCMobile.setBounds(240,100,200,20);
        panelBody.add(txtCMobile);

        txtAmount=new JTextField();
        txtAmount.setFont(body);
        txtAmount.setBounds(240,140,200,20);
        panelBody.add(txtAmount);

        txtRemarks=new JTextField();
        txtRemarks.setFont(body);
        txtRemarks.setBounds(240,180,200,20);
        panelBody.add(txtRemarks);

        btnFinish = new JButton("Withdraw Balance");
        btnFinish.setBounds(100,240,200,20);
        btnFinish.setFont(body);
        panelBody.add(btnFinish);

        btnBack = new JButton("Back to Main Menu");
        btnBack.setBounds(20,300,200,20);
        btnBack.setFont(body);
        panelBody.add(btnBack);

        btnExit = new JButton("Exit");
        btnExit.setBounds(240,300,200,20);
        btnExit.setFont(body);
        panelBody.add(btnExit);

        btnFinish.addActionListener(this);
        btnBack.addActionListener(this);
        btnExit.addActionListener(this);

        c.add(lblBankName, BorderLayout.NORTH);
        c.add(panelBody, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnFinish){
            if(txtMobile.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Mobile Number");
                txtMobile.requestFocus();
                return;
            }
            if(txtCMobile.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Confirm Mobile Number");
                txtCMobile.requestFocus();
                return;
            }
            if(txtAmount.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Amount");
                txtAmount.requestFocus();
                return;
            }
            if(txtRemarks.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Remarks");
                txtRemarks.requestFocus();
                return;
            }
        }
        else if(e.getSource()==btnBack){
            new MainMenu();
        }
        else if(e.getSource()==btnExit){
            System.exit(0);
        }

    }

}
