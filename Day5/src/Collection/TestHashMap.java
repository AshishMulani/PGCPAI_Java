package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();

        System.out.println(hashmap.put(0,"DD"));
        System.out.println(hashmap.put(18,"DD"));
        System.out.println(hashmap.put(2,"Ash"));
        System.out.println(hashmap.put(1,"Viju"));
        System.out.println(hashmap.put(10,"Pap"));
        System.out.println(hashmap.put(16,"Patya"));     //prints the null as it's the first values

        Set<Map.Entry<Integer, String>> set = hashmap.entrySet();

        for(Map.Entry<Integer, String> entry: set){
            System.out.print(entry.getKey()+" ");  //prints in the sequence of remainder after dividing by 16
            System.out.println(entry.getValue());  //0,16,1,18,2,10
        }

        Set<Integer> keySet = hashmap.keySet();
        for(Integer i: keySet){
            System.out.println(hashmap.get(i));
        }
    }
}
