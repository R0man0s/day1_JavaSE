package s18_v60.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

//        //Integer Stream with Skip
//        IntStream
//                .range(1, 10)
//                .skip(5) // skip 5 elements of the stream
//                .forEach((x) -> System.out.print(x));

        //Integer Stream with Sum

//        int val = IntStream
//                .range(1, 5)
//                .sum();
//        System.out.println(val);

        Stream.of("Hello", "bottle", "Africa")
                .sorted()
                .findFirst()
                .ifPresent((x) -> System.out.println(x));

    }
}
