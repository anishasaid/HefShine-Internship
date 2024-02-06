package Patterns;
/*
10101
01010
10101
01010
10101
 */
public class Pattern75 {
    public static void main(String[] args) {
        for(int i=1; i<=5 ; i++){
            for(int j=1; j<=5; j++){
                if((j+i) % 2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
