import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        Stream<String> nameStream = names.stream()
                                         .filter(name -> {
                                             System.out.println("Filtering: " + name);
                                             return name.startsWith("A");
                                         })
                                         .map(name -> {
                                             System.out.println("Mapping: " + name);
                                             return name.toUpperCase();
                                         });

        System.out.println("Stream created, no operations have been performed yet.");

        // Trigger the processing with a terminal operation
        nameStream.forEach(name -> System.out.println(name));
    }
}
/*
forEach is a terminal operation on a stream that performs an action for each element of the stream. It consumes 
the stream, meaning after forEach is called, the stream cannot be reused.

In Java, streams are designed to be used once. After a terminal operation, such as forEach, is called, the stream 
is considered consumed and cannot be reused.
*/