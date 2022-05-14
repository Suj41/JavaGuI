import java.util.Scanner;

import static java.lang.Character.toLowerCase;

public class Vowel_Checking {
    public static void main(String[] args){
         Scanner Sujal= new Scanner(System.in);
System.out.print("Enter NUmber:");
char chr =toLowerCase(Sujal.next().charAt(1));
        if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u')
        {
            System.out.print("Character " + chr + " is Vowel");

        }else{
            System.out.print("Character " +chr+ " is Consonant");
        }
    }
}
