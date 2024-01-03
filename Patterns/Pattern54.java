package Patterns;

/*

* *
** **
*** ***
**** ****
***** *****

 */
public class Pattern54 {
    public static void main(String[] args) {
        
        int end = 3;
        for(int i=2; i<=6; i++){
            for(int j=1; j<=end; j++){
               
                if(i==j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
            end += 2;
        }
    }
}
