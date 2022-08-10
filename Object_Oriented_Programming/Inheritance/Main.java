class Animal{
    
    String name;
    String type = "animal";

    Animal(){
        System.out.println("Super class constructor");
    }

    void action(){
        System.out.println("I can eat");
    }

    void override(){
        System.out.println("It's Animal class method overrided in Dog class");
    }
}

class Dog extends Animal{

    String type = "Mammal";

    Dog(){
        super(); // it will invoke super class no parametrized constructor
        // it can automatically calls the default or no-arg constructor even if we don't specify super()
        System.out.println("I am an "+super.type+" of type "+ type);
    }
    //we can call the constructor of the superclass from its subclasses using super()

    void display(){
        System.out.println("My name is "+name); // name inherited from Parent class Animal
    }
    @Override
    void override(){
        super.override(); // super keyword is used to call the method of the parent class from child class.
        System.out.println("It's Dog class");
    }
    //@Override annotation: In Java, annotations are the metadata .. used to provide information to the compiler. 
    // not mandatory to use 
    // We cannot override the method declared as final and static
}

public class Main{
    public static void main(String[] args) {
        Dog husky = new Dog();
        husky.name="Summer";
        husky.action();
        husky.display();    
        husky.override();        
    }
}

