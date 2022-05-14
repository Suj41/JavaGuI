import java.util.HashSet;
public class HashSetting {
    public static void main(String[] args) {
      HashSet<Integer> obj= new HashSet<Integer>();
      obj.add(1);
      obj.add(1);
      obj.add(1);
      obj.add(1);
      obj.add(1);
      obj.add(2);
      obj.add(3);
      obj.add(4);
      obj.add(5);
      obj.add(6);
      obj.add(7);
      obj.add(8);
        System.out.println(obj.contains(9));
        System.out.println(obj.size());
       obj.remove(2);
        for (int i=01; i<=10; i++)
        {
            if(obj.contains(i)){
                System.out.println(i+" is found");
            }
            else {
                System.out.println(i+ " is not found");
            }
        }


    }
}
