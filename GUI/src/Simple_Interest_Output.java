import javax.swing.*;

public class Simple_Interest_Output extends JFrame {

    private String data;
    JLabel lbl1;

    Simple_Interest_Output(String data) {
        this.data = data;
        setSize(400, 400);
        setTitle("Display Output");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        lbl1 = new JLabel(data);
        lbl1.setBounds(20, 20, 200, 20);

        add(lbl1);

        setVisible(true);
    }


}
