package interFaces;

public class Interfaces implements  IMplementsA, IMplementsB{
    @Override
    public void implemetsA() {
        System.out.println("YES YOU!");
    }

    @Override
    public void implementB() {
        System.out.println("Fuck You!");
    }
}
