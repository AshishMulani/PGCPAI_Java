package Collection;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList =new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        System.out.println(linkedList);

        LinkedList<Integer> newlinkedList =new LinkedList<>();

        newlinkedList.add(100);
        newlinkedList.add(200);
        newlinkedList.add(300);
        System.out.println(newlinkedList);
        linkedList.addAll(2,newlinkedList);
        System.out.println(linkedList);

        linkedList.remove(2);
        System.out.println(linkedList);

        linkedList.set(4,500);
        System.out.println(linkedList);

        System.out.println(linkedList.get(2));
    }
}
