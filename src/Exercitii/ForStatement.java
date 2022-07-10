package Exercitii;

import java.util.Scanner;

public class ForStatement {
    public static void main(String[] args) {

////Scrie un program care sa afiseze numerele de la 1 la 10
//        System.out.println("Numaratoare a inceput");
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        System.out.println("Numaratoare s-a incheiat");
//
//
//
//    //Scrie un program care sa afiseze numerele de la 10 la 1.
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }
//    }
//
//        //Scrie un program care sa afiseze suma numerelor de la 1 la 10.
//
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = i + sum;
//        }
//        System.out.println(sum);
//
//
//        //Scrie un program care sa afiseze numerele pare de la 1 la 10
//
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//
//                System.out.println(i);
//            }
//        }
//        //sau
//
//        for (int i = 2; i<=10; i+=2) {
//            System.out.println(i);
//        }
//        //afiseaza  suma nr divizibile
//        int sum2 = 0;
//     for (int i = 1; i<= 10; i++) {
//         if (i % 3 == 0) {
//             sum = sum + i;
//         }
//     }
//         System.out.println(sum2);
//
////factorial
//        Scanner console1 = new Scanner(System.in);
//        int n;
//        n = console1.nextInt();
//
//        System.out.println();
//        int f1 = 1;
//        for (int j = 1; j <= n; j++) {
//            f1 = f1 * j;
//            System.out.println(f1);
//
//        }

        // Scrie un program care sa caute un numar de telefon intr-o lista de numere. Programul va printa “numarul a fost gasit” sau “numarul nu a fost gasit”

        int[] numbers = {3, 14, 27, 51, 99};
        System.out.println(numbers[2]);
        System.out.println(numbers.length);
        numbers[3] = 52;
        System.out.println(numbers[3]);
        System.out.println("afisarea elementelor din array");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //// Scrie un program care sa caute un numar de telefon intr-o lista de numere. Programul va printa “numarul a fost gasit” sau “numarul nu a fost gasit”


//        int searchNumber = 3;
//        boolean isFound = false;
//        for (int i = 0; i < numbers.length; i++) {
//            //System.out.println([i]);
//            if (numbers[i] == searchNumber) {
//                System.out.println("Am gasit numarul");
//                isFound = true;
//               // i = numbers.length;
//                break; // folosit pt for
//            }
//        }
//        if (isFound == false) {
//            System.out.println("Nu Am gasit numarul");
//        }

        //Scrie un program care sa afiseze pretul mediu pe metru patrat, dintr-o lista de preturi ale unor proprietati imobiliare:
        //De exempu, pentru int[] prices = {1, 7, 3, 10, 9}, se va afisa in consola valoarea 6

        int sum = 0;
        int averagePrice = 0;
        int[] prices = {5, 25, 36, 14};
        System.out.println("Pretul /m3 este");
        for(int i = 0; i< prices.length; i++ ) {
            sum = sum + prices[i];
        }
        averagePrice = sum / prices.length;
        System.out.println(averagePrice);


    }
}





