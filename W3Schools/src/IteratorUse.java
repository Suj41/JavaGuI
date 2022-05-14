import java.util.ArrayList;
import java.util.Iterator;
public class IteratorUse {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(8);
        Iterator<Integer> it= obj.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//use comment in first while loop to perform remove operation
        System.out.println("next");
        while (it.hasNext()){
            Integer i = it.next();
            if(i>5){
                it.remove();
            }
        }
        System.out.println(obj);

    }
}
