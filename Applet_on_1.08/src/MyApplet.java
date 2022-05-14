import java.applet.Applet;
// java.applet.MyApplet;
import java.awt.*;
public class MyApplet extends Applet {
    TextField txtFirst,txtSecond;
    Label lblFirst,lblSecond,lblResult;
    Button btnAdd,btnSubtract;

    @Override
    public void init() {
        super.init();
        // initializtion
        setLayout(null);
        lblFirst = new Label("Enter first no :");
        lblFirst.setBounds(20, 20, 150, 20);
        txtFirst = new TextField();
        txtFirst.setBounds(170, 20, 150, 20);
        lblSecond = new Label("Enter second no :");
        lblSecond.setBounds(20 , 50, 150, 20);
        txtSecond = new TextField();
        txtSecond.setBounds(170,50, 150, 20);

        add(lblFirst);
        add(txtFirst);
        add(lblSecond);
        add(txtSecond);
    }
}
/*
<applet code="MyApplet.class" width="350" height="200"></applet>
 */



