package Array;
import java.util.*;
//Bubble Sort
public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {11,55,22,77,33,88,44,66,55,11};

        for(int i=0; i<arr.length; i++){
            int isSwapindDone = 0;
            for(int j = 0; j<arr.length-1-i; j++){ // when whole j loop is complete then 1 ele get sorted.
                if(arr[j] > arr[j+1]){
                    isSwapindDone++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(isSwapindDone == 0){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
