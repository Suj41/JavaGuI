public class Method_Recursion{
    public static void main(String[] args){
        System.out.println(main(10));
    }
   public static int main(int x){
      if(x>0){
          return x+(main(x-1));
      }
      else{
          return 0;
      }

  }
}
