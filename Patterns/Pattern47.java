package Patterns;

/*
A
BB
CCC
DDDD
EEEEE
DDDD
CCC
BB
A
 */
public class Pattern47 {
    public static void main(String[] args) {

        int end = 1;
        int num = 1;
        for(int i=1; i<=9; i++){
            for(int j=1; j<=end; j++){
                System.out.print((char)(num + 64));
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
