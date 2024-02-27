package Array;
// Selection Sort
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        
        int arr[] = {88,44,55,22,66,77,33};

        for(int i=0; i<arr.length;i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];  // swaping
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
