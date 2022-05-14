import javax.swing.*;
import java.awt.*;

public class GridLayout_Test {
    JFrame frame;
    public GridLayout_Test(){
        frame=new JFrame();
        int row=4;
                int col=3;
        frame.setLayout(new GridLayout(row,col));
        frame.setSize(400, 400);

        JButton b0= new JButton("0");
        JButton b1= new JButton("1");
        JButton b2= new JButton("2");
        JButton b3= new JButton("3");
        JButton b4= new JButton("4");
        JButton b5= new JButton("5");
        JButton b6= new JButton("6");
        JButton b7= new JButton("7");
        JButton b8= new JButton("8");
        JButton b9= new JButton("9");


        frame.add(b0);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new GridLayout_Test();
    }
}
