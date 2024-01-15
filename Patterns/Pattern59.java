package Patterns;

/*
PPPPP
P   P
P   P
P   P
PPPPP
*/
public class Pattern59 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5; j++){
                if(j==1 || j == 5 ){
                    System.out.print("P");
                }else if(i==1 || i ==5){
                    System.out.print("P");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
