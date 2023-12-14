package Patterns;

/*
 
    * 
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

 */
public class Pattern13 {
    public static void main(String[] args) {
        int end = 5;
        int spaceCnt = 4;
        for(int i=1; i<=9; i++){
            for(int j=1; j<=end; j++){
                if(j<=spaceCnt){
                    System.out.print(" ");
                }else{
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
            if(i<5){
                spaceCnt--;
                
            }else{
                spaceCnt++;
                
            }
        }
        System.out.println();
        
        int e = 5;
        int space = 4;

        for(int i=1; i<=9; i++){
            for(int j=1; j<=e; j++){
                if(j<=space){
                    System.out.print(" ");
                }else{
                    if((i+j) % 2 != 0){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
            if(i<5){
                space--;
                e++;
            }else{
                space++;
                e--;
            }
        }
    }
}
