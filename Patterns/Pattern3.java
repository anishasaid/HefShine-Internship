package Patterns;
/*

 *****
 ****
 ***
 **
 *
 **
 ***
 ****
 *****

 */
public class Pattern3 {
    public static void main(String[] args) {

        int end = 5;
        for(int i=1; i<=9; i++){
            for(int j=1; j<=end; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i < 5){
                end --;
            }else{
                end++;
            }
        }

       
    }
}
