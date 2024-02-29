package Collection.ArrayList;
// Differernt methods of Arraylist and Collections.
// Collections is a uitility class -  which helps the collection interface
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class MethodsOfAL {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        ArrayList<Integer> al3 = new ArrayList<>();

        al3.add(10);
        al3.add(20);

        // 1. reverse the arraylist - Collections.reverse();
        Collections.reverse(al);
        System.out.println(al);

        //2. shuffle arraylist- Collections.shuffle()
        Collections.shuffle(al);
        System.out.println(al);

        //3. sort the arraylist - Collections.sort(al)
        Collections.sort(al);
        System.out.println(al);

        //4. remove element - remove(index)
        al.remove(2);
        System.out.println(al);

        //5. set element at specified index location - set(index, data)
        al.set(1,100);
        System.out.println(al);

        //get element at perticular index - get(index)
        System.out.println(al.get(0));

        //extaract some portion of arraylist
        List<Integer> subList = al.subList(1, 2+1);
        System.out.println(subList);

        //join two arraylist
        // 1. by using constructor
        ArrayList<Integer> al2 = new ArrayList<>(al);
        System.out.println(al2);

        //2. by using add all method
        al.addAll(al2);
        System.out.println(al);

        //check equality
        System.out.println(al.equals(al3));

        // make copy of arraylist - clone()
        // clone method returns an object, so we need to type cast it into arraylist
        ArrayList<Integer> newAL = (ArrayList<Integer>) al.clone();
        System.out.println(newAL);
 
    }
}
