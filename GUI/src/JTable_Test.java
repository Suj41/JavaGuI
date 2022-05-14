import javax.swing.*;

public class JTable_Test {

    JTable table;
    JFrame frame;

    public JTable_Test(){
        frame = new JFrame();
        String[][]data= {{"SUjal","101","It"},{"Pransu", "102","BBA"},{"Deepak","103","MBBS"},{"SUjal","101","It"},{"Pransu", "102","BBA"},{"Deepak","103","MBBS"},{"SUjal","101","It"},{"Pransu", "102","BBA"},{"Deepak","103","MBBS"},{"SUjal","101","It"},{"Pransu", "102","BBA"},{"Deepak","103","MBBS"},{"SUjal","101","It"},{"Pransu", "102","BBA"},{"Deepak","103","MBBS"}};
        String[] colname={"Name"," Roll NUmber", "Subject"};
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(null);
        frame.setLocationRelativeTo(null);


        table=new JTable(data,colname);
        table.setBounds(30,40,200,300);

        JScrollPane Jscroll= new JScrollPane(table);



        frame.add(Jscroll);


        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new JTable_Test();
    }

}
