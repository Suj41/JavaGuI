import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple_Interest {
    JFrame myFrame;
    JLabel p, t, r, res;
    JTextField pri, ti, ra;
    JButton in;
    public Simple_Interest(){
        myFrame= new JFrame("SUjal");
        myFrame.setLayout(null);
        myFrame.setSize(300,300);

        p= new JLabel("Principle");
        p.setBounds(20,20,120,30);

        t= new JLabel("Time");
        t.setBounds( 20,50,120, 30);

        r= new JLabel("Rate");
        r.setBounds(20,80,120,30);

        in=new JButton("Interest");
        in.setBounds(20,110,120,30);

        res= new JLabel("Result");
        res.setBounds(140,110,120,30);



        pri = new JTextField();
        pri.setBounds(140,20,120,30);

        ti=new JTextField();
        ti.setBounds(140,50, 120,30);

        ra=new JTextField();
        ra.setBounds(140,80,120, 30);

        in.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(pri.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Principle ");
                    pri.requestFocus();
                    return;
                }
                else if(ti.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please Enter Time ");
                    ti.requestFocus();
                    return;
                }
                else if (ra.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter Rate ");
                    ra.requestFocus();
                    return;
                }
                else {
                    double p=Double.parseDouble(pri.getText());
                    int t=Integer.parseInt(ti.getText());
                    float r=Float.parseFloat(ra.getText());
                    double result= p*t*r/100;
                    res.setText(Double.toString(result));
                }



            }
        });

        myFrame.add(p);
        myFrame.add(t);
        myFrame.add(pri);
        myFrame.add(ti);
        myFrame.add(r);
        myFrame.add(ra);
        myFrame.add(in);
        myFrame.add(res);



        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Simple_Interest();
    }
}


