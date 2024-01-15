package Patterns;

/*

A   A
 A A
  A
 A A
A   A

 */
public class Pattern57 {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5;j++){
                if( j-i == 0 || j+i == 6){
                    System.out.print("A");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
