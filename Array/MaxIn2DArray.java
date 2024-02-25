package Array;
// Find maximum and minimum  ele in 2D array 
public class MaxIn2DArray {
    public static void main(String[] args) {
        
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        //max
        int max = arr[0][0];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum ele in 2D Array : "+max);

        // min
        int min = arr[0][0];
        
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Minimum ele in 2D Array : "+ min);
    }
}
