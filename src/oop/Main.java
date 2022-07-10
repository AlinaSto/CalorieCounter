package oop;

public class Main {
    public static void main(String[] args) {
        //dog tip de data definit
        Dog dogLabus = new Dog(); // constructor
        dogLabus.age = 3;
        dogLabus.name = "Labus";
        dogLabus.color = "brown";
        //afisam age, name, color
        System.out.println(dogLabus.age);
        System.out.println(dogLabus.name);
        System.out.println(dogLabus.color);
        //apelam metoda
        dogLabus.bark();
        dogLabus.run();
        //declaram contructori in clasa Dog
    }
}
