package methods;

public class recursion {
    public static void main(String[] args) {
        int num=5;
        System.out.println("factorial is "+ recurion(num));

    }
    public static int recurion(int num){
        if(num==0) {
            return 1;
        }
        else{

          return num*recurion(num-1);
        }


    }
}
