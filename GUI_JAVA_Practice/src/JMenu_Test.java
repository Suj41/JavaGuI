import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenu_Test implements ActionListener {
    JFrame frame;
    JMenuBar mb;
    JMenu menuOne, menuTwo;
    JMenuItem menuItemOne,menuItemTwo, menuItemThree;
    public JMenu_Test(){
        frame=new JFrame();
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuOne= new JMenu("Menu One");
        menuTwo= new JMenu("Menu Two");
        //menu.setSize(200,100);
        mb=new JMenuBar();

        menuItemOne=new JMenuItem("Apple");
        menuItemTwo=new JMenuItem("Tomato");
        menuItemThree=new JMenuItem("Banana");



        menuItemOne.addActionListener(this);

        menuOne.add(menuItemOne);
//        menuTwo.add(menuItemOne);
        menuOne.add(menuItemTwo);
        menuTwo.add(menuItemTwo);
        menuOne.add(menuItemThree);
        menuTwo.add(menuItemThree);
        mb.add(menuOne);
        mb.add(menuTwo);
        frame.setJMenuBar(mb);


        frame.setVisible(true);


    }

    public static void main(String[] args) {
        new JMenu_Test();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
