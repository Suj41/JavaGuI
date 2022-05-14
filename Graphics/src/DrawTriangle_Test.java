import javax.swing.*;
import java.awt.*;

public class DrawTriangle_Test extends JFrame {

    public DrawTriangle_Test(){
        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(40,160,100,160);
        g.drawLine(40,160,100,260);
        g.drawLine(100,160,100,260);
    }

    public static void main(String[] args) {
    new DrawTriangle_Test();
    }

}
