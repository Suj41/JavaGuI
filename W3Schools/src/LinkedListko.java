import java.util.LinkedList;
public class LinkedListko {
    public static void main(String[] args) {
      LinkedList<String> obj=new LinkedList<String>();
      obj.add("Sujal");
      obj.add(" has a ");
      obj.add("crush on ");
      obj.add("Pransu");
      obj.addFirst("Yes ");
      obj.addLast("Karki");
        System.out.println(obj.get(4));
        obj.remove(2);
        for(String i:obj){
            System.out.println(i);
        }

    }
}
