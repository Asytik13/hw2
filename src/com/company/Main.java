package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class Main {
//
//    public static void main(String[] args) throws IOException{
//        BufferedReader reader =
//                new BufferedReader(new InputStreamReader(System.in));
//        String userInput = reader.readLine();
//
//    }
//
//
//}

public class Main {
    public static void main(String[] args){
//        Cat cat1 = new Cat("c1");
//        printName(cat1);
//
//        Dog dog1 = new Dog("d1");
//        printName(dog1);
        Person person = new Person("John");
        System.out.println(person.name);
    }
}

class Creature {
    String name;

    public Creature(){
    }

    public Creature(String name){
        this.name = name;
    }
}

class Person extends Creature {
    public Person(String name){
        super(name);
        System.out.println("initializing person");
    }
}

class Cat extends Creature {
    public Cat(String name){
        this.name = name;
    }
}

class Dog extends Creature {
    public Dog(String name){
        this.name = name;
    }
}