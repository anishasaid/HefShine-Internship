package Collection.HashSet;
/*
 HASHSET - 
 1. does not contain dublicate element
 2. does not follow insertion order
 3. fast in searching
 4. it is not index based
 5. it uses hashing technique to add the elements

 Hashing technique / HashTable - is used to add elements in hashset
 Initially size of bucket is bydefault is 16.
 first it calculate the bucket number to stored the element.
 formula to calculate bucket number : element % sizeOfBucket
 */
import java.util.HashSet;
import java.util.Iterator;

public class CreateHashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<>();
        hs.add(11);
        hs.add(35);
        hs.add(56);
        hs.add(91);
        hs.add(25);
        hs.add(96);

        //Iterator all elements through iterator
        Iterator<Integer> itr = hs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println("***********************");
        // iterate all elements by for each loop
        for(int data : hs){
            System.out.print(data + " ");
        }

    }
}
