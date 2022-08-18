package ExceptionalHandling;

import java.lang.module.FindException;

import javax.naming.NoPermissionException;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int len=arr.length;
        try{
              throw new NoPermissionException();  
//            will be caught by Exception block

//            int dvision=arr[12]/0; 
//            will be caught by ArraysIndex... block
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurred!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArraIndexOutOfBounds Exception occurred!");
        }
        catch(Exception e){     // this is root class of all exceptions 
            System.out.println("An Exception occurred!");
        }
    }
}
