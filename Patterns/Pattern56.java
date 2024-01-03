package Patterns;

/*

XOOOO
OXOOO
OOXOO
OOOXO
OOOOX

 */
public class Pattern56 {
    
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(i==j){ // (j-i == 0)
                    System.out.print("X");
                }else{
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }
}
