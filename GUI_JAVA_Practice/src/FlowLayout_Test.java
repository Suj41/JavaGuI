import javax.swing.*;
import java.awt.*;

public class FlowLayout_Test {
    JFrame frame;
    JButton b1, b2, b3, b4, b5,b6,b7, b8,b9;

    public FlowLayout_Test(){
        frame=new JFrame();

        frame.setSize(600,500);
        frame.setLayout( new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1=new JButton("0");
        b2=new JButton("1");
        b3=new JButton("2");
        b4=new JButton("3");
        b5=new JButton("4");
        b6=new JButton("5");
        b7=new JButton("6");
        b8=new JButton("7");
        b9=new JButton("9");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
new FlowLayout_Test();
    }

}
