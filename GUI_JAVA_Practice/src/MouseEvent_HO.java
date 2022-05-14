import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEvent_HO extends JFrame implements MouseListener {
    JButton Btn1;
    JLabel lbl1, lbl2;
    JTextField txt1, txt2;
    JPanel panel1;
    Container c;

    public MouseEvent_HO() {
        setSize(650, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        panel1=new JPanel();

        panel1.setBounds(10, 10, 600, 600);
        panel1.setLayout(null);
        panel1.setBackground(Color.yellow);

        c = getContentPane();

        Btn1 = new JButton("Mouse");
        Btn1.setBounds(20, 100, 180, 100);
        Btn1.setBackground(Color.darkGray);
        Btn1.setForeground(Color.white);

        lbl1 = new JLabel("Enter First Text :");
        lbl2 = new JLabel("Enter Second Text :");
        lbl1.setBounds(20, 20, 180, 20);
        lbl2.setBounds(20, 40, 180, 20);

        txt1 = new JTextField();
        txt1.setBounds(200, 20, 120, 20);

        txt2 = new JTextField();
        txt2.setBounds(200, 40, 120, 20);


        Btn1.addMouseListener(this);
        panel1.add(Btn1);
        panel1.add(lbl1);
        panel1.add(lbl2);
        panel1.add(txt1);
        panel1.add(txt2);

        c.add(panel1);

        setVisible(true);

    }

    public static void main(String[] args) {
       new MouseEvent_HO();

    }


    @Override
    public void mouseClicked(MouseEvent e) {


    }

    @Override
    public void mousePressed(MouseEvent e) {


    }

    @Override
    public void mouseReleased(MouseEvent e) {


    }

    int first ;
    int second ;
    int res=0;

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == Btn1) {
            if (txt1.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter First Number ");
                txt1.requestFocus();
                return;
            }



            first=Integer.parseInt(txt1.getText());
            second=Integer.parseInt(txt2.getText());
        res=first+second;
        Btn1.setText(Integer.toString(res));

        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == Btn1) {
            if (txt2.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Second Number ");
                txt2.requestFocus();
                return;
            }

            first=Integer.parseInt(txt1.getText());
            second=Integer.parseInt(txt2.getText());

            res=first-second;
            Btn1.setText(Integer.toString(res));
        }
    }

}
