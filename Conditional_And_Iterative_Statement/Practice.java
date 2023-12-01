import java.util.*;
// write a program to take input from user and Print the corresponding day of the week.
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number from 0 - 6 : ");
        int day = sc.nextInt();

        String days[] = {"Sunday" ,"Monday", "Tuesday", "Wednesday" , "Thursday" , "Friday", "Saturday"};
        System.out.println(days[day]);

        
        
    }
}
