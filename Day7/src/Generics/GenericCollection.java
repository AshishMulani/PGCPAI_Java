package Generics;

import java.util.ArrayList;

public class GenericCollection {
    public static void main(String[] args) {

        ArrayList<String> sal = new ArrayList<>();
        sal.add("7");
        //sal.add(5);   //not possible

        ArrayList al = new ArrayList<>();

        al.add(5);
        al.add("5");

        System.out.println(al);
    }
}
