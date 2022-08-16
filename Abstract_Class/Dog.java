    public class Dog extends Animal{

        Dog(){
            super("DOG"); // super statements should always be first 
            System.out.println(super.name);
        }

        public void makeSound(){
            System.out.println("I bark...");
        }

        public static void main(String[] args) {
            Dog obj=new Dog();    
            obj.makeSound();
            obj.eat();
            Animal.identity();
        }

    }
