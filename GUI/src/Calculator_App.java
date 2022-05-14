import javax.print.attribute.standard.JobStateReasons;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator_App extends JFrame implements ActionListener {
    JTextField txtInput;
    JButton b0;
    JButton btn1;
    JButton b2;
    JButton b3;
    JButton bplus;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton bminus;
    JButton bequal;

    public Calculator_App() {

        setLayout(new BorderLayout(12, 11));
        setSize(400, 400);
        Container c = getContentPane();
        setLocationRelativeTo(null);
        txtInput = new JTextField();

          Font sans= new Font(Font.SERIF, Font.BOLD, 20);


        JPanel panel1 = new JPanel();
        int row = 3, col = 4;
        panel1.setLayout(new GridLayout(row, col));

        panel1.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));

        b0 = new JButton("0");
        btn1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        bplus = new JButton("+");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        bminus = new JButton("-");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bequal = new JButton("=");

        b0.setFont(sans);
        btn1.setFont(sans);
        b2.setFont(sans);
        b3.setFont(sans);
        b4.setFont(sans);
        b5.setFont(sans);
        b6.setFont(sans);
        b7.setFont(sans);
        b8.setFont(sans);
        b9.setFont(sans);
        bplus.setFont(sans);
        bminus.setFont(sans);
        bequal.setFont(sans);
        txtInput.setFont(sans);

        bplus.setBackground(Color.green);
        bplus.setForeground(Color.white);
        bminus.setBackground(Color.red);
        bminus.setForeground(Color.white);
        bequal.setBackground(Color.pink);

        panel1.add(btn1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(bplus);
        panel1.add(b4);
        panel1.add(b5);
        panel1.add(b6);
        panel1.add(bminus);
        panel1.add(b7);
        panel1.add(b8);
        panel1.add(b9);
        panel1.add(bequal);
        panel1.setBackground(Color.magenta);



        btn1.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        btn1.setBackground(Color.magenta);
        btn1.setForeground(Color.green);

        btn1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        bplus.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bminus.addActionListener(this);
        bequal.addActionListener(this);

//        Border blackline = BorderFactory.createTitledBorder("My Panel 1");
//        panel1.setBorder(blackline);
        c.add(txtInput, BorderLayout.NORTH);
        c.add(panel1, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator_App();
    }

    String text;
    int first, second;
    int count = 0;
    int result;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {
            text = txtInput.getText() + "1";
            txtInput.setText(text);

        } else if (e.getSource() == b2) {
            text = txtInput.getText() + "2";
            txtInput.setText(text);

        } else if (e.getSource() == bplus) {
            count = 1;
            first = Integer.parseInt(txtInput.getText());
            txtInput.setText("");

        } else if (e.getSource() == b3) {
            text = txtInput.getText() + "3";
            txtInput.setText(text);

        } else if (e.getSource() == b4) {
            text = txtInput.getText() + "4";
            txtInput.setText(text);

        } else if (e.getSource() == b5) {
            text = txtInput.getText() + "5";
            txtInput.setText(text);

        } else if (e.getSource() == b6) {
            text = txtInput.getText() + "6";
            txtInput.setText(text);

        } else if (e.getSource() == b7) {
            text = txtInput.getText() + "7";
            txtInput.setText(text);

        } else if (e.getSource() == b8) {
            text = txtInput.getText() + "8";
            txtInput.setText(text);

        } else if (e.getSource() == b9) {
            text = txtInput.getText() + "9";
            txtInput.setText(text);

        }
        if (e.getSource() == bminus) {
            count = 2;
            first = Integer.parseInt(txtInput.getText());
            txtInput.setText("");

        } else if (e.getSource() == bequal) {


            second = Integer.parseInt(txtInput.getText());
            switch (count) {
                case 1:
                    result = first + second;
                    break;
                case 2:
                    result = first - second;
                    break;

                default:
                    result = 0;
                    break;

            }


            txtInput.setText(Integer.toString(result));

        }

    }
}
