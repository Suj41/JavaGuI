

public class ClassMethods {
    public void Main(){
        System.out.println("Fuck You!");
    }
    static void main(){
        System.out.println("Yes You!");

    }

    public static void main(String[] args) {
        main();
        ClassMethods Obj = new ClassMethods();
       Obj.Main();
    }

}
