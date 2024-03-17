package GTO;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Question17 {
    public static void main(String[] args) {
        NavigableSet<Integer> check = new TreeSet<Integer>();
        check.add(2);
        check.add(5);
        check.add(9);
        System.out.println(check.headSet(3));
    }
}
