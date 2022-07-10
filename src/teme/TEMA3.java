package teme;

import java.util.Scanner;

public class TEMA3 {
    public static void main(String[] args) {


//1 Scrie un program care sa afiseze media numerelor consecutive de la x la y, unde x si y sunt introduse de la tastatura.
//Date de intrare: x=3, y=5 => Rezultat: 4. Explicatie: (3+4+5)/3

        Scanner console = new Scanner(System.in);
        int x;
        System.out.println("introdu valoarea pentru x");
        x = console.nextInt();
        int y;
        System.out.println("introdu valoarea pentru y");
        y = console.nextInt();
        int rez = 0;
        int mean = 0;
        for (int i = x; i <= y; i++) {
            rez = rez + i;
        }
        mean = rez / 3;
        System.out.println(mean);

// 2  Scrie un program care afiseaza toate numerele de la x la y care sunt divizibile si cu 3 si cu 7 in acelasi timp, unde x si y sunt introduse de la tastatura.
//    Date de intrare: x=1, y=22 => Rezultat: 21

        Scanner console1 = new Scanner(System.in);
        int x1;
        System.out.println("introdu valoarea pentru x");
        x1 = console1.nextInt();
        int y1;
        System.out.println("introdu valoarea pentru y");
        y1 = console1.nextInt();
        int var = 0;
        for (int i = x1; i <= y1; i++) {
            // System.out.println(i );
            if ((i % 3 == 0) && (i % 7 == 0)) {
                System.out.println(i);
            }
        }

//3  Scrie un program care verifica daca un numar introdus de la tastatura este numar prim (adica daca se imparte exact doar la 1 si la el insusi)
//Date de intrare: x=7 => Rezultat: “7 este numar prim”
//Date de intrare: x=12 => Rezultat: “12 nu este numar prim”

        Scanner console3 = new Scanner(System.in);
        int n3;
        System.out.println("introdu valoarea pentru n3");
        n3 = console3.nextInt();

        for (int i = 2; i <= n3; i++) {
            if (n3 % i == 0) {
                System.out.println(n3 + "este prim");
            } else {
                System.out.println(n3 + "nu este prim");
            }
        }
//4   Scrie un program care calculeaza x la puterea y, unde x si y sunt introduse de la tastatura.
        // Date de intrare: x=2, y=3 => Rezultat: 8. Explicatie: 2 la puterea 3 este 2*2*2, adica 8
        Scanner console5 = new Scanner(System.in);
        int x12;
        System.out.println("introdu valoarea pentru x");
        x12 = console5.nextInt();
        int y12;
        System.out.println("introdu exponentul lui x");
        y12 = console5.nextInt();
        long rez2 = 1;
        while (y12 != 0) {
            // System.out.println(Math.pow(x12, y12));
            rez *= x12;
            y12--;
        }
        System.out.println(rez);

        // 5      5Esti programator si dezvolti un magazin online. Ai nevoie sa calculezi pretul total al produselor din cosul de cumparaturi, pentru a-l afisa utilizatorului. Scrie un program care sa afiseze suma preturilor dintr-o lista de preturi.
//           Date de intrare: int[] prices = {1, 7, 3, 10, 9}=> Rezultat: 30
        int total1 = 0;
        int[] prices = {1, 7, 3, 10, 9};
        for (int i = 0; i < prices.length; i++) {
            total1 = total1 + prices[i];
        }
        //6   System.out.println("Totalul este " + total1);
        //  Esti programator si dezvolti un magazin online. Ai nevoie sa calculezi cel mai mare si cel mai mic pret dintr-o lista de preturi pentru a le afisa utilizatorului. Scrie un program care sa determina cel mai mare si cel mai mic numar dintr-o lista.
        //Date de intrare: int[] prices = {1, 7, 3, 10, 9}, => Rezultat: “Cel mai mic pret este 1, iar cel mai mare pret este 10”


        int[] prices2 = {1, 7, 3, 10, 9};
        int maxPrice = prices2[0];
        int minPrice = prices2[0];
        for (int i = 0; i < prices2.length; i++) {
            // maxPrice = Math.max(maxPrice, prices2[i]);
            // minPrice = Math.min(minPrice, prices2[i]);
            if (minPrice < prices[i]) {
                minPrice = prices[i];
                System.out.println("cel mai mic pret este:" + minPrice);
            } else if (maxPrice > prices[i]) {
                maxPrice = prices[i];
                System.out.println("cel mai mare pret este:" + maxPrice);
            }
        }

        //7   Scrie un program care sa afiseze cate numere pare si cate numere impare se afla intr-un array:
        //     Date de intrare: int[] prices = {1, 7, 3, 10, 9} => Rezultat: “4 numere impare si 1 numar par"

        int[] prices3 = {1, 7, 3, 10, 9};
        int parNo = 0;
        int imparNo = 0;
        for (int i = 0; i < prices3.length; i++) {

            if (prices3[i] % 2 == 0) {
                // number = prices3.length ;
                parNo++;
            } else {
                imparNo++;
            }
        }
        System.out.println(imparNo + " numere impare");
        System.out.println(parNo + " numere pare");


        //8  Esti programator si dezvolti un magazin online. Vrei sa dai posibilitatea utilizatorului sa vada lista de produse de la coada la cap.
        //         Scrie un program care sa inverseze elementele unui array si sa le afiseze in consola.
        //  Date de intrare:  int[] prices = {1, 7, 3, 10, 9} => Rezultat: 9, 10, 3, 7, 1
        int[] prices4 = {1, 7, 3, 10, 9};
        int[] reversePrices = new int[5];
        int j = 0;
        for (int i = prices4.length - 1; i >= 0; i--) {
            reversePrices[j] = prices4[i];
            j++;
        }
        for (int i = 0; i < reversePrices.length; i++) {
            System.out.println(reversePrices[i]);
        }
    }
}
