import javax.swing.*;

public class JList_Test extends JFrame {
    JList <String> J1;
    public JList_Test(){
        setSize(400,400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String week[]={"SUnday", "MOnday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
        J1=new JList<>(week);
        J1.setBounds(10,10,200,200);

        add(J1);
        setVisible(true);




    }

    public static void main(String[] args) {
        new JList_Test();
    }
}
