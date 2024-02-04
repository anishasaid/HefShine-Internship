package Patterns;

/*
    *****
   *   *
  *   *
 *   *
*****

 */
public class Pattern71 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1 ; j<=9; j++){
                if((i==1 && j>=5) || (i == 5 && j<5)|| (j+i == 6)|| (j+i == 10 )){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
