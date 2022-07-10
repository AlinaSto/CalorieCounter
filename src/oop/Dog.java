package oop;
//Creeaza clasa Dog:
//un caine are atributele: nume, culoare, varsta
//un caine are comportamentele: bark(latra), run(fuge)

//atribute
public class Dog {
    String name;
    String color;
    int age;
    //revenim din main si declaram constructor gol
    Dog () {
    }
    //declaram unul cu parametri
    Dog (String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }


    //comportamente -metode
    void bark(){
        System.out.println(name+ " latra ");
    }
    void run () {
        System.out.println(name+ " alearga ");
        //metegm in main, folder declaram variab de tip dog
    }
}
