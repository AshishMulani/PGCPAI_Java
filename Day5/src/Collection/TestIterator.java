package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist =new ArrayList<>();

        arraylist.add(10);
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);

        Iterator<Integer> iterator = arraylist.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        for(int i=0; i<arraylist.size();i++){
//            System.out.println(arraylist.get(i));
//        }
    }
}
