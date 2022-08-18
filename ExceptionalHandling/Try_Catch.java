package ExceptionalHandling;
public class Try_Catch{
    public static void main(String[] args) {
        try{
            System.out.println(5/0);
            System.out.println("After handling of exception, execution won't return to remaining code of try block");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException ==> "+e.getMessage());
        }
        System.out.println("After handling of exception, execution won't return to remaining code of try block");
    }
}