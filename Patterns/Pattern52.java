package Patterns;

//29

/*
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class Pattern52 {
    public static void main(String[] args) {
        
        int end = 1;
        int num =1;
        int  diff = 1;

        for(int i=1; i<=5; i++){
            int num2 = num ;
            for(int j=1; j<=end; j++){
                System.out.print(num2+ " ");
                num2++;
            }
            System.out.println();
            num = num + diff;
            end++;
            diff++;
        }


        System.out.println("*************************************");

        int endPoint = 1;
        int cnt = 1;
        for(int i=1; i<=5; i++){
            for(int j=1;j<=endPoint; j++){
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
            endPoint++;
        }
    }
}
