public class Static_Block {
    static{
        System.out.print("hello java");
    }
}
/*Can we print something on the console without creating main() method? 
    The answer is yes we can print if we are using JDK version 1.6 or previous 
    and if after that  it will throw an. error. */

/*
 * A class can have any number of static initialization blocks, and they can appear
 * anywhere in the class body. The runtime system guarantees that static 
 * initialization blocks are called in the order that they appear in the source code.
 */