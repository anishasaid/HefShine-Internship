package Collection.LinkedList;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDublicate {
    public static void main(String[] args) {
        
        int a[] = {11,22,33,11,22,44,55,66,55,66};

        LinkedList<Integer> ll = new LinkedList<>();

        for(int data : a){
            if(ll.contains(data)){
                continue;
            }else{
                ll.add(data);
            }
        }

        System.out.println(ll);
    }
}
