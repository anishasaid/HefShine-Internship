package Patterns;

/*
1 
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
public class Pattern41 {
    public static void main(String[] args) {

        int end = 1;
        int num = 1;
        for(int i=1; i<=5; i++){
            
            int diff = 4;
            int num2 = num;
            for(int j=1; j<=end; j++){
                System.out.print(num2+" ");
                num2 = num2 + diff;
                diff--;
            }
            System.out.println();
            num++;
            end++;
        }
    }
}
