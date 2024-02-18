package Array;

//Find index of minimum element of given array.
public class FindMinEleIndex {
    public static void main(String[] args) {
        
        int arr[] = {0,11,8,22,33,4,56,1};
        int min = 0;
        for(int i=1; i<arr.length;i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        System.out.println("minimum element index is : "+ min);

        int minIndex = 3;

        for(int i=4; i<arr.length;i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        System.out.println("minimum element index in a given range : "+minIndex);
    }
    
}
