package Patterns;

/*
10000
01000
00100
00010
00001
 */
public class Pattern78 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(j-i == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
