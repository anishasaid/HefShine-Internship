package Patterns;

/*
A
AB
ABC
ABCD
ABCDE
 */
public class Pattern46 {
    public static void main(String[] args) {

        int end = 1;
        for(int i=1; i<=5; i++){
            int num = 1;
            for(int j=1; j<=end; j++){
                System.out.print((char)(num + 64));
                num++;
            }
            System.out.println();
            end++;

        }
    }
}
