package Patterns;
/*

1
22
333
4444
55555

 */
public class Pattern27 {
    public static void main(String[] args) {
        int end = 1;
        int num = 1;
        for(int i=1;i<=5; i++){
            for(int j=1; j<=end; j++){
                System.out.print(num);
            }
            System.out.println();
            end++;
            num++;
        }
    }
}
