public class FindMaxNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if(num1 > num2 && num1 > num3){
            System.out.println("num1 is max");
        }else if(num2 > num1 && num2 > num3){
            System.out.println("num2 is max");
        }else{
            System.out.println("num 3 is max");
        }
    }
}
