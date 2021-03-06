/**
 * Java 1. Homework 6
 * @author Oleg
 * @version 03.02.21
 */
class JavaHomework5 { 
    public static void main(String[] args) {
        IAnimal[] animals = {
            new Cat ("Cream", "blue", 2);
            new Dog ("Bobik", "black", 1)
        }
        for (IAnimal animal : animals) {
            System.out.println (animal);
            System.out.println (animal.voice());
            System.out.println (animal.run());
            System.out.println (animal.swim());
        }
    }
}

interface IAnimal {
    public String voice ();
    public String run ();
    public String swim ();
}

class Animal implements IAnimal { //super class
    private String name;
    private String color;
    private int age;
    private int runDistance;
    private int swimDistance;

    Animal(String name, string color, int age, int runDistance, int swimDistance) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public String getRunDistance (String runDistance) { 
        return runDistance;
    }

    public String getSwimDistance (String swimDistance) { 
        return swimDistance;
    }

    @Override
    public String toString() {
        return (name + 
            "\n| Color: " + color +
            "\n| Age: " + age;
    }
}

class Cat extends Animal { // extends class 1
    Cat(String name, string color, int age, int runDistance, int swimDistance) {
        super(name, color, age, runDistance, swimDistance);
    }
    @Override
    public String voice () {
        return "meow!";
    }
    public String run (animal.getRunDistance) {
        return animal.getRunDistance >=200 ? "The cat ran: " + animal.getRunDistance + " m" : "The cat cannot run more than 200 m, please enter another value:" + int runDistance ;
    }
    public String swim (animal.getSwimDistance) {
        return animal.getSwimDistance >=0 ? "Sorry, the cat has paws, he can't swim" ;
    }
}

class Dog extends Animal { // extends class 2
    Dog(String name, string color, int age, int runDistance, int swimDistance) {
        super(name, color, age, runDistance, swimDistance);
    }
    @Override
    public String voice () {
        return "Gav!";
    }
    public String run (animal.getRunDistance) {
        return animal.getRunDistance >=500 ? "The dog ran: " + animal.getRunDistance + " m" : "The dog cannot run more than 500 m, please enter another value:" + int runDistance ;
    }
    public String swim (animal.getSwimDistance) {
        return animal.getSwimDistance >=10 ? "The dog ran: " + animal.getRunDistance + " m" : "The dog cannot swim more than 500 m, please enter another value:" + int runDistance ;
    }
}