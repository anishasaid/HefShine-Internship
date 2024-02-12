package Array;
// copy one array into another array
public class CopyArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};

        //create blank array
        int b[] = new int[arr.length];

        for(int i=0; i<arr.length;i++){
            b[i] = arr[i] ;
        }
        //print array
        for(int i=0; i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
