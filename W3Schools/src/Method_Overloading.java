public class Method_Overloading {
    static int main(int x, int y){
       return x+y;
    }
    static float main(int x, float y){
        return x+y;

    }
    public static void main(String[] args) {
        System.out.println(main(1,2));
        System.out.println(main(2,3f));
    }

}
