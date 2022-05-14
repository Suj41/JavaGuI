import javax.swing.*;
import java.awt.*;

public class DrawLine_Test extends JFrame {

    public DrawLine_Test(){
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.BLUE);
        //Right ENd
        g.drawLine(200,40,200,160);

        //Left End
        g.drawLine(40,40,40,160);

        g.setColor(Color.RED);

        //Top End
       g.drawLine(40,40,200,40);

       //Bottom End
        g.drawLine(40,160,200,160);
    }

    public static void main(String[] args) {
        new DrawLine_Test();
    }
}
