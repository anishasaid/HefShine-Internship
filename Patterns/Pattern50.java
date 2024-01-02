package Patterns;

/*\
A
BB   
CCC  
DDDD 
EEEEE
 */
public class Pattern50 {
    public static void main(String[] args) {

        int end = 1;
        int num = 1;

        for(int i=1; i<=5;i++){
            for(int j=1; j<=end; j++){
                System.out.print((char)(num+64));
            }
            System.out.println();
            end++;
            num++;
        }
    }
}
