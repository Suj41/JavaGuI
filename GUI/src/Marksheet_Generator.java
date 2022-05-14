import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Marksheet_Generator {

    JFrame myFrame= new JFrame("Marksheet_Generator");
    JLabel lblOOT, lblOOP,lblDB;
    JButton btnGenerate, btnClose;
    JTextField txtOOT, txtOOP, txtDB;
    JLabel lblMarks,lblPercentage,lblDivision,lblResult;
    JLabel lblShowMarks, lblShowPercentage, lblShowDivision, lblShowResult;
    public Marksheet_Generator(){
myFrame.setSize(600, 600);
myFrame.setLayout(null);

    lblOOT=new JLabel("Enter OOT Marks :");
    lblOOT.setBounds(20,20,180,20);

    lblOOP=new JLabel("Enter OOP MArks:");
    lblOOP.setBounds(20,40,180,20);

    lblDB=new JLabel("Enter DB MArks:");
    lblDB.setBounds(20,60,180,20);

    txtOOT=new JTextField();
    txtOOT.setBounds(200,20,120,20);

    txtOOP=new JTextField();
    txtOOP.setBounds(200,40,120,20);

    txtDB=new JTextField();
    txtDB.setBounds(200,60,120,20);

    btnGenerate=new JButton("Generate");
    btnGenerate.setBounds(20,80,120,20);

    btnClose=new JButton("Close");
    btnClose.setBounds(140,80,120,20);

    lblMarks=new JLabel("Total Marks");
    lblMarks.setBounds(20, 100, 180,20);

    lblShowMarks=new JLabel("0.0");
    lblShowMarks.setBounds(200,100,120,20);

    lblPercentage=new JLabel("Total Percentage");
    lblPercentage.setBounds(20, 120, 120 , 20);

    lblShowPercentage=new JLabel("0.0");
    lblShowPercentage.setBounds(200,120,120,20);

    lblDivision=new JLabel("Division");
    lblDivision.setBounds(20,140,180,20);

    lblShowDivision=new JLabel("1st/2nd/3rd/Fail");
    lblShowDivision.setBounds(200,140,120,20);

    lblResult=new JLabel("Result");
    lblResult.setBounds(20,160,180, 20);

    lblShowResult=new JLabel("PASS/FAIL");
    lblShowResult.setBounds(200,160,120,20);

    btnGenerate.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(txtOOT.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter OOT Marks ");
                txtOOT.requestFocus();
                return;
            }
            else if(txtOOP.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter OOP Marks ");
                txtOOP.requestFocus();
                return;
            }
            else if(txtDB.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter DB MArks ");
                txtDB.requestFocus();
                return;
            }
            else {
                float oot=Float.parseFloat(txtOOT.getText());
                float oop=Float.parseFloat(txtOOP.getText());
                float db=Float.parseFloat(txtDB.getText());
                float marks= oot+oop+db;
                float percentage=marks/3;
                String division, result;
                 if(percentage<70&&percentage>60){
                    division="1st Division";
                    result="PASS";
                    lblShowDivision.setText(division);
                    lblShowResult.setText(result);

                }
                else if(percentage<60&&percentage>50){
                    division="2nt Division";
                    result="PASS";
                    lblShowDivision.setText(division);
                    lblShowResult.setText(result);

                }else if(percentage<50&&percentage>40){
                    division="3rt Division";
                    result="PASS";
                    lblShowDivision.setText(division);
                    lblShowResult.setText(result);

                }
                else if(percentage<40||oop<40||oot<40||db<40){
                    division="Fail";
                    result="Fail";
                    lblShowDivision.setText(division);
                    lblShowResult.setText(result);
                }

                lblShowMarks.setText(Float.toString(marks));
                lblShowPercentage.setText(Float.toString(percentage));


            }
        }
    });

    btnClose.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });


    myFrame.add(lblOOT);
    myFrame.add(lblOOP);
    myFrame.add(lblDB);
    myFrame.add(txtOOT);
    myFrame.add(txtOOP);
    myFrame.add(txtDB);
    myFrame.add(btnGenerate);
    myFrame.add(btnClose);
    myFrame.add(lblMarks);
    myFrame.add(lblPercentage);
    myFrame.add(lblDivision);
    myFrame.add(lblResult);
        myFrame.add(lblShowMarks);
        myFrame.add(lblShowPercentage);
        myFrame.add(lblShowDivision);
        myFrame.add(lblShowResult);


     myFrame.setVisible(true);
     myFrame.setLocationRelativeTo(null);
     myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Marksheet_Generator();
    }
}
