package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arraylist =new ArrayList<>();

        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        System.out.println(arraylist);

        ArrayList<Integer> newarraylist =new ArrayList<>();

        newarraylist.add(100);
        newarraylist.add(200);
        newarraylist.add(300);
        System.out.println(newarraylist);
        arraylist.addAll(2,newarraylist);
        System.out.println(arraylist);

        arraylist.remove(2);
        System.out.println(arraylist);

        arraylist.set(4,500);
        System.out.println(arraylist);

        System.out.println(arraylist.get(2));

        Collections.sort(arraylist);
        System.out.println(arraylist);

        //arraylist.clear();


    }
}
