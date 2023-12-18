package Patterns;

/*

*********
 ******* 
  *****  
   ***   
    *    
   ***
  *****
 *******
*********

 */
public class Pattern17 {
    public static void main(String[] args) {
        int end = 9;
        int spaceCnt = 0;

        for(int i=1; i<=9; i++){
            for(int j=1; j<=end; j++){
                if(j<=spaceCnt){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i<5){
                spaceCnt++;
                end --;
            }else{
                spaceCnt--;
                end++;
            }
        }
    }
}
