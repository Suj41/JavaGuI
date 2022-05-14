import java.util.Random;
public class RandomValue {
    public static void main(String[] args) {
       Random rd = new Random();
       int r1 = rd.nextInt(100);
        System.out.println(r1);
        int r2 = rd.nextInt(10);
        System.out.println(r2);
    }
}
