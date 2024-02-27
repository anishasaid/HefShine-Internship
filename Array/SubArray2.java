package Array;

public class SubArray2 {
    public static void main(String[] args) {
        
        int arr[] = {3,7,90,20,5,20,40};
        int sizeOfSubArray = 3 ;
        int min = Integer.MAX_VALUE;
        int startIndex = -1;
        
        for(int i=0; i<=(arr.length-sizeOfSubArray); i++){
           // for(int j=i; j<arr.length;j++){ // used for to find end point of subarray
                int sum = 0;
                for(int k=i; k<(i+sizeOfSubArray); k++){
                    sum = sum + arr[k];
                }
              
                //System.out.println(sum);
                int avg = sum / sizeOfSubArray;
                //System.out.println(avg);

                if(avg < min){
                    min = avg;
                    startIndex = i;
                }
           // }
        }

       System.out.println(startIndex+" "+min);


       /*
        int arr[] = {88,5,22,11,1,30};

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<= j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
        */
    }
}

