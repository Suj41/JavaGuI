import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentEntry extends JFrame implements ActionListener {
    JLabel lblFname, lblLname, lblAge;
    JTextField txtFname, txtLname, txtAge;
    JButton btn1, btnCancel;
    JTable myTable;
    JScrollPane scroll;
    private DefaultTableModel model;



    public StudentEntry() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);




        String[] colname={"Fname", "Lname","Age"};

        String[][] data;


        lblFname = new JLabel("Enter First Name ");
        lblFname.setBounds(20, 20, 180, 20);

        txtFname = new JTextField();
        txtFname.setBounds(200, 20, 120, 20);

        lblLname = new JLabel("Enter Last Name ");
        lblLname.setBounds(20, 40, 180, 20);

        txtLname = new JTextField();
        txtLname.setBounds(200, 40, 120, 20);

        lblAge = new JLabel("Enter Age ");
        lblAge.setBounds(20, 60, 180, 20);

        txtAge = new JTextField();
        txtAge.setBounds(200, 60, 120, 20);

        btn1=new JButton("Add");
        btn1.setBounds(20,80,120,20);

        btnCancel=new JButton("Cancel");
        btnCancel.setBounds(140,80,120,20);


        add(lblFname);
        add(lblLname);
        add(lblAge);
        add(txtFname);
        add(txtLname);
        add(txtAge);
        add(btn1);
        add(btnCancel);

        btn1.addActionListener(this);
        btnCancel.addActionListener(this);

        model=new DefaultTableModel(colname,0);

        myTable=new JTable(model);
        myTable.setBounds(20, 100,300,300);

        scroll=new JScrollPane(myTable);

        add(myTable);
        setVisible(true);

    }

    public static void main(String[] args) {
        new StudentEntry();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            if (txtFname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter First Name");
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
            model.addRow(
                    new Object[]{
                            txtFname.getText(),
                            txtLname.getText(),
                            txtAge.getText()
                    }
            );

        } else if (e.getSource() == btnCancel) {
            if (txtFname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter First Name");
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

            dispose();
        }
    }
}
