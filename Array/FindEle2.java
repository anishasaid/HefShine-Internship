package Array;

// find element in arry and print its index (On whitch index the ele is present ) else print ele is not found
public class FindEle2 {
    public static void main(String[] args) {
        
        int arr[] = {11,22,33,44,55,33,77};
        int data  = 33;

        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == data){
                System.out.println(i);
                count++;
            }
        }

        if(count == 0){
            System.out.println("Element not found");
        }
    }
}
