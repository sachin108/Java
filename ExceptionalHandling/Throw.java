package ExceptionalHandling;

public class Throw {

    static void divide(int a, int b){
        if(b==0)
            throw new ArithmeticException("\nCan't divie by zero!");
        else
            System.out.println(a/b);
    }

    public static void main(String[] args) {
        try{
            divide(2, 1);
            divide(12, 0);    
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurred!");
        }
    }
}
