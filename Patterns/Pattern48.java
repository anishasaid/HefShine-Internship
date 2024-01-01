package Patterns;

/*\
A
BG
CHM
DINS
EJOTY
FKPUZ_
 */
public class Pattern48 {
    public static void main(String[] args) {
        int end = 1;
        int num = 1;
        for(int i=1; i<=6; i++){
            int num2 = num;
            for(int j=1; j<=end; j++){
                System.out.print((char)(num2+64));
                num2 = num2+5;
            }
            System.out.println();
            end++;
            num++;

        }
    }
}
