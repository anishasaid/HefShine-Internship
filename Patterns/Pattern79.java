package Patterns;
/*
10000
02000
00300
00040
00005
 */
public class Pattern79 {
    public static void main(String[] args) {

        int num = 1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(j-i == 0){
                    System.out.print(num);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
            num++;
        }
    }
}
