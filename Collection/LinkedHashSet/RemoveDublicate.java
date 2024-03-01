package Collection.LinkedHashSet;
/*
 LINKED HASH SET
 1. does not contain dublicate element
 2. does follows insertion order ***
 3. fast in searching
 4. it is not index based
 5. it uses hashing technique to add the elements
 
 */
import java.util.LinkedHashSet;

public class RemoveDublicate {
    public static void main(String[] args) {
        
        int a[] = {11,22,33,44,22,11,33,55,66};

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        for(int data : a){
            lhs.add(data);
        }

        System.out.println(lhs);
    }
}
