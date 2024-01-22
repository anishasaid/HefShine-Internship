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
public class Pattern69 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            for(int j=1; j<=5; j++){
                if((j-i == 0 && j <=5)  || (j+i == 10 && j<5) || j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
