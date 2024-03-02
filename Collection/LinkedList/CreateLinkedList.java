package Collection.LinkedList;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// create linkedlist and Methods of linkedlist

public class CreateLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println(list1);

        // set() method
        list1.set(3,100);
        System.out.println(list1);

        // convert list into arraylist
        ArrayList<Integer> al = new ArrayList<>(list1); 
        System.out.println("ArrayList : "+al);

        //returns true if it contain specified element
        System.out.println("contains method() : "+list1.contains(40));

        // get first element of the linkedlist
        System.out.println(list1.getFirst());
        // get last element of linkedlist
        System.out.println(list1.getLast());

        //retrive and remove head element of the likedlist
        int ele = list1.poll();
        System.out.println(ele);

        //clone the linkedlist
        LinkedList<Integer> list2 = (LinkedList<Integer>) list1.clone();
        System.out.println("clone of list1 : "+ list2);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        list3.add(400);
        list3.add(500);

        // add all list3 elements in list1;
        list1.addAll(list3);
        System.out.println(list1);

        //reverse() method
        Collections.reverse(list1);
        System.out.println("Reverse LinkedList list1 : "+list1);

        // Iterate the elements in reverse order
        System.out.println("iterate elements of list3 in increasing order : ");
        Iterator<Integer> itr = list3.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("iterate elements of list3 in decreasing order : ");
        Iterator<Integer> itr2 = list3.descendingIterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        //remove first and last element of linkedlist
        list1.removeFirst();
        list1.removeLast();
        System.out.println(list1);

        //remove element at specified index
        list1.remove(2);
        System.out.println(list1);
      
        //iterate through the linkedlist by for loop
        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i)+ " "+i);
        }

        //find the index of specified data
        System.out.println("first index of specified data : "+list1.indexOf(100));

        //find last index of specified data
        System.out.println("last index of specified data : "+list1.lastIndexOf(100));
    }
}
