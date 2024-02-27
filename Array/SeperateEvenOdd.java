package Array;
import java.util.Arrays;
//put even and odd element in seperate array
public class SeperateEvenOdd {
    public static void main(String[] args) {

        int arr[] = {11,22,33,44,55,66,22};

        int evenCnt = 0;
        int oddCnt = 0;

        for(int i=0; i<arr.length;i++){
            if(arr[i] % 2 == 0){
                evenCnt++;
            }else{
                oddCnt++;
            }
        }
        //create 2 new array based on evenCnt and oddCnt
        int evenArr[] = new int[evenCnt];
        int oddArr[] = new int[oddCnt];

        //create 2 variables - they act as index for even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        // first check ele is even or odd , then add in even and odd array  and increment their respective index
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                evenArr[evenIndex] = arr[i];
                evenIndex++;
            }else{
                oddArr[oddIndex] = arr[i];
                oddIndex++;
            }
        }

        //print array
        System.out.println(Arrays.toString(oddArr));
        System.out.println(Arrays.toString(evenArr));

       
    }
}
