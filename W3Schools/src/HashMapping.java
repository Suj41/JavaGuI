import java.util.HashMap;
public class HashMapping {
    public static void main(String[] args) {
        HashMap<String, String> obj= new HashMap<String, String>();
        obj.put("Nepal", "Kathmandu");
        obj.put("India ", "Delhi ");
        obj.put("China ", "Bejing ");
        obj.put("Japan ", "Tokyo ");
        obj.remove("Japan ");
        System.out.println(obj);
        System.out.println(obj.get("India "));
        System.out.println(obj.size());
        for (String i:obj.keySet()){
            System.out.println("KeySet is "+i);
        }
        for (String i:obj.values()){
            System.out.println("Values is "+i);
        }
        for (String i:obj.keySet()){
            System.out.println("Keyset is "+i+" Values are "+obj.get(i));
        }
    }
}
