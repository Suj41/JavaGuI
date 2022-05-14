import javax.swing.*;

public class JPanel_Output extends JFrame {
    String show;
    JLabel lbl1;

    public JPanel_Output(String show) {
        setSize(400, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbl1=new JLabel(show);
        lbl1.setBounds(20,20,200,20);

        add(lbl1);

        setVisible(true);
    }
}
