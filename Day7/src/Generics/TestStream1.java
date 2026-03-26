package Generics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestStream1 {
    public static void main(String[] args) {

        List list = Arrays.asList("java","python","c++");
        list.stream().forEach(System.out::println);

        List names = Arrays.asList("Alice","Bob","Charlie");
        names.stream().filter(n ->n.toString().startsWith("A")).forEach(System.out::println);

        List fruits = Arrays.asList("apple","aavacado","banana");
        fruits.stream().filter(w ->w.toString().startsWith("a")).map(w->w.toString().toUpperCase()).forEach(System.out::println);

//        int sum = IntStream of
    }
}
