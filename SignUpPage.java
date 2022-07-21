package everestBank;

import everestBank.Model.CustomerDetails;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class SignUpPage extends JFrame implements ActionListener {

    //Initializing Label, Text, Button,
    JLabel lblBankName, lblFname, lblLname, lblAge, lblGender;
    JLabel lblPhone, lblPassword, lblCPassword, lblAmount;
    JTextField txtFname, txtLname, txtAge, txtPhone, txtPassword, txtCPassword, txtAmount;
    JRadioButton rdioMale, rdioFemale, rdioOthers;
    ButtonGroup bg;
    JCheckBox chkTermsAndConditions;
    JButton btnSignup, btnBack;
    Container c;
    JPanel panelBody;
    CustomerDetails info=new CustomerDetails();
    CustomerDetails obj = new CustomerDetails();
    Font heading = new Font(Font.SERIF,Font.CENTER_BASELINE,26);
    Font body = new Font(Font.SERIF,Font.CENTER_BASELINE,16);

    static FileWriter CustomerWrite;

    public SignUpPage(){

        setSize(500,650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(1,1));
        setLocationRelativeTo(null);
        c=getContentPane();
        bg= new ButtonGroup();

        panelBody= new JPanel();
        panelBody.setSize(500,500);
        panelBody.setLayout(null);
        panelBody.setFont(body);
        panelBody.setBackground(Color.red);


        lblBankName = new JLabel("Everest Bank");
        lblBankName.setFont(heading);
        lblBankName.setBounds(100,20,100,20);
        lblBankName.setForeground(Color.red);


        lblFname=new JLabel("First Name ");
        lblFname.setFont(body);
        lblFname.setForeground(Color.white);
        lblFname.setBounds(20,20,180,20);
        panelBody.add(lblFname);

        lblLname=new JLabel("Last Name ");
        lblLname.setFont(body);
        lblLname.setForeground(Color.white);
        lblLname.setBounds(20,60,180,20);
        panelBody.add(lblLname);

        lblAge=new JLabel("Age ");
        lblAge.setFont(body);
        lblAge.setForeground(Color.white);
        lblAge.setBounds(20,100,180,20);
        panelBody.add(lblAge);

        lblGender=new JLabel("Gender ");
        lblGender.setFont(body);
        lblGender.setForeground(Color.white);
        lblGender.setBounds(20,140,180,20);
        panelBody.add(lblGender);

        lblAmount=new JLabel("Amount ");
        lblAmount.setFont(body);
        lblAmount.setForeground(Color.white);
        lblAmount.setBounds(20,200,180,20);
        panelBody.add(lblAmount);

        lblPhone=new JLabel("Phone ");
        lblPhone.setFont(body);
        lblPhone.setForeground(Color.white);
        lblPhone.setBounds(20,240,180,20);
        panelBody.add(lblPhone);

        lblPassword=new JLabel("Password ");
        lblPassword.setFont(body);
        lblPassword.setForeground(Color.white);
        lblPassword.setBounds(20,280,180,20);
        panelBody.add(lblPassword);

        lblCPassword=new JLabel("Confirm Password ");
        lblCPassword.setFont(body);
        lblCPassword.setForeground(Color.white);
        lblCPassword.setBounds(20,320,180,20);
        panelBody.add(lblCPassword);

        txtFname=new JTextField();
        txtFname.setFont(body);
        txtFname.setBounds(200,20,200,20);
        panelBody.add(txtFname);

        txtLname=new JTextField();
        txtLname.setFont(body);
        txtLname.setBounds(200,60,200,20);
        panelBody.add(txtLname);

        txtAge=new JTextField();
        txtAge.setFont(body);
        txtAge.setBounds(200,100,200,20);
        panelBody.add(txtAge);

        txtAmount=new JTextField();
        txtAmount.setFont(body);
        txtAmount.setBounds(200,200,200,20);
        panelBody.add(txtAmount);

        txtPhone=new JTextField();
        txtPhone.setFont(body);
        txtPhone.setBounds(200,240,200,20);
        panelBody.add(txtPhone);

        txtPassword=new JTextField();
        txtPassword.setFont(body);
        txtPassword.setBounds(200,280,200,20);
        panelBody.add(txtPassword);

        txtCPassword=new JTextField();
        txtCPassword.setFont(body);
        txtCPassword.setBounds(200,320,200,20);
        panelBody.add(txtCPassword);

        rdioMale=new JRadioButton("Male");
        rdioMale.setBounds(20,160,100,20);
        rdioMale.setFont(body);
        rdioMale.setBackground(Color.red);
        rdioMale.setForeground(Color.WHITE);
        bg.add(rdioMale);
        panelBody.add(rdioMale);

        rdioFemale=new JRadioButton("Female");
        rdioFemale.setBounds(120,160,100,20);
        rdioFemale.setFont(body);
        rdioFemale.setBackground(Color.red);
        rdioFemale.setForeground(Color.WHITE);
        bg.add(rdioFemale);
        panelBody.add(rdioFemale);

        rdioOthers=new JRadioButton("Others");
        rdioOthers.setBounds(220,160,100,20);
        rdioOthers.setFont(body);
        rdioOthers.setBackground(Color.red);
        rdioOthers.setForeground(Color.WHITE);
        bg.add(rdioOthers);
        panelBody.add(rdioOthers);

        chkTermsAndConditions= new JCheckBox(" Terms and Conditions");
        chkTermsAndConditions.setBounds(20,360,200,20);
        chkTermsAndConditions.setFont(body);
        chkTermsAndConditions.setBackground(Color.red);
        chkTermsAndConditions.setForeground(Color.WHITE);
        panelBody.add(chkTermsAndConditions);

        btnSignup = new JButton("Next");
        btnSignup.setBounds(20,400,100,20);
        btnSignup.setFont(body);
        panelBody.add(btnSignup);

        btnBack = new JButton("Back to Login Page");
        btnBack.setBounds(140,400,200,20);
        btnBack.setFont(body);
        panelBody.add(btnBack);

        btnSignup.addActionListener(this);
        btnBack.addActionListener(this);

        c.add(lblBankName, BorderLayout.NORTH);
        c.add(panelBody, BorderLayout.CENTER);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSignup){
            if(txtFname.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter First Name");
                txtFname.requestFocus();
                return;
            }
            if(txtLname.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Last Name");
                txtLname.requestFocus();
                return;
            }
            if(txtAge.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Age");
                txtAge.requestFocus();
                return;
            }

            if(!rdioMale.isSelected() && !rdioFemale.isSelected() && !rdioOthers.isSelected()){
                JOptionPane.showMessageDialog(null,"Select Gender");
                return;
            }

            if(txtAmount.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Balance");
                txtAmount.requestFocus();
                return;
            }

            if(txtPhone.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Phone");
                txtPhone.requestFocus();
                return;
            }
            if(txtPassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Password");
                txtPassword.requestFocus();
                return;
            }
            if(txtCPassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Confirm Password");
                txtCPassword.requestFocus();
                return;
            }

            if(!chkTermsAndConditions.isSelected()){
                JOptionPane.showMessageDialog(null,"Select Terms and Conditions");
                chkTermsAndConditions.requestFocus();
                return;
            }

            obj.fname = txtFname.getText();
            obj.lname = txtLname.getText();
            obj.age = txtAge.getText();
            obj.phone = txtPhone.getText();
            obj.password= txtPassword.getText();
            obj.cpassword = txtCPassword.getText();
            obj.Balance= txtAmount.getText();
            if (obj.password.equals(obj.cpassword)) {
                AddCustomerThread addCustomerThread=new AddCustomerThread(info);
                addCustomerThread.start();

                JOptionPane.showMessageDialog(null, "Customer Added");
                new OTP_Page();
            } else{
                JOptionPane.showMessageDialog(null, "Enter correct password");
                return;
            }

        }
        else if(e.getSource()==btnBack){
            new LoginPage();
        }

    }

    public static void main(String[] args) {
        new SignUpPage();
    }




class AddCustomerThread extends Thread{

    CustomerDetails info;

    public AddCustomerThread(CustomerDetails info){
        this.info=info;

    }
    @Override
    public void run() {
        try {
            CustomerWrite = new FileWriter("customer.txt",true);
            CustomerWrite.write( "\n"+obj.fname+" "+obj.lname+" "+obj.age+" "+obj.phone+" "+obj.cpassword+" ");
            CustomerWrite.close();
            System.out.println("added customer");
        }
        catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
}
