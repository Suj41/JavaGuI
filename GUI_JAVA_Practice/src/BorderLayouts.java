import javax.swing.*;
import java.awt.*;

public class BorderLayouts {
    JFrame frame;
    JButton btnNorth, btnSouth, btnEast;
    JButton btnCenter, btnWest;
    public BorderLayouts(){
        frame=new JFrame();
       // frame.setSize(200,200);
        frame.setSize(400,400);
        frame.setLayout(new BorderLayout(10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnCenter=new JButton("Center");
        btnNorth=new JButton("North");
        btnSouth=new JButton("South");
        btnEast=new JButton("East");
        btnWest=new JButton("West");

        frame.add(btnCenter, BorderLayout.CENTER);
        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnWest, BorderLayout.WEST);
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnSouth, BorderLayout.SOUTH);

        frame.setVisible(true);




    }

    public static void main(String[] args) {
      new  BorderLayouts();
    }
}
