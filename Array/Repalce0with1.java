package Array;

// Replace 0's with 1 in array
public class Repalce0with1 {
    public static void main(String[] args) {
        
        int arr[] = {1,0,1,0,1,0,1,0,1};

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                arr[i] = 1;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
