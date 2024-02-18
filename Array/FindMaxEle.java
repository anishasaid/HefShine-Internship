package Array;
// Find Max and Min element of the array.
class FindMaxEle{
    public static void main(String[] args) {
        int a[] = {11,22,55,44,77,88,66,33};
        int max = a[0];
        int min = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("Maximum element of the array is : "+ max);

        for(int i=1; i<a.length;i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum element of the array is : "+ min);
    }
}