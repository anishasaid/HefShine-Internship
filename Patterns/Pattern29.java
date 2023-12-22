package Patterns;

/*
12345
2345
345
45
5
 */
public class Pattern29 {
    public static void main(String[] args) {
        int end = 5;
        int num = 1;

        for(int i=1; i<=5; i++){
            int cnt = num ;
            for(int j=1; j<=end; j++){
                System.out.print(cnt);
                cnt++;
            }
            System.out.println();
            end--;
            num++;

        }
    }
}
