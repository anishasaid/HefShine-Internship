package Array;
// Find unique element count of the given array
public class FindUniqueEleCount {
    public static void main(String[] args) {
        int arr[] = {11,22,33,11,44,77,22};

        int uniqueEleCount = 0;
        for(int i=0;i<arr.length; i++){
            int count = 0;
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
            }

            if(count == 0){
                uniqueEleCount++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("unique element count : "+ uniqueEleCount);
    }
}
