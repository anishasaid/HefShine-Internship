
// find the number is harshad number or not
public class IsHarshad {
    public static void main(String[] args) {
        int num = 171;
        int n = num;

        System.out.println("number is : "+num);
        
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("sum is : "+ sum);

        if(n % sum == 0){
            System.out.println("Harshad number");
        }else{
            System.out.println("not a Harshad number");
        }
    }
}
