package Patterns;

/*
 ####**
 */
public class Pattern6 {
    public static void main(String[] args) {
        int hashcnt = 4;
        for(int i=1;i<=6; i++){
            if(i<=hashcnt ){
                System.out.print("#");
            }else{
                System.out.print("*");
            }
        }

    }
}
