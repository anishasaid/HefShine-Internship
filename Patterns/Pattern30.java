package Patterns;

/*
5
54
543
5432
54321
 */
public class Pattern30 {
    public static void main(String[] args) {
        int end = 1;
      
        for(int i=1; i<=5; i++){
            int num = 5;
            for(int j=1; j<=end; j++){
                System.out.print(num);
                num--;
            }
            System.out.println();
            end++;
        
        }
    }
}
