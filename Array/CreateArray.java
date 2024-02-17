package Array;

public class CreateArray {
    public static void main(String[] args) {
        
        /* we can create array using 2 methods
            1. By using new keyword
            2. By using value
        */ 
        int arr[] = {10, 20, 30, 40, 50};
        // System.out.println(arr[1]);
        // System.out.println(arr[4]);

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
