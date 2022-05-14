import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanel_Prac extends JFrame implements ActionListener {
    JPanel panel1;
    JButton btn1;
    JLabel lbl;
    Container c;
    int res=0;
    public JPanel_Prac(){
        setSize(600,600);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c= getContentPane();

        panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(10, 10, 400,400);
        panel1.setBackground(Color.blue);
        Border blackline= BorderFactory.createTitledBorder("Panel 1");
        panel1.setBorder(blackline);

        btn1=new JButton("Click me");
        btn1.setBounds(20,20,100,20);

        lbl=new JLabel("yes");
        lbl.setBounds(20,40,100,20);




        panel1.add(lbl);
        panel1.add(btn1);

        c.add(panel1);

        btn1.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            res=2+3;
          new  JPanel_Output("You Just CLicked "+Integer.toString(res));
            this.dispose();
        }

    }

    public static void main(String[] args) {
        new JPanel_Prac();
    }
}
