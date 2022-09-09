interface MyInterface{      // Functional Interface
    double value_Of_Pi();
}

public class Lambda2 {
    public static void main(String[] args) {
        MyInterface ref; // declare a reference to MyInterface
        ref = () -> 3.14;
        System.out.println(ref.value_Of_Pi());

        ref = () ->{
            System.out.println("lambda with block body");
            return 3.14;
        };
        System.out.println(ref.value_Of_Pi());
    }
}

/*
it will throw an error
        MyInterface ref = new myInterface();

it is valid
        MyInterface ref;

 */
