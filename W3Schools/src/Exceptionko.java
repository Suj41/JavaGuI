public class Exceptionko {
    public static void main(String[] args) {
        int age=15;
        try{
            if(age>18){
                System.out.println("access granted");
            }
            else {
                throw new ArithmeticException("error");
            }
        } catch (Exception e){
            System.out.println("error");
        }
    }
}
