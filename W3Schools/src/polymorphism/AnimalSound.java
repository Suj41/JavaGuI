package polymorphism;

public class AnimalSound extends Animal{
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.print("Fucking Dog Says:");
        animal.dog();
        System.out.println("");
        System.out.print("Fucking Cat Says:");
        animal.cat();

    }
}
