package Patterns;

/*
    *    
   * *
  *   *
 *     *
*       *
 *     *
  *   *  
   * *
    *
 */
public class Pattern68 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                if((i+j == 6 && i<=5) || (j-i == -4 && i>5) || (j-i == 4 && j>5 ) || (j+i == 14 && j>5)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
