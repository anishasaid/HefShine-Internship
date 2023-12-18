package Patterns;

/*
    *****
   *****
  *****
 *****
*****

 */
public class Pattern19 {
    public static void main(String[] args) {

        int end = 9;
        int spaceCnt= 4;

        for(int i=1; i<=5;i++){
            for(int j=1; j<=end; j++){
                if(j<=spaceCnt){
                    System.out.print( " ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            spaceCnt--;
            end--;
        }
    }
}
