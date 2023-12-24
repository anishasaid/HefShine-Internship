package Patterns;

/*
5
45
345
2345
12345
 */
public class Pattern32 {
    public static void main(String[] args) {

        int end = 1;
        int num = 5;

        for(int i=1; i<=5; i++){
            int num2 = num;
            for(int j=1; j<=end; j++){
                System.out.print(num2);
                num2++;
            }
            System.out.println();
            end++;
            num--;
        }
       
    }
}
