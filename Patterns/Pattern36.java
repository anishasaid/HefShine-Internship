package Patterns;

/*
9
88
777
6666
55555
444444
3333333
22222222
111111111
 */
public class Pattern36 {
    public static void main(String[] args) {
        
        int end = 1;
        int num = 9;
        for(int i=1; i<=9;i++){
            for(int j=1; j<=end; j++){
                System.out.print(num);
            }
            System.out.println();
            num--;
            end++;
        }
    }
}
