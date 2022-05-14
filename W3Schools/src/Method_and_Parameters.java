public class Method_and_Parameters {
  static int main(int x){
      return x*x;
  }
  static void main (String fname)
  {
      System.out.println("Fuck You! "+fname);
  }
  static void main(String fname, int age){
      System.out.println(fname+" is "+age);
  }
  static void ageCheck(int age){
      if(age<18){
          System.out.println("Access denied, You are not old enough.");
      }
      else{
          System.out.println("Access granted, You are old enough");
      }
  }

    public static void main(String[] args) {
        System.out.println(main(3));
        main("Sexy");
        main("Sexy", 20);
        ageCheck(20);
    }

}

