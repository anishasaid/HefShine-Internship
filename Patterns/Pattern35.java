package Patterns;

/*
9
98
987
9876
98765
987654
9876543
98765432
987654321
 */
public class Pattern35 {
    public static void main(String[] args) {

        int end = 1;
        
        for(int i=1; i<=9; i++){
            int num = 9;
            for(int j=1; j<=end; j++){
                System.out.print(num);
                num--;
            }
            System.out.println();
            end++;
        }
    }
}
