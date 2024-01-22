package Patterns;
/*
*********
 *     *
  *   *
   * *
    *
 */
public class Pattern67 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1 ; j<=9; j++){
                if(i==1 || (j-i == 0 && j<=5) || j+i == 10 && j>5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
