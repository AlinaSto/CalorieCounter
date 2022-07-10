package Exercitii;

import javax.sound.midi.Soundbank;
import java.security.spec.ECFieldF2m;
import java.util.Scanner;

public class StringMetode {
    public static void main(String[] args) {
        //EX1 Scrie un program pentru a afisa lungimea unui String:
        //De exemplu, pentru String a = “This is Java”, se va afisa in consola valoarea 13.
        computeLenght();
        getChar();
       // reverseString();
        //Ex2 Scrie un program care sa afiseze caracterul de la un anumit index din String.

        Scanner console = new Scanner(System.in);
        System.out.println("introducti textul care se va inversa");
        String word = console.nextLine();
        String reverseWord = reverseString(word);
        System.out.println(reverseWord);
    }


    public static void computeLenght() {
        Scanner console = new Scanner(System.in);
        System.out.println("introduceti textul");
        String text = console.nextLine();
        //text.length();
        int length = text.length();
        System.out.println("lungimea textului este:" + length);

    }

    public static void getChar() {

        Scanner console = new Scanner(System.in);
        System.out.println("Introduceti textul");
        //citim de la tastatura
        String text = console.nextLine();
        System.out.println("introduceti indexul");
        int index = console.nextInt();
        char caracter = text.charAt(index);
        System.out.println("caracterul de la pozitia " + index + " este " + caracter);
    }

    //Vrei ca atunci cand utilizatorul isi introduce o parola la cont, sa o introduci inversata in baza de date, pentru a nu putea fi citita de altcineva. Sa speram ca nimeni nu se prinde. Scrie un program care inverseaza un cuvant:
    //De exemplu, pentur String word= “avaJ”, se va afisa in consola “Java”
    //Foloseste functia reverse, apoi rezolva problema fara sa folosesti metoda reverse().

    public static String reverseString(String word) {
        String reverse = ""; //gol
        for (int i = word.length()-1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse;

    }
}
