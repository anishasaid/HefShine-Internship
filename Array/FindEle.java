package Array;

// Find element in an array
public class FindEle {
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50,60};
        int data = 30;

        int count = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == data){
                count++;
            }
        }

        if(count == 0){
            System.out.println("Element not found");
        }else{
            System.out.println("Element Fount");
        }
    }
}
