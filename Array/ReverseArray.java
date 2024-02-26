package Array;
// Reverse the array 
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66,77,88};
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[start] ;
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
