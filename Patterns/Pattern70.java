package Patterns;

/*
    *
   **
  * *
 *  *
*   *
 *  *
  * *
   **
    *
 */
public class Pattern70 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            for(int j=1; j<=5; j++){
                if((j+i == 6 && i<=5) || (j-i == -4 && i>5) || j == 5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
