package Patterns;

/*
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
 */
public class Pattern38 {
    public static void main(String[] args) {
        
        for(int i=1; i<=7; i++){
            int num = 0;
            for(int j=1; j<=10; j++){
                for(int k=1; k<=3;k++){
                    System.out.print(num);
                }
                num++;
            }
            System.out.println();
        }
    }
}
