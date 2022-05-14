import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Greatest_Smallest {
    JFrame myFrame =new JFrame("Greatest and Smallest Value");
    JLabel lblFirst, lblSecond;
    JLabel lblGreat, lblSmall;
    JTextField txtFirst, txtSecond;
    JButton btnGreatest, btnSmallest;
    JTextArea txtArea;

    public Greatest_Smallest(){
        myFrame.setLayout(null);
        myFrame.setSize(600, 600);


        lblFirst =new JLabel("First Number");
        lblFirst.setBounds(20,20,180,20);

        lblSecond=new JLabel("Second Number");
        lblSecond.setBounds(20, 40,180,20);

        txtFirst=new JTextField();
        txtFirst.setBounds(200,20,120,20);

        txtSecond=new JTextField();
        txtSecond.setBounds(200,40,120,20);

        btnGreatest=new JButton("Greatest Number");
        btnGreatest.setBounds(20,60,180,20);

        btnSmallest=new JButton("Smallest Number");
        btnSmallest.setBounds(20,80,180,20);

        lblGreat=new JLabel("Greatest Number");
        lblGreat.setBounds(200,60,120,20);

        lblSmall=new JLabel("Smallest Number");
        lblSmall.setBounds(200,80,120,20);

        txtArea=new JTextArea("Comments");
        txtArea.setBounds(20,100,300,300);

        btnGreatest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first=Integer.parseInt(txtFirst.getText());
                int second=Integer.parseInt((txtSecond.getText()));
                int great=Great(first,second);
                lblGreat.setText(Integer.toString(great));

            }
        });



        btnSmallest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first= Integer.parseInt(txtFirst.getText());
                int second=Integer.parseInt(txtSecond.getText());
                int small=Small(first,second);
                lblSmall.setText(Integer.toString(small));
            }
        });



        myFrame.add(lblFirst);
        myFrame.add(lblSecond);
        myFrame.add(txtFirst);
        myFrame.add(txtSecond);
        myFrame.add(btnGreatest);
        myFrame.add(btnSmallest);
        myFrame.add(lblGreat);
        myFrame.add(lblSmall);
        myFrame.add(txtArea);

        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static int Great(int first, int second){
        int result=Math.max(first,second);
        return result;
    }
    public static int Small(int first, int second){
        int result=Math. min(first,second);
        return result;
    }

    public static void main(String[] args) {
        new Greatest_Smallest();
    }
}
