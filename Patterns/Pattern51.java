package Patterns;

/*
A
AB   
ABC  
ABCD 
ABCDE
ABCD 
ABC
AB
A
 */
public class Pattern51 {
    public static void main(String[] args) {

        int end = 1;

        for(int i=1; i<=9; i++){
            int num  = 1;
            for(int j=1; j<=end; j++){
                System.out.print((char)(num + 64));
                num++;
            }
            System.out.println();
            if(i<5){
                end++;
            }else{
                end--;
            }
        }
    }
}
