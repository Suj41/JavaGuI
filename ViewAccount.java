package everestBank;

import everestBank.Model.CustomerDetails;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ViewAccount extends JFrame implements ActionListener {

    //Initializing Label, Text, Button,
    JLabel lblViewAccount, lblBankName;
    JButton btnBack, btnExit;
    Container c;
    JPanel panelBody;
    JTable myTable;
    JScrollPane scroll;
    private DefaultTableModel model;
    Font heading = new Font(Font.SERIF,Font.CENTER_BASELINE,26);
    Font body = new Font(Font.SERIF,Font.CENTER_BASELINE,16);
    CustomerDetails obj = new CustomerDetails();

    public ViewAccount(){

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

        lblViewAccount=new JLabel("View Customer Account ");
        lblViewAccount.setFont(body);
        lblViewAccount.setForeground(Color.white);
        lblViewAccount.setBounds(150,20,180,20);
        panelBody.add(lblViewAccount);


        btnBack = new JButton("Back to MainMenu");
        btnBack.setBounds(20,360,200,20);
        btnBack.setFont(body);
        panelBody.add(btnBack);

        btnExit = new JButton("Exit");
        btnExit.setBounds(240,360,200,20);
        btnExit.setFont(body);
        panelBody.add(btnExit);

        String[] colname={"First Name", "Last Name","Age", "Phone", "Password"};

        String[][] data;

        model=new DefaultTableModel(colname,0);

        myTable=new JTable(model);
        myTable.setBounds(20, 60,480,260);

        scroll=new JScrollPane(myTable);

        model.addRow(
                new Object[]{
                        obj.fname,
                        obj.lname,
                        obj.age,
                        obj.phone,
                        obj.cpassword
                }
        );
        panelBody.add(myTable);

        btnBack.addActionListener(this);
        btnExit.addActionListener(this);


        c.add(lblBankName, BorderLayout.NORTH);
        c.add(panelBody, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==btnBack){
            new MainMenu();
        }
        else if(e.getSource()==btnExit){
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        new ViewAccount();
    }

    private static void viewEmployee() throws IOException {
        try{
            File file = new File("customer.txt");
            Scanner readaer = new Scanner(file);

            while (readaer.hasNextLine()){
                System.out.println(readaer.nextLine());
            }


        } catch(IOException e){
            System.out.println(e.getLocalizedMessage());

        }

    }

}
