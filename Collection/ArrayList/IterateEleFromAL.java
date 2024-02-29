package Collection.ArrayList;

import java.util.ArrayList;

public class IterateEleFromAL {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        
        //for each loop
        for(int data : al){
            System.out.println(data+" ");
        }
        System.out.println("************************");
        // iterate using while loop
        int i = 0; 
        while (i < al.size()) {
            System.out.print(al.get(i)+" ");
            i++;
        }
        System.out.println("*************************");
        // Iterate using for loop
        for(int j= 0; j<al.size(); j++){
            System.out.print(al.get(j)+" ");
        }
    }
}
