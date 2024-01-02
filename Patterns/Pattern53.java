package Patterns;

/*
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
 */
public class Pattern53 {
    public static void main(String[] args) {

        int end = 1;
        for(int i=1; i<=5; i++){
            int num = 1; 
            for(int j=1; j<=end; j++){
                System.out.print((char)(num + 64));
                if(j<i){
                    num++;
                }else{
                    num--;
                }
            }
            System.out.println();
            end += 2;
        }
    }
}
