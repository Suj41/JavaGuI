package everestBank;

import everestBank.Model.CustomerDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainMenu extends JFrame implements ActionListener {

    //Initializing Label, Text, Button,
    JLabel  lblBalance, lblAccountAmnt, lblBalanceAmnt, lblBankName;
    JButton btnAccountnumber, btnWithdraw, btnSearchAccount, btnViewAccount, btnBalance, btnBack, btnExit;
    Container c;
    JPanel panelBody;
    Font heading = new Font(Font.SERIF,Font.CENTER_BASELINE,26);
    Font body = new Font(Font.SERIF,Font.CENTER_BASELINE,16);
    CustomerDetails obj = new CustomerDetails();


    public MainMenu(){

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


        btnAccountnumber = new JButton("Accountnumber");
        btnAccountnumber.setFont(body);
        panelBody.add(btnAccountnumber);
        btnAccountnumber.setBounds(20,20,180,20);


        btnBalance=new JButton("Balance ");
        btnBalance.setFont(body);
        btnBalance.setBounds(20,60,180,20);
        panelBody.add(btnBalance);

        lblAccountAmnt=new JLabel("xxxxxx ");
        lblAccountAmnt.setFont(body);
        lblAccountAmnt.setForeground(Color.white);
        lblAccountAmnt.setBounds(200,20,180,20);
        panelBody.add(lblAccountAmnt);


        lblBalanceAmnt=new JLabel("0.0");
        lblBalanceAmnt.setFont(body);
        lblBalanceAmnt.setForeground(Color.white);
        lblBalanceAmnt.setBounds(200,60,180,20);
        panelBody.add(lblBalanceAmnt);

        btnWithdraw = new JButton("Withdraw Balance");
        btnWithdraw.setBounds(80,120,200,20);
        btnWithdraw.setFont(body);
        panelBody.add(btnWithdraw);

        btnSearchAccount = new JButton("Search Account");
        btnSearchAccount.setBounds(20,180,200,20);
        btnSearchAccount.setFont(body);
        panelBody.add(btnSearchAccount);

        btnViewAccount = new JButton("View Account");
        btnViewAccount.setBounds(240,180,200,20);
        btnViewAccount.setFont(body);
        panelBody.add(btnViewAccount);

        btnBack = new JButton("Back to Login Page");
        btnBack.setBounds(20,240,200,20);
        btnBack.setFont(body);
        panelBody.add(btnBack);

        btnExit = new JButton("Exit");
        btnExit.setBounds(240,240,200,20);
        btnExit.setFont(body);
        panelBody.add(btnExit);

        btnAccountnumber.addActionListener(this);
        btnWithdraw.addActionListener(this);
        btnViewAccount.addActionListener(this);
        btnSearchAccount.addActionListener(this);
        btnBack.addActionListener(this);
        btnExit.addActionListener(this);
        btnBalance.addActionListener(this);

        c.add(lblBankName, BorderLayout.NORTH);
        c.add(panelBody, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnAccountnumber) {
            Random rd = new Random();
            int r2 = rd.nextInt(1000000);
            obj.Accountnumber = String.valueOf(r2);
            lblAccountAmnt.setText(obj.Accountnumber);

            btnAccountnumber.requestFocus();
        }
        else  if (e.getSource()==btnBalance){
            int balance= 10000;
            obj.Balance=String.valueOf(balance);
           lblBalance.setText(obj.Balance);
        }
        if(e.getSource()==btnSearchAccount){
            new SearchAccount();
        }
        else if (e.getSource()==btnWithdraw){
            new WithdrawBalance();
        }
        else if(e.getSource()==btnViewAccount){
            new ViewAccount();
        }
        else if(e.getSource()==btnBack){
            new LoginPage();
        }
        else if(e.getSource()==btnExit) {
            System.exit(0);
        }


    }

    public static void main(String[] args) {
        new MainMenu();
    }

}