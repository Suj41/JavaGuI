import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Check_Palindrome extends JFrame implements ActionListener {

    JLabel lblNumber;
    JTextField txtNumber;
    JButton btnCheck, btnClose;

public Check_Palindrome(){
    setSize(400,400);
    setTitle("Palindrome");
    setLayout(null);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container c= getContentPane();

    lblNumber=new JLabel("Enter a number:");
    lblNumber.setBounds(20, 20 ,180, 20);

    txtNumber=new JTextField();
    txtNumber.setBounds(200,20, 100,20);

    btnCheck=new JButton("Check");
    btnCheck.setBounds(20,40,120,20);

    btnClose=new JButton("Close");
    btnClose.setBounds(140,40,120,20);

    c.add(lblNumber);
    c.add(txtNumber);
    c.add(btnCheck);
    c.add(btnClose);

    btnCheck.addActionListener(this);
    btnClose.addActionListener(this);


    setVisible(true);

}
    public static void main(String[] args) {
new Check_Palindrome();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    if(e.getSource()==btnCheck){
        if(txtNumber.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter any number");
        txtNumber.requestFocus();
        return;
        }
palindromeOrNOt(Integer.parseInt(txtNumber.getText().toString()));
    }
    else if (e.getSource()==btnClose){
        System.exit(0);
    }

    }

    public static void palindromeOrNOt(int num){
    int temp= num;
    int sum=0,r;
    while(num!=0){
        r=num%10;
        sum=(sum*10)+r;
        num/= 10;

    }
    if(temp==sum){
        JOptionPane.showMessageDialog(null , temp+" is Palindrome.");

    }
    else{
        JOptionPane.showMessageDialog(null , temp+"is not Palindrome.");


    }


    }
}
