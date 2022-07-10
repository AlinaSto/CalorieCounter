package practice_home;

import java.util.Scanner;

public class Practice {


    //palindrom
    public boolean isPalindrom(String getWord) {
        boolean isPalindrom = false;
        String reverseMethod = "";
        for (int i = getWord.length() - 1; i >= 0; i--) {
            reverseMethod = reverseMethod + getWord.charAt(i);
        }
        System.out.println(reverseMethod);
        if (getWord == reverseMethod) { // SAU getWord.equals(reverseString)
            isPalindrom = true;
            System.out.println(getWord + " Este palindrom");
        } else {
            System.out.println(getWord + " nu este palindrom");
        }
        return isPalindrom;
    }

    public static void computeLenght() {
        Scanner console = new Scanner(System.in);
        System.out.println("introduceti textul");
        String text = console.nextLine();
        //text.length();
        int length = text.length();
        System.out.println("lungimea textului este:" + length);

    }

    public void takeExponent() {
        //Scrie un program care calculeaza x la puterea y, unde x si y sunt introduse de la tastatura.
        //Date de intrare: x=2, y=3 => Rezultat: 8. Explicatie: 2 la puterea 3 este 2*2*2, adica 8
        Scanner console1 = new Scanner(System.in);
        int x1;
        System.out.println("introdu valoarea pentru width");
        x1 = console1.nextInt();
        int y1;
        System.out.println("introdu exponentul lui height");
        y1 = console1.nextInt();
        long rez = 1;
//        while (y1 != 0) {
//            System.out.println(Math.pow(x1, y1));
//            rez *= x1;
//            y1--;

        System.out.println(rez);
        char diez = '#';
        int compute = 0;
        for (int i = 1; i <= y1; i++) {
           compute += diez;
           y1--;
        }
        System.out.println(compute);
        }
    }