public class Constructor {
    String fname;
    String lname;
    int age;
    public  Constructor(int y){
        fname = "Sujal";
        lname = "Shrestha";
        age = y;

    }

    public static void main(String[] args) {
        Constructor Obj = new Constructor(19);
        System.out.println("My name is "+Obj.fname+" "+Obj.lname+".");
        System.out.println("I am "+Obj.age+" years old.");
    }
}
