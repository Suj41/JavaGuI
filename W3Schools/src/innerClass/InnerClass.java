package innerClass;
class OuterClass{
    int x =5;
    class INnerClass{
        int y=5;
    }
}
//Here We need to create object of an OUterClass to access inside Innerclass
public class InnerClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.INnerClass myInner = myOuter.new INnerClass();
        System.out.println(myOuter.x+myInner.y);
    }

}
