package Exception;
/*
 EXCEPTION - is the unwanted condition bz. of which our program abnormally get terminated is known....
 */
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 =sc.nextInt();

        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();

        int result = 0;

        //exception handling 
        try{ 

            result = num1 / num2; // we write the risky code in try{} block

        }catch(ArithmeticException e){

            System.out.println("handled ......");
            System.out.println(e.getMessage()); // this tell about the exception 
            
        }

        System.out.println(result);

        System.out.println("byeeee......");
    }
}
