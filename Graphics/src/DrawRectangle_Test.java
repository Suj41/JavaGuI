import javax.swing.*;
import java.awt.*;

public class DrawRectangle_Test extends JFrame {

    public DrawRectangle_Test(){
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
        g.drawRect(40,40,55,200);
        g.fillRect(50,50,65,210);

        g.drawOval(310,340,80,80);
        g.fillOval(315,345,80,80);

    }

    public static void main(String[] args) {
        new DrawRectangle_Test();

    }

}
