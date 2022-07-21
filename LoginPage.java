package everestBank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    JLabel lblWelcome, lblMobile, lblBankName, lblPassword;
    JTextField txtMobile;
    JPasswordField pswPassword;
    JButton btnLogin, btnSignUp, btnForget, btnExit;
    JPanel panelBody;
    Container c;
    Font heading = new Font(Font.SERIF,Font.CENTER_BASELINE,26);
    Font body = new Font(Font.SERIF,Font.CENTER_BASELINE,16);


    public LoginPage(){
        setLayout(new BorderLayout());
        setSize(500,650);
        setLocationRelativeTo(null);
        c=getContentPane();

        panelBody= new JPanel();
        panelBody.setSize(500,500);
        panelBody.setLayout(null);
        panelBody.setFont(body);
        panelBody.setBackground(Color.red);

        lblBankName = new JLabel("Everest Bank");
        lblBankName.setBounds(120,20,200,20);
        lblBankName.setFont(heading);
        lblBankName.setForeground(Color.red);
        panelBody.add(lblBankName);

        lblWelcome = new JLabel("Welcome to Everest Bank");
        lblWelcome.setBounds(100,60,300,20);
        lblWelcome.setFont(body);
        lblWelcome.setForeground(Color.WHITE);
        panelBody.add(lblWelcome);

        lblMobile = new JLabel("Mobile Number");
        lblMobile.setBounds(20,100,200,20);
        lblMobile.setFont(body);
        lblMobile.setForeground(Color.WHITE);
        panelBody.add(lblMobile);

        lblPassword = new JLabel("Password");
        lblPassword.setBounds(20,180,200,20);
        lblPassword.setFont(body);
        lblPassword.setForeground(Color.WHITE);
        panelBody.add(lblPassword);

        txtMobile = new JTextField();
        txtMobile.setBounds(20,140,200,20);
        txtMobile.setFont(body);
        panelBody.add(txtMobile);

        pswPassword = new JPasswordField();
        pswPassword.setBounds(20,220,200,20);
        pswPassword.setFont(body);
        panelBody.add(pswPassword);

        btnLogin = new JButton("Log in");
        btnLogin.setBounds(20,260,200,20);
        btnLogin.setFont(body);
        panelBody.add(btnLogin);

        btnSignUp = new JButton("SignUp");
        btnSignUp.setBounds(20,300,150,20);
        btnSignUp.setFont(body);
        panelBody.add(btnSignUp);

        btnForget = new JButton("Forget Password");
        btnForget.setBounds(200,300,150,20);
        btnForget.setFont(body);
        panelBody.add(btnForget);

        btnExit = new JButton("Exit Program");
        btnExit.setBounds(100,340, 150,20);
        btnExit.setFont(body);
        panelBody.add(btnExit);

        btnLogin.addActionListener(this);
        btnSignUp.addActionListener(this);
        btnForget.addActionListener(this);

        c.add(lblBankName, BorderLayout.NORTH);
        c.add(panelBody, BorderLayout.CENTER);

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnLogin){

            if (txtMobile.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Phone");
                txtMobile.requestFocus();
                return;
            }

            if (pswPassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Password");
                pswPassword.requestFocus();
                return;
            }

            new MainMenu();
        }
        else if(e.getSource()==btnSignUp) {
            new SignUpPage();
        }
        else if(e.getSource()==btnForget) {
            System.exit(0);
        }

    }
}
