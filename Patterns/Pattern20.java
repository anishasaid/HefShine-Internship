package Patterns;

/*
**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********
 
 */
public class Pattern20 {
    public static void main(String[] args) {

        int firstTriEndPoint = 5;
        int secondTriStartPoint = 6;

        for(int i=1; i<=9; i++){
            for(int j=1; j<=10; j++){
                if(j<=firstTriEndPoint || j>= secondTriStartPoint){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i < 5){
                firstTriEndPoint--;
                secondTriStartPoint++;
            }else{
                firstTriEndPoint++;
                secondTriStartPoint--;
            }
        }
    }
}
