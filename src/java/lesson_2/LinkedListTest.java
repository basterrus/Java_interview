package lesson_2;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> testList = new LinkedList<>();

        testList.add("One");
        testList.add("Two");

        System.out.println(testList);

        testList.remove("Two");
        System.out.println(testList);

        testList.add(1, "Three");
        System.out.println(testList);

        testList.add(1, "Four");
        System.out.println(testList);

        System.out.println(testList.get(1));
        System.out.println(testList.getFirst());
        System.out.println(testList.getLast());

        testList.removeLast();
        System.out.println(testList);

        testList.removeFirst();
        System.out.println(testList);

        System.out.println(testList.size());

        testList.addLast("Last");
        testList.addFirst("First");
        System.out.println(testList);

        System.out.println(testList.isEmpty());

        System.out.println(testList.contains("Four"));

    }
}
