package everestBank;

import everestBank.Model.CustomerDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class OTP_Page extends JFrame implements ActionListener {

    JLabel lblOTP, lblOTPGenerate, lblEnterOTP, lblBankName, lblWelcome;
    JTextField txtOTP;
    JButton btnOTP, btnNext, btnBack;
    JPanel panelBody;
    Container c;
    CustomerDetails obj = new CustomerDetails();


    Font heading = new Font(Font.SERIF, Font.CENTER_BASELINE, 26);
    Font body = new Font(Font.SERIF, Font.CENTER_BASELINE, 16);

    public OTP_Page() {


        setSize(500, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(1, 1));
        setLocationRelativeTo(null);
        c = getContentPane();

        panelBody = new JPanel();
        panelBody.setSize(500, 500);
        panelBody.setLayout(null);
        panelBody.setFont(body);
        panelBody.setBackground(Color.red);

        lblBankName = new JLabel("Everest Bank");
        lblBankName.setBounds(120, 20, 200, 20);
        lblBankName.setFont(heading);
        lblBankName.setForeground(Color.red);
        panelBody.add(lblBankName);

        lblWelcome = new JLabel("Welcome to Everest Bank");
        lblWelcome.setBounds(100, 60, 300, 20);
        lblWelcome.setFont(body);
        lblWelcome.setForeground(Color.WHITE);
        panelBody.add(lblWelcome);


        lblEnterOTP = new JLabel("OTP");
        lblEnterOTP.setBounds(20, 200, 200, 20);
        lblEnterOTP.setFont(body);
        lblEnterOTP.setForeground(Color.WHITE);
        panelBody.add(lblEnterOTP);

        txtOTP = new JTextField();
        txtOTP.setBounds(120, 200, 200, 20);
        txtOTP.setFont(body);
        panelBody.add(txtOTP);

        btnOTP = new JButton("OTP is ");
        btnOTP.setBounds(30, 150, 200, 20);
        btnOTP.setFont(body);
        panelBody.add(btnOTP);

        btnBack = new JButton("Back to Login Page");
        btnBack.setBounds(240, 300, 200, 20);
        btnBack.setFont(body);
        panelBody.add(btnBack);

        btnNext = new JButton("Next");
        btnNext.setBounds(20, 300, 200, 20);
        btnNext.setFont(body);
        panelBody.add(btnNext);

        c.add(lblBankName, BorderLayout.NORTH);
        c.add(panelBody, BorderLayout.CENTER);

        btnNext.addActionListener(this);
        btnBack.addActionListener(this);
        btnOTP.addActionListener(this);

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnOTP) {
            Random rd = new Random();
            int r2 = rd.nextInt(10000);
            obj.EnterOTP = String.valueOf(r2);
            JOptionPane.showMessageDialog(null, obj.EnterOTP);


            System.out.println(r2);
            JOptionPane.showMessageDialog(null, obj.EnterOTP);
            btnOTP.requestFocus();
        }
        else if (txtOTP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter OTP");
            txtOTP.requestFocus();

        }  if (e.getSource() == btnNext) {

            obj.OTP = txtOTP.getText();

            if (obj.OTP.equals(obj.EnterOTP)) {
                new MainMenu();

            }
            else if (e.getSource() == btnBack) {
                new LoginPage();
            }

        }
    }



}
