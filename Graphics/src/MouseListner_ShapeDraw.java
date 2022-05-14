import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListner_ShapeDraw extends JFrame implements MouseListener {

    JLabel lblX,lblY;
    JLabel lblGetX,lblGetY;

    public MouseListner_ShapeDraw(){
        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblX=new JLabel("X");
        lblX.setBounds(200,20,120,20);

        lblGetX=new JLabel("X-Coordinate");
        lblGetX.setBounds(20,20,180,20);

        lblY=new JLabel("Y");
        lblY.setBounds(200,40,120,20);

        lblGetY=new JLabel("Y-Coordinate");
        lblGetY.setBounds(20,40,180,20);

        add(lblX);
        add(lblY);
        add(lblGetX);
        add(lblGetY);

        addMouseListener(this);
        setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g=  getGraphics();
        g.setColor(Color.BLUE);
        g.drawRect(e.getX(),e.getY(),100,100);

        lblX.setText(Integer.toString(e.getX()));
        lblY.setText(Integer.toString(e.getY()));

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new MouseListner_ShapeDraw();
    }

}
