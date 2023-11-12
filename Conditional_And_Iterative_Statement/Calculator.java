import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println("select the operator (+, -, *, /, % ) - ");
        char ch = sc.next().charAt(0);

        int ans = 0;
        /* 
        // By using if else if 
        if(ch == '+'){
            ans = num1 + num2;
        }else if( ch == '-'){
            ans = num1 - num2;
        }else if(ch == '*'){
            ans = num1 * num2;
        }else if(ch == '/'){
            ans = num1 / num2;
        }else if(ch == '%'){
            ans = num1 % num2;
        }
        */
        // By using switch 
        switch( ch){
            case '+' :
            ans = num1 + num2;
            System.out.println(ans);
            break;
            
            case '-' :
            ans = num1 - num2;
            System.out.println(ans);
            break;

            case '*':
            ans = num1 * num2;
            System.out.println(ans);
            break;

            case '/':
            ans = num1 /num2;
            System.out.println(ans);
            break;

            case '%':
            ans = num1 % num2 ;
            System.out.println(ans);
            break;

            default:
            System.out.println("Wrong Operator ");
            break;
        }
        System.out.println("your ans is : " + ans);
    }    
}
