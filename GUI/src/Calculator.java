import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    JFrame myFrame = new JFrame("Calculator");
    JButton Zero, One, Two;
    JButton Three, Four, Five;
    JButton Six, Seven, Eight;
    JButton Nine, Add, Sub;
    JButton Mul, Div, Equal;
    JLabel Result;



    public Calculator(){

        myFrame.setSize(400,500);
        myFrame.setLayout(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Result=new JLabel("Display Result");
        Result.setBounds(20,20,200,20);

        Zero=new JButton("0");
        Zero.setBounds(20,40,60,20);

        One=new JButton("1");
        One.setBounds(80,40,60,20);

        Two=new JButton("2");
        Two.setBounds(140,40,60,20);

        Add=new JButton("+");
        Add.setBounds(200,40,60,20);

        Three=new JButton("3");
        Three.setBounds(20,60,60,20);

        Four=new JButton("4");
        Four.setBounds(80,60,60,20);

        Five=new JButton("5");
        Five.setBounds(140,60,60,20);

        Equal =new JButton("=");
        Equal.setBounds(200,60,60,20);

        Six=new JButton("6");
        Six.setBounds(20,80,60,20);

        Seven=new JButton("7");
        Seven.setBounds(80,80,60,20);

        Eight=new JButton("8");
        Eight.setBounds(140,80,60,20);

        Mul=new JButton("x");
        Mul.setBounds(200,80,60,20);

        Nine=new JButton("9");
        Nine.setBounds(20,100,60,20);

        Div=new JButton("/");
        Div.setBounds(80,100,60,20);

        Sub=new JButton("-");
        Sub.setBounds(140,100,60,20);



        Zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int zero=0;
                Result.setText(Integer.toString(zero));
            }
        });
        One.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int one=1;
                Result.setText(Integer.toString(one));
            }
        });
        Two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int two=2;
                Result.setText(Integer.toString(two));
            }
        });
        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String add="+";
                Result.setText(add);

            }
        });
        Equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String equal= "=";
                Result.setText(equal);

            }
        });

        Three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int three=3;
                Result.setText(Integer.toString(three));
            }
        });

        Four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int four=4;
                Result.setText(Integer.toString(four));
            }
        });

        Five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int five=5;
                Result.setText(Integer.toString(five));
            }
        });

        Six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int six=6;
                Result.setText(Integer.toString(six));
            }
        });

        Seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int seven= 7;
                Result.setText(Integer.toString(seven));
            }
        });

        Eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int eight=8;
                Result.setText(Integer.toString(eight));
            }
        });

        Nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nine=9;
                Result.setText(Integer.toString(nine));
            }
        });

        Mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mul="*";
                Result.setText(mul);
            }
        });

        Div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String div="/";
                Result.setText(div);
            }
        });
        Sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sub="-";
                Result.setText(sub);
            }
        });


        myFrame.add(Zero);
        myFrame.add(One);
        myFrame.add(Two);
        myFrame.add(Add);
        myFrame.add(Result);
        myFrame.add(Three);
        myFrame.add(Four);
        myFrame.add(Five);
        myFrame.add(Equal);
        myFrame.add(Six);
        myFrame.add(Seven);
        myFrame.add(Eight);
        myFrame.add(Mul);
        myFrame.add(Nine);
        myFrame.add(Div);
        myFrame.add(Sub);


        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
    }
    public static int  add(int a, int b){
        int add= a+b;
      return add;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
