package Array;

// create array by using new keyword. The new keyword dynamically alocate the memory .
import java.util.Arrays;

class CreateArray2{
    public static void main(String[] args) {
        
        int arr[] = new int [5];
        arr[0] = 10;
        arr[1] = 20;

        // print array
        System.out.println(Arrays.toString(arr)); 
    }
}