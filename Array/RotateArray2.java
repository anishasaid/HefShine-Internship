package Array;
// Rotate Array - Right Shif

import java.util.*;
public class RotateArray2 {
    public static void main(String[] args) {

        int arr[] = {11,22,33,44,55,66,77};
        // store last ele in temp 
        int temp = arr[arr.length-1];
        // i will go upto 1 
        for(int i=arr.length-1; i>0; i--){
            arr[i] = arr[i-1]; 
        }

        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
