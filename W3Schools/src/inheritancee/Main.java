package inheritancee;



public class Main extends Car{
    private  String yoyo = "Yes You!";
    public static void main(String[] args) {
        Car obj = new Car();
        Main obj1 = new Main();
        obj.function();
        System.out.println(obj.carName+" "+obj1.yoyo);
    }


}
