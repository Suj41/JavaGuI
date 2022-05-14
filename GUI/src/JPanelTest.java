import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelTest extends JFrame implements ActionListener {

    JPanel panel1;
    JPanel panel2;
    Container c;

    JButton btn1, btn2;
    JLabel lbl1, lbl2;

    JLabel LBLadd1, LBLadd2;
    JLabel lblPrinciple, lblTime, lblRate;
    JTextField txtadd1, txtadd2;
    JTextField txtPrinciple, txtTime, txtRate;


    public JPanelTest() {
        setTitle("JPanel");
        setSize(900, 900);
        setLayout(null);
        setLocationRelativeTo(null);


        c = getContentPane();

        btn1 = new JButton("Button1");
        btn1.setBounds(20, 20, 100, 20);

        btn2 = new JButton("Button2");
        btn2.setBounds(20, 40, 100, 20);

        lbl1 = new JLabel("abcd");
        lbl1.setBounds(10, 90, 100, 30);

        lbl2 = new JLabel("abcd");
        lbl2.setBounds(10, 140, 100, 30);

        LBLadd1 = new JLabel("First Number");
        LBLadd1.setBounds(10, 160, 180, 20);

        txtadd1 = new JTextField();
        txtadd1.setBounds(200, 160, 120, 20);

        LBLadd2 = new JLabel("Second Number");
        LBLadd2.setBounds(10, 200, 180, 20);

        txtadd2 = new JTextField();
        txtadd2.setBounds(200, 200, 120, 20);

        lblPrinciple = new JLabel("Enter Principle ");
        lblPrinciple.setBounds(20, 60, 180, 20);

        lblTime = new JLabel("Enter Time ");
        lblTime.setBounds(20, 80, 180, 20);

        lblRate = new JLabel("Enter Rate");
        lblRate.setBounds(20, 100, 180, 20);

        txtPrinciple = new JTextField();
        txtPrinciple.setBounds(200, 60, 120, 20);


        txtTime = new JTextField();
        txtTime.setBounds(200, 80, 120, 20);

        txtRate = new JTextField();
        txtRate.setBounds(200, 100, 120, 20);


        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(10, 10, 400, 400);

        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(10, 450, 400, 400);

        panel1.setBackground(Color.yellow);
        panel2.setBackground(Color.green);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        panel1.add(btn1);
        panel1.add(lbl1);
        panel1.add(LBLadd1);
        panel1.add(LBLadd2);
        panel1.add(txtadd1);
        panel1.add(txtadd2);
        panel2.add(btn2);
        panel2.add(lbl2);
        panel2.add(lblPrinciple);
        panel2.add(lblRate);
        panel2.add(lblTime);
        panel2.add(txtPrinciple);
        panel2.add(txtTime);
        panel2.add(txtRate);

        Border blackline = BorderFactory.createTitledBorder("My Panel 1");
        Border blackline2 = BorderFactory.createTitledBorder("My Panel 2");

        panel1.setBorder(blackline);
        panel2.setBorder(blackline2);


        c.add(panel1);
        c.add(panel2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new JPanelTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {


            if (txtadd1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Add First");
                txtadd1.requestFocus();
                return;
            } else if (txtadd2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "ADD Second");
                txtadd2.requestFocus();
                return;
            }

            int first = Integer.parseInt(txtadd1.getText());
            int second = Integer.parseInt(txtadd2.getText());
            int result = first + second;
            new Output(Integer.toString(result)+" is the sum ");
            this.dispose();

        } else if (e.getSource() == btn2) {
            if (txtPrinciple.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter Principle ");
                txtPrinciple.requestFocus();
                return;
            } else if (txtTime.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter Time ");
                txtTime.requestFocus();
                return;
            } else if (txtRate.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter Rate ");
                txtRate.requestFocus();
                return;
            }
                double p = Double.parseDouble(txtPrinciple.getText());
                int t = Integer.parseInt(txtTime.getText());
                float r = Float.parseFloat(txtRate.getText());
                double res = (p * t * r) / 100;
                new Simple_Interest_Output(Double.toString(res)+" is the Simple Interest ");
                this.dispose();

        }

    }
}
