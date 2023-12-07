public class IsPalindrome {
    public static void main(String[] args) {
        int num = 12321;
        int temp  = num;
        int rev = 0;

        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        System.out.println(rev);
        if(temp == rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
