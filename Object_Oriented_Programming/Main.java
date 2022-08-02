// Classes and Objects
public class Main{
    String name;            // belongs to object
    static int number=108;  // belongs to class

    Main(){

    }
    // These are constructors of class invoked when we create an object
    Main(String name){
        this.name=name;
    }
    
    // main method is entry point of every java program and it should be
    // inside the public class which has the same name as of source code file
    public static void main(String[] args) {
        Main person=new Main("Jon");

        System.out.println(person.name);
        System.out.print(number);
    }
}
class xyz{
    // No use of this main method 
    public static void main(String[] args) {
        System.out.print("HELLO!");
    }
}