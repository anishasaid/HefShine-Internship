public class FindEvenOddInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        System.out.println("even numbers");
        for(int i=start; i<=end; i++){
            if(i % 2 == 0){

                System.out.println(i);
            }
        }
        System.out.println("odd numbers");
        for(int i=start; i<=end; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
