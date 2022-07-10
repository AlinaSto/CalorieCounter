package teme;

import java.util.Random;
import java.util.Scanner;

public class TEMA2 {
    public static void main(String[] args) {
        //exercitiu1

        Scanner console = new Scanner(System.in);
        int day;
        System.out.println("Introdu numarul aferent zilei saptamanii:");
        day = console.nextInt();
        switch (day) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            default:
                System.out.println("Introdu un numar intre 1-5");

        }


        //exercitiu2

        Scanner console1 = new Scanner(System.in);
        int n;
        System.out.println("Introdu numarul al carui factorial va fi calculat:");
        n = console1.nextInt();
        int i = 1;
        int factorial = 1;
        while (i <= n) {
            factorial *= i;
            i++;
            System.out.println(factorial);
        }

        //exercitiu3

        Scanner console2 = new Scanner(System.in);
        int n1;
        System.out.println("Introdu numarul pentru care se va calcula suma cifrelor:");
        n1 = console2.nextInt();
        int sum = 0;
        while (n1 > 0) {
            sum = sum + (n1 % 10);
            n1 = n1 / 10;
            int result = sum + n1;
            System.out.println(result);
        }

        //exercitiu4


        Scanner console5 = new Scanner(System.in);
        int n2;
        System.out.println("Introdu numarul pentru care se va calcula suma numerelor divizibile cu 3 si suma numerelor divizibile cu 7:");
        n2 = console5.nextInt();
        int i2 = 1;
        int sum3 = 0;
        int sum7 = 0;
        while (i <= n) {
            if (i % 3 == 0) {
                sum3 += i;
            }
            if (i % 7 == 0) {
                sum7 += i;
            }
            i++;
        }
        System.out.println("suma numerelor divizibile cu 3 este " + sum3);
        System.out.println("suma numerelor divizibile cu 7 este " + sum7);


        //exercitiu5

        //import java.util.Random;
        //import java.util.Scanner;


        Random random = new Random();
        int answer = random.nextInt(10) + 1;
        Scanner console21 = new Scanner(System.in);
        System.out.println("Introdu prima posibilitate");
        int guess = 0;
        int noOfTry = 0;
        while (guess != answer) {
            guess = console21.nextInt();
            noOfTry++;

            if (guess < answer) {
                System.out.println("Numarul introdus este prea mic");

            } else if (guess > answer){
                System.out.println("Numarul introdus este prea mare");

            }
        }
        System.out.println("Felicitari! Ti-a luat " + noOfTry + " incercari pana ai reusit");
    }
}

