import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_1 {
    JFrame myFrame;
    JLabel lblmsg;
    JLabel lblmsg1, lblResult;
    JTextField txtFirst, txtSecond;
    JButton btnAdd,btnSubstract;
    //Constructor
    public GUI_1(){
        myFrame= new JFrame("YEllow Yellow");
        myFrame.setLayout(null);
        myFrame.setSize(400, 400);

        lblmsg= new JLabel("Enter First NUmber :");
        lblmsg.setBounds(20, 20, 150, 30);

        txtFirst= new JTextField();
        txtFirst.setBounds(180,20,150,30);


        lblmsg1= new JLabel("Enter Second NUmber:");
        lblmsg1.setBounds(20, 60, 150, 30);

        txtSecond= new JTextField();
        txtSecond.setBounds(180,60,150,30);

        btnAdd=new JButton("ADD");
        btnAdd.setBounds(20, 100, 150, 30);

        btnSubstract=new JButton("Substract");
        btnSubstract.setBounds(180 ,100, 150, 30);

        lblResult= new JLabel("Result ");
        lblResult.setBounds(180,180,300,50);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first =Integer.parseInt(txtFirst.getText());
                int second =Integer.parseInt(txtSecond.getText());
                int result = add(first,second);
                lblResult.setText(Integer.toString(result));

            }
        });

        btnSubstract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first =Integer.parseInt(txtFirst.getText());
                int second =Integer.parseInt(txtSecond.getText());
                int result= first-second;
                lblResult.setText(Integer.toString(result));
            }
        });

        myFrame.add(lblmsg1);
        myFrame.add(lblmsg);
        myFrame.add(txtFirst);
        myFrame.add(txtSecond);
        myFrame.add(btnAdd);
        myFrame.add(btnSubstract);
        myFrame.add(lblResult);

        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE       );
    }
    public static int add(int first, int second){
        int result= first+second;
        return result;
    }
    public static void main(String[] args) {
        new GUI_1();
    }

}
