package ExceptionalHandling;

public class Finally {
    public static void main(String[] args) {
        try{
            System.out.println(5/2);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException ==> "+e.getMessage());
        }  
        finally{
            System.out.println("the finally block is always executed no matter whether there is an exception or not.");
        }
    }
}

