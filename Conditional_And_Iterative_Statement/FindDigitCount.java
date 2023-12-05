public class FindDigitCount {
    public static void main(String[] args) {
        int num = 123456789;
        int count = 0;
        while (num > 0) {
            //int rem = num % 10;
            num = num /10;
            count ++;
        }
        System.out.println("count is : "+count);
    }
}
