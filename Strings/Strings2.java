import java.util.Arrays;

// string methods
public class Strings2 {
    public static void main(String[] args) {
        char[] arr={'a', 'b', 'c'};
        System.out.println(new String(arr)); // char array converted to string
        System.out.println(String.valueOf(arr)); // char array converted to string + it is an static method of class String

        String a="winds";
        arr=a.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(new String(arr));

        a="Dance of the dragons";
        System.out.println(a.contains("the dra")); // check for substring
        System.out.println(a.substring(1, 6)); // endIndex excluded 

        System.out.println(a.replace('a', 'x')); // replace characters 

        System.out.println(a.replaceAll("ance", "xyz")); // replace characters 
    }
}
