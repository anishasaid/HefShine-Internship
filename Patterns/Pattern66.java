package Patterns;

/*
    *    
   * *
  *   *
 *     *
*********
 */
public class Pattern66 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=9; j++){
                if(i == 5 || (j+i == 6 && j<=5) || (j-i == 4 && j>5) ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
