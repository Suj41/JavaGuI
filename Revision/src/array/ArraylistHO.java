package array;
import java.util.ArrayList;
import java.util.Collections;


public class ArraylistHO {
    public static void main(String[] args) {

        ArrayList<String> sujal=new ArrayList<String>();
        sujal.add("Pransu");
        sujal.add("I Love You");
        sujal.add("I have a crush on you ");
        sujal.add(" Since, I saw you for the first time ");
        sujal.get(0);
        sujal.set(1,"Marry me");
        System.out.println(sujal);
        System.out.println(sujal.get(0));
        sujal.remove(1);
        System.out.println(sujal);
        System.out.println(" ");
        for (int i=0; i< sujal.size(); i++){
            System.out.println(sujal.get(i));
        }
        Collections.sort(sujal);
        for (String i: sujal){
            System.out.println(i);
        }

    }
}
