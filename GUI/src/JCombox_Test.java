import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCombox_Test extends JFrame //implements ActionListener
{
    JComboBox<String> cmbweek;

    public JCombox_Test(){
        setLayout(new FlowLayout());
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] week={"Week","Sunday", "MOnday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday"};
        cmbweek=new JComboBox<>(week);
        cmbweek.setBounds(20,20,100,20);
        cmbweek.setBackground(Color.cyan);
        add(cmbweek);
       //cmbweek.addActionListener(this);
        setVisible(true);

    }

    public static void main(String[] args) {
        new JCombox_Test();
    }

  /*  @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "You Have Selected "+cmbweek.getSelectedItem());
    }*/
}
