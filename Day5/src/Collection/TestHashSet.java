package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestHashSet {
    public static void main(String[] args) {

        //HashSet<Integer> hashset = new HashSet<>();                   //unordered array- prints randomly
        //LinkedHashSetTreeSet<Integer> hashset = new TreeSet<>();      //sorted array
        LinkedHashSet<Integer> hashset = new LinkedHashSet<>();         //ordered array-prints sequentially

        hashset.add(150);
        hashset.add(20);
        hashset.add(450);
        hashset.add(350);
        hashset.add(450);  //no duplicate
        System.out.println(hashset);

        hashset.remove(20);
        System.out.println(hashset);
    }
}
