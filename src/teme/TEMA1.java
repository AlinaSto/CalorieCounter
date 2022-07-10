package teme;

class TEMA1 {
    public static void main(String[] args) {
        //exercitiu 1
        int a = 10;
        int b = 20;
        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

        //exercitiu2
        double a3 = 4;
        double b3 = 3;
        double c3 = 1;
        double totalSum;
        totalSum = (a3 + b3 + c3) / 3;
        System.out.println(totalSum);


        //exercitiu3
        int temperatureF = 95;
        int temperatureC;
        temperatureC = ((temperatureF - 32) * 5) / 9;

        System.out.println(temperatureC);


        //If statement
        //exercitiu 1
        int a2 = 14;
        int b2 = 13;
        if (b2 >= a2) {
            System.out.println("numarul mai mai mare este " + b2);
        } else {
            System.out.println("numarul mai mare este " + a2);
        }


        //exercitiu2
        int a1 = 12;
        if (a1 % 2 == 0) {
            System.out.println("numarul este par");
        } else {
            System.out.println("numarul este impar");

        }

        //exercitiu3
        String currentForecast = "rainy";
        int currentWindSpeed = 30;
        if (currentForecast == "rainy" || currentForecast == "snowing" && currentWindSpeed >= 30) {
            System.out.println("Ramai in casa, este periculos afara");
        } else
            System.out.println("Poti face o plimbare in aer liber");


        //exercitiu4
        int number = 6;
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (number % 3 == 0) {
            System.out.println("fizz");
        } else if (number % 5 == 0) {
            System.out.println("buzz");
        } else
            System.out.println("nu se incadreaza");

        //exercitiu5
        int a5 = 1;
        int b5 = 2;
        int c5 = 3;
        if (a5 == b5 && b5 == c5) {
            System.out.println("Toate numerele sunt egale");
        } else if (a5 != b5 && b5 != c5) {
            System.out.println("Toate numerele sunt diferite");
        } else {
            System.out.println("cel putin doua numere sunt egale");
        }
        //exercitiu6
        int year = 2020;
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 1) {
            System.out.println("anul " + year + " este bisect");
        } else {
            System.out.println("nu este an bisect");

        }

        //exercitiu7
        int guess = 7;
        int answer = 7;
        if (answer > guess) {
            System.out.println("Nu ai ghicit, numarul este prea mare");
        } else if (answer < guess) {
            System.out.println("Nu ai ghicit, numarul este prea mic");
        } else {
            System.out.println("Ai ghicit solutia");

        }
    }

}