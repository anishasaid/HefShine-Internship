package Patterns;

/*
1
21
321
4321
54321
4321
321
21
1
 */
public class Pattern31 {
    public static void main(String[] args) {
        int end= 1;
        int num = 1;
        for(int i=1; i<=9; i++){
            int num2 = num;
            for(int j=1; j<=end; j++){
                System.out.print(num2);
                num2--;
            }
            System.out.println();
            if(i<5){
                end++;
                num++;
            }else{
                end--;
                num--;
            }
        }
    }
}
