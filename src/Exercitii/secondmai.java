package Exercitii;

import java.util.Scanner;

public class secondmai {
    public static void main(String[] args) {
//Scrie un program care afiseaza toate numerele de la x la y care sunt divizibile si cu 3 si cu 7 in acelasi timp, unde x si y sunt introduse de la tastatura.
//Date de intrare: x=1, y=22 => Rezultat: 21
//        Scanner console3 = new Scanner(System.in);
//        int n3;
//        System.out.println("introdu numarul");
//        n3 = console3.nextInt();
//
//        for (int i = 2; i < n3/2; i++) {
//
//            if (n3 % i ==0) {
//                System.out.println(n3+ " nu este prim");
//            } if (i*i >n3)
//                System.out.println( n3+ " este prim");
//            }


        //Scrie un program care calculeaza x la puterea y, unde x si y sunt introduse de la tastatura.
        //Date de intrare: x=2, y=3 => Rezultat: 8. Explicatie: 2 la puterea 3 este 2*2*2, adica 8
        Scanner console1 = new Scanner(System.in);
        int x1;
        System.out.println("introdu valoarea pentru x");
        x1 = console1.nextInt();
        int y1;
        System.out.println("introdu exponentul lui y");
        y1 = console1.nextInt();
        long rez = 1;
        while (y1 != 0) {
            System.out.println(Math.pow(x1, y1));
            rez *= x1;
        y1--;
    }
            System.out.println(rez);
        }
    }













