import  java.util.*;
import static java.lang.Character.toLowerCase;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Letter :");
        char chr = toLowerCase(sc.next().charAt(0));
        if(chr=='a'||chr=='e'|| chr=='i'||chr=='o'||chr=='u'){
            System.out.println("Letter is vowel.");
        }else {
            System.out.println("Letter is consonant.");
        }
    }
}
