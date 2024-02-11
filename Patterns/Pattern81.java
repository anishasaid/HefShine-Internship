package Patterns;
/*
55555
45555
34555
23455
12345
 */
public class Pattern81 {
    public static void main(String[] args) {
        int spaceCnt = 0;
        int num = 5;
        for(int i=1; i<=5; i++){
            int num2 = num ;
            for(int j=1; j<=5; j++){
                if(j<=spaceCnt){
                    System.out.print(num2);
                    num2++;
                }else{
                    System.out.print(5);
                }
            }
            System.out.println();
            spaceCnt ++;
            num--;
        }
    }
}
