package Inheritance;

class Animal{
    String name;
    void action(){
        System.out.print("I can eat");
    }
}

class Dog extends Animal{
    void display(){
        System.out.print("My name is "+name); // name inherited from Parent class Animal
    }
}

public class Main{
    public static void main(String[] args) {
        Dog husky = new Dog();
        husky.name="Summer";
        husky.action();
        husky.display();            
    }
}

