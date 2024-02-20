package Array;
// find triplate in given array whose sum is less than 12 .
import java.util.Arrays;

public class FindTriplet {
    public static void main(String[] args) {
        
        int arr[] = {5,1,3,4,7};

    
        //sort array
        Arrays.sort(arr);

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                for(int k=j+1; k<arr.length;k++){
                    
                    if(arr[i]+arr[j]+arr[k] < 12){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}
