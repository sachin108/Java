package ExceptionalHandling;

public class Throws {
    
    static int divide (int a, int b) throws ArithmeticException{
        return a/b;
    } 

    public static void main(String[] args) {
        try{
            System.out.println(divide(34, 17));
            System.out.println(divide(34, 0));
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide a number by 0!");
        }
    }
}
