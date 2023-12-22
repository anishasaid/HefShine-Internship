package Patterns;

/*

1
21
321
4321
54321

 */
public class Pattern28 {
    public static void main(String[] args) {
        int end = 1;
        int num = 1;
        for(int i=1; i<=5; i++){
            int cnt2 = num;
            for(int j=1; j<=end; j++){
                System.out.print(cnt2);
                cnt2--;
            }
            System.out.println();
            end++;
            num++;
        }
    }
}
