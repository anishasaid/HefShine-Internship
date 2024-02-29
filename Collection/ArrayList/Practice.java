package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        //create arraylist
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // Collections.reverse(al);
        // System.out.println(al);

        // Collections.shuffle(al);
        // System.out.println(al);

        // Collections.sort(al);
        // System.out.println(al);

        // al.remove(3);
        // System.out.println(al);

        // al.set(3,100);
        // System.out.println(al);

        // System.out.println(al.get(2));

        // List<Integer> sublist = al.subList(1, 3);
        // System.out.println(sublist);

        // ArrayList<Integer> al2 = new ArrayList<>(al);
        // // al2.add(5,100);
        // // System.out.println(al2);

        // al.addAll(al2);
        // System.out.println(al2);

        ArrayList<Integer> newal = (ArrayList<Integer>) al.clone();
        System.out.println(newal);

    }
}
