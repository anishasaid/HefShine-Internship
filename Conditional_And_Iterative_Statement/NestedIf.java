
// Find number is maximum and minimum - By using Nested if
public class NestedIf {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 60;
        int num3 = 20;

        if(num1 > num2 && num1 > num3){
            System.out.println("num1 is max");
            if(num2 < num3){
                System.out.println("num2 is min");
            }else{
                System.out.println("num3 is min");
            }
        }else if(num2 > num1 && num2 > num3 ){
            System.out.println("num2 is max");
            if(num1 < num3){
                System.out.println("num1 is min");
            }else{
                System.out.println("num3 is min");
            }
        }else{
            System.out.println("num3 is max");
            if(num1 < num2){
                System.out.println("num1 is min ");
            }else{
                System.out.println("num2 is min");
            }
        }
    }
}
