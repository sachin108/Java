abstract class Animal{

    abstract void makeSound();
    
    String name;

    Animal(){

    }

    Animal(String name){
        this.name=name;
    }

    public void eat(){
        System.out.println("I can eat");
    }

    public static void identity(){
        System.out.println("I am an animal");
    }
}