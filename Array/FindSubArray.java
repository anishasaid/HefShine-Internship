package Array;
// find subArray in given array
public class FindSubArray {
    public static void main(String[] args) {
        
        int arr[] = {3,7,90,20,5,50,40};
        int sizeOfSubArray = 3;

        int min = Integer.MAX_VALUE;
        int startIndex = -1;

        for(int i=0; i <= (arr.length - sizeOfSubArray); i++){
            int sum = 0;
            for(int k=i; k<(i+sizeOfSubArray); k++){
                sum = sum + arr[k];
            }
            int avg = sum / sizeOfSubArray;
            if(avg < min){
                min = avg;
                startIndex = i;
            }
        }
        System.out.println(startIndex + " "+ min);
    }
}
