
// Find the prime numbers in a given range.
public class FindPrimeInRange {
    public static void main(String[] args) {
        for(int j=1; j<=100; j++){
            int num = j;
            int count = 0;

            for(int i=1; i<=num ; i++){
                if(num%i == 0){
                    count ++;
                }
            }
            if(count == 2 ){
                System.out.println(j);
            }
        }
    }
    
}
