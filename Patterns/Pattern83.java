package Patterns;
/*

1        1
12      12
123    123
1234  1234
1234512345

*/
public class Pattern83 {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            // Print numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Print spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            
            // Print numbers in descending order
            int num = 1;
            for (int j = i; j >= 1; j--) {
                System.out.print(num);
                num++;
            }
            
            System.out.println();
        }
    }
}
