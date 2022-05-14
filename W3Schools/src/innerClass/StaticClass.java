package innerClass;
//In StaticClass we can access Innerclass without creating object of OuterClass
class OUterClass{
    int x = 5;

   static class InnerClass{
        int y=8;
    }
}

public class StaticClass {
    public static void main(String[] args) {
 OUterClass.InnerClass myInner = new OUterClass.InnerClass();
        System.out.println(myInner.y);
    }
}
