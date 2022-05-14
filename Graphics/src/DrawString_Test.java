import javax.swing.*;
import java.awt.*;

public class DrawString_Test extends JFrame {

    public DrawString_Test(){
        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);



        g.setColor(Color.BLUE);
        Font sans= new Font(Font.SERIF, Font.BOLD, 40);
        g.setFont(sans);
        g.drawString("YELLOW YOLD", 100,100);

        g.setColor(Color.cyan);
        g.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,25));
        g.drawString("Cello cold",200,200);
    }

    public static void main(String[] args) {
        new DrawString_Test();
    }

}
