package Generics;

import java.util.ArrayList;
import java.util.*;

public class TestStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.stream().count());

        list.add("a");
        System.out.println(list.stream().count());

//        System.out::print("Hi");
    }
}
