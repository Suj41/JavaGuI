import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Arithmetic  {
JFrame myFrame= new JFrame("Arithmetic");
JLabel lblFirst, lblSecond;
JTextField txtFirst, txtSecond;

JRadioButton radioAdd,radioSub, radioMultiply, radioDivide;
JButton btnCalculate, btnClose;
    public Arithmetic(){
        myFrame.setLayout(null);
        myFrame.setSize(600,600);
        myFrame.setLocationRelativeTo(null);

        lblFirst=new JLabel("Enter First no :");
        lblFirst.setBounds(20,20,180,20);

        lblSecond =new JLabel("Enter Second no :");
        lblSecond.setBounds(20,40,180,20);

        txtFirst=new JTextField();
        txtFirst.setBounds(200,20,120,20);

        txtSecond=new JTextField();
        txtSecond.setBounds(200,40,120,20);

        radioAdd=new JRadioButton("Add");
        radioAdd.setBounds(20,60,120,20);



        radioSub=new JRadioButton("Sub");
        radioSub.setBounds(140,60,120,20);



        radioMultiply=new JRadioButton("Mul");
        radioMultiply.setBounds(20,80,120,20);



        radioDivide=new JRadioButton("Div");
        radioDivide.setBounds(140,80,120,20);


        btnCalculate=new JButton("Calculate");
        btnCalculate.setBounds(20,100,120,20);

        btnClose=new JButton("Close");
        btnClose.setBounds(160,100,100,20);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtFirst.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Enter First Number");
                    txtFirst.requestFocus();
                    return;
                }
                else if(txtSecond.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Enter Second Number");
                    txtSecond.requestFocus();
                    return;
                }
                else if(!radioAdd.isSelected() && !radioSub.isSelected() && !radioMultiply.isSelected() && !radioDivide.isSelected())
                {
                    JOptionPane.showMessageDialog(null,"Select one Option");
                }
                else {
                    int first= Integer.parseInt(txtFirst.getText());
                    int second= Integer.parseInt(txtSecond.getText());
                    int add=add(first, second);
                    int sub=sub(first, second);
                    int mul=mul(first, second);
                    int div=div(first, second);

                    if(radioAdd.isSelected()){
                        JOptionPane.showMessageDialog(null, add);
                    }
                    else if(radioSub.isSelected()){
                        JOptionPane.showMessageDialog(null, sub);
                    }
                    else if(radioMultiply.isSelected()){
                        JOptionPane.showMessageDialog(null, mul);
                    }
                    else  if(radioDivide.isSelected()){
                        JOptionPane.showMessageDialog(null, div);
                    }

                }
            }
        });

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        myFrame.add(lblFirst);
        myFrame.add(lblSecond);
        myFrame.add(txtFirst);
        myFrame.add(txtSecond);
        myFrame.add(radioAdd);
        myFrame.add(radioSub);
        myFrame.add(radioMultiply);
        myFrame.add(radioDivide);
        myFrame.add(btnCalculate);
        myFrame.add(btnClose);


        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
new Arithmetic();
    }

    public static int add(int first, int second){
        return first + second;
    }

    public static int sub(int first, int second){
        return first - second;
    }

    public int mul(int first, int second){
        return first * second;
    }

    public int div(int first, int second){
        return first / second;
    }


}
