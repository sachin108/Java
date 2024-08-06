import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        List<String> filteredNames = names.stream()
                                          .filter(name -> name.startsWith("A"))
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());

                                    // Chain of Operations

                                    /*
                                     * names.stream()
                                            Purpose: Converts the List<String> names into a Stream of Strings.

                                     * map(Function<? super T,? extends R> mapper)
                                            Returns a stream consisting of the results of applying the given function 
                                            to the elements of this stream.

                                     * .collect(Collectors.toList())
                                            The collect method is a terminal operation that transforms the elements of 
                                            the stream into a different form. Here, it uses Collectors.toList() to collect 
                                            the elements into a List. This effectively materializes the stream into a list 
                                            containing all the filtered and transformed elements.
                                     */

        System.out.println(filteredNames); 
    }
}
