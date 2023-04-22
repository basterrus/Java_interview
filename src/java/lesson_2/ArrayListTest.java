package lesson_2;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add(0, "Two");
        arrayList.add("Three");
        System.out.println(arrayList);

        System.out.println(arrayList.get(1));

        arrayList.remove("Two");
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.contains("One"));
        System.out.println(arrayList.isEmpty());


    }
}
