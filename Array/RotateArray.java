package Array;
// Rotate Array - Left Shif
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        
        int arr[] = {11,22,33,44,55,66};
        int temp = arr[0];

        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
