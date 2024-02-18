package Array;
// find leader element of the array
// The element is leader if it is greater than all elements of its right side.
public class FindLeaderEle1 {
    public static void main(String[] args) {
        int arr[] = {88,44,55,22,77,66,33};

        for(int i=0; i<arr.length;i++){
            int count = 0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i]){
                    count++;
                }
            }

            if(count == 0){
                System.out.println(arr[i]);
            }
        }

        System.out.println("********************************************");

        // using single for loop -  INTERVIEW PERSPECTIVE

        int max = arr[arr.length-1];
        System.out.println(max);

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > max){
                System.out.println(arr[i]);
                max = arr[i];
            }
        }
    }
}
