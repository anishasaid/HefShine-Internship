package Patterns;

/*
1
12   
123  
1234 
12345
1234 
123  
12   
1    
 */

public class Pattern23 {
    public static void main(String[] args) {
        int end = 1;
        for(int i=1; i<=9; i++){
            int num = 1;
            for(int j=1; j<=end; j++){
                System.out.print(num+" ");
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
