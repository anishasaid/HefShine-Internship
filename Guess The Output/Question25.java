package GTO;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class Question25 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(40);
        list.add(45);

        Set<Integer> s = new TreeSet<Integer>();
        s.add(20);
        s.add(35);
        s.add(35);
        s.add(55);
        s.add(45);

        for(int i=0; i<list.size(); i++){
            if(!s.add(list.get(i))){
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("\n" + s);
    }
}
