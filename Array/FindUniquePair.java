package Array;

// Find a unique pairs in a given array
import java.util.*;

public class FindUniquePair {
    public static void main(String[] args) {
        
        int arr[] = {1,1,2};

        int uniqueEleCnt = 0;

        // Find unique ele count 
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
            }

            if(count == 0){
                uniqueEleCnt++;
            }
        }

        // create array - based on uniqueEleCnt
        int uniqueArr[] = new int[uniqueEleCnt];

        // Again check ele if it is unique and add in uniqueArr[]

        int index  = 0;
        for(int i=0; i<arr.length;i++){
            int count = 0;
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    count  ++;
                }
            }

            if(count == 0){
                uniqueArr[index] = arr[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(uniqueArr));

        // make pairs
        for(int i=0; i<uniqueArr.length; i++){
            for(int j=0; j<uniqueArr.length;j++){
                System.out.println(uniqueArr[i]+" "+ uniqueArr[j]);
            }
        }
    }
}
