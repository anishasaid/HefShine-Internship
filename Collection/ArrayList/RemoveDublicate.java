package Collection.ArrayList;
// remove dublicate elements by using arraylist
import java.util.ArrayList;

public class RemoveDublicate {
    public static void main(String[] args) {
        
        int a[] = {11,22,55,44,22,11,33,66,33};

        ArrayList<Integer> al = new ArrayList<>();

        for(int data : a){
            if(al.contains(data) == true){
                continue;
            }else{
                al.add(data);
            }
        }

        System.out.println(al);
    }
}
