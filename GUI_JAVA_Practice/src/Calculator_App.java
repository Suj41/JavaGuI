import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_App extends JFrame implements ActionListener {

    JPanel panel1;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnSub, btnMul, btnDiv, btnEqual;
    JTextField txtDisplay;
    Container c;

    public Calculator_App() {
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(12,1));

        panel1=new JPanel();

       // panel1.setSize(500,500);
        int row = 5, col = 3;
        panel1.setLayout(new GridLayout(row, col));
        c = getContentPane();

        txtDisplay = new JTextField();



        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnPlus = new JButton("+");
        btnSub = new JButton("-");
        btnMul = new JButton("x");
        btnDiv = new JButton("/");
        btnEqual = new JButton("=");


        panel1.add(btn1);
        panel1.add(btn2);
        panel1.add(btn3);
        panel1.add(btn4);
        panel1.add(btn5);
        panel1.add(btn6);
        panel1.add(btn7);
        panel1.add(btn8);
        panel1.add(btn9);
        panel1.add(btnPlus);
        panel1.add(btnSub);
        panel1.add(btnMul);
        panel1.add(btnDiv);
        panel1.add(btnEqual);

        add(panel1, BorderLayout.CENTER);
        add(txtDisplay, BorderLayout.NORTH);


        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnPlus.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);
        btnEqual.addActionListener(this);


        c.add(panel1);


        setVisible(true);
    }
String text;
    int first, second;
    int res;
    int count=0;
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btn1){
            text=txtDisplay.getText()+"1";
            txtDisplay.setText(text);
        }
        else if(e.getSource()==btn2){
            text=txtDisplay.getText()+"2";
            txtDisplay.setText(text);
        }
        else if(e.getSource()==btn3){
            text=txtDisplay.getText()+"3";
            txtDisplay.setText(text);
        }
        else if(e.getSource()==btn4){
            text=txtDisplay.getText()+"4";
            txtDisplay.setText(text);
        }
        else if(e.getSource()==btn5){
            text=txtDisplay.getText()+"5";
            txtDisplay.setText(text);
        }
        else if(e.getSource()==btn6){
            text=txtDisplay.getText()+"6";
            txtDisplay.setText(text);
        }
        else if(e.getSource()==btn7){
            text=txtDisplay.getText()+"7";
            txtDisplay.setText(text);
        }
        else if(e.getSource()==btn8){
            text=txtDisplay.getText()+"8";
            txtDisplay.setText(text);
        }
        else if(e.getSource()==btn9){
            text=txtDisplay.getText()+"9";
            txtDisplay.setText(text);
        }
        else if(e.getSource()==btnPlus){
            first=Integer.parseInt(txtDisplay.getText());
            txtDisplay.setText("");

            count=1;
        }
        else if(e.getSource()==btnSub){
            first=Integer.parseInt(txtDisplay.getText());
            txtDisplay.setText("");

            count=2;
        }
        else if(e.getSource()==btnMul){
            first=Integer.parseInt(txtDisplay.getText());
            txtDisplay.setText("");

            count=3;
        }
        else if(e.getSource()==btnDiv){
            first=Integer.parseInt(txtDisplay.getText());
            txtDisplay.setText("");

            count=4;
        }
        else if(e.getSource()==btnEqual){

            second=Integer.parseInt(txtDisplay.getText());

            switch (count){
                case 1:
                    res=first+second;
                    break;
                case 2:
                    res=first-second;
                    break;
                case 3:
                    res=first*second;
                    break;
                case 4:
                    res=first/second;
                    break;
                default:
                    res=0;
                    break;

            }
            txtDisplay.setText(Integer.toString(res));
        }

    }

    public static void main(String[] args) {
        new Calculator_App();
    }

}
