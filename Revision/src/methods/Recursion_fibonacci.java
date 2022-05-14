package methods;

public class Recursion_fibonacci {
    public static void main(String[] args) {
        int num=5;
        System.out.println(fibo(num));
    }
    public static int fibo(int num){
        if(num==0)
            return 1;
        else if (num==1)
            return 1;
        else
            System.out.println(num+fibo(num-1));
            return 1;


    }
}
