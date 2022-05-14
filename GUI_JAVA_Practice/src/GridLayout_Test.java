import javax.swing.*;
import java.awt.*;

public class GridLayout_Test extends JFrame {

    JButton b0,b1, b2,b3,b4,b5,b6,b7,b8,b9;
    public GridLayout_Test(){
        setSize(500,500);
        int row=4, col=3;
        setLayout(new GridLayout(row, col));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        b0= new JButton("0");
        b1= new JButton("1");
        b2= new JButton("2");
        b3= new JButton("3");
        b4= new JButton("4");
        b5= new JButton("5");
        b6= new JButton("6");
        b7= new JButton("7");
        b8= new JButton("8");
        b9= new JButton("9");


        setVisible(true);
    }

    public static void main(String[] args) {
 new GridLayout_Test();
    }
}
