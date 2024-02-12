package Array;
// check equality of 2 arrays
public class ArrayEquality {
    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,4,5,6,7};
        int arr2[] = {1,2,3,4,5,6,7};


        if(arr1.length == arr2.length){
           
            int count = 0;
            for(int i=0;i<arr1.length;i++){
                if(arr1[i] == arr2[i]){
                    count++;
                }
            }
            if(count == arr1.length){
                System.out.println(" Array is equal by All elements. ");
            }else{
                System.out.println("Array is not equal by element");
            }
        }else{
            System.out.println("Array is not equal by length ");
        }
    }
}
