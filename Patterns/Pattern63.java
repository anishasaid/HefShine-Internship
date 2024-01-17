package Patterns;

/*
N       N
 N     N
  N   N
   N N
    N
 */
public class Pattern63 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=9; j++){
                if(j-i == 0 && j<=5){
                    System.out.print("N");
                }else if(j+i == 10 && j>5){
                    System.out.print("N");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
