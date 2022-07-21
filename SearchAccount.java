package everestBank;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchAccount extends JFrame implements ActionListener {

    //Initializing Label, Text, Button,
    JLabel lblSearchAccount, lblAccountNum, lblCAccountNum, lblExample, lblBankName;
    JTextField txtAccountNum, txtCAccountNum;
    JButton btnBack, btnExit, btnSearch;
    JTable myTable;
    JScrollPane scroll;
    Container c;
    JPanel panelBody;
    private DefaultTableModel model;
    Font heading = new Font(Font.SERIF,Font.CENTER_BASELINE,26);
    Font body = new Font(Font.SERIF,Font.CENTER_BASELINE,16);


    public SearchAccount(){

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

        lblSearchAccount=new JLabel("Search Account ");
        lblSearchAccount.setFont(body);
        lblSearchAccount.setForeground(Color.white);
        lblSearchAccount.setBounds(150,20,180,20);
        panelBody.add(lblSearchAccount);

        lblAccountNum=new JLabel("Account Number ");
        lblAccountNum.setFont(body);
        lblAccountNum.setForeground(Color.white);
        lblAccountNum.setBounds(20,60,200,20);
        panelBody.add(lblAccountNum);

        lblExample=new JLabel("Eg. 123456789012 ");
        lblExample.setFont(body);
        lblExample.setForeground(Color.white);
        lblExample.setBounds(20,80,180,20);
        panelBody.add(lblExample);

        lblCAccountNum=new JLabel("Confirm Account Number ");
        lblCAccountNum.setFont(body);
        lblCAccountNum.setForeground(Color.white);
        lblCAccountNum.setBounds(20,120,200,20);
        panelBody.add(lblCAccountNum);

        txtAccountNum=new JTextField();
        txtAccountNum.setFont(body);
        txtAccountNum.setBounds(220,60,200,20);
        panelBody.add(txtAccountNum);

        txtCAccountNum=new JTextField();
        txtCAccountNum.setFont(body);
        txtCAccountNum.setBounds(220,120,200,20);
        panelBody.add(txtCAccountNum);

        btnSearch = new JButton("Search Account");
        btnSearch.setBounds(100,160,200,20);
        btnSearch.setFont(body);
        panelBody.add(btnSearch);

        btnBack = new JButton("Back to Main Menu");
        btnBack.setBounds(20,300,200,20);
        btnBack.setFont(body);
        panelBody.add(btnBack);

        btnExit = new JButton("Exit");
        btnExit.setBounds(240,300,200,20);
        btnExit.setFont(body);
        panelBody.add(btnExit);

        btnSearch.addActionListener(this);
        btnBack.addActionListener(this);
        btnExit.addActionListener(this);

        c.add(lblBankName, BorderLayout.NORTH);
        c.add(panelBody, BorderLayout.CENTER);

        String[] colname={"First Name", "Last Name","Account", "Phone"};

        String[][] data;

        model=new DefaultTableModel(colname,0);

        myTable=new JTable(model);
        myTable.setBounds(20, 200,480,80);

        scroll=new JScrollPane(myTable);

        model.addRow(
                new Object[]{

                }
        );
        panelBody.add(myTable);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnSearch){

            if(txtAccountNum.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Account Number");
                txtAccountNum.requestFocus();
                return;
            }

            if(txtCAccountNum.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Confirm Account Number");
                txtCAccountNum.requestFocus();
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

    public static void main(String[] args) {
        new SearchAccount();
    }
}
