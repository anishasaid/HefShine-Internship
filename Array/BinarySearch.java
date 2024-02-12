package Array;
// Binary Search
public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[]  = {11,22,33,44,55,66,77,88};
        int data = 88;

        int start = 0;
        int end = arr.length-1;

        int count = 0;
        while (start <= end) {
            System.out.println("iteration"); // how many iterations are done
            int mid = (start+end)/2;
            if(arr[mid] == data){
                System.out.println("found");
                count++;
                break;
            }

            if(data > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        if(count == 0){
            System.out.println("not found");
        }
    }
}
