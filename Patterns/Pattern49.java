package Patterns;

/*
A
BA
CBA
DCBA
EDCBA
 */
public class Pattern49 {
    public static void main(String[] args) {

        int num = 1;
        int end = 1;
        for(int i=1; i<=5; i++){
            int num2  = num;
            for(int j=1; j<=end; j++){
                System.out.print((char)(num2+64));
                num2--;
            }
            System.out.println();
            num++;
            end++;
        }
    }
}
