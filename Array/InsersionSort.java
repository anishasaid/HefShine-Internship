package Array;
// Insersion Sort 
import java.util.*;
public class InsersionSort {
    public static void main(String[] args) {
        
        int arr[] = {11,22,33,66,44,99,55,33};

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];

            int j = i-1;  // here initialization of j loop is written outside bz. at the end we are using j variable ouside the loop
            for(; j>= 0; j--){
                if(arr[j] < temp){  
                    break;
                }else{
                    arr[j+1] = arr[j];    // shifting
                }
            }
            arr[j+1] = temp;  // add value at vacant space
        }
        System.out.println(Arrays.toString(arr));


       
    }
}
