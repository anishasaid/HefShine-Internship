package Patterns;

/*
    1
   121
  12321
 1234321
123454321

 */
public class Pattern25 {
    public static void main(String[] args) {
        int end = 5;
        int spaceCnt = 4;

        for(int i=1; i<=5; i++){
            int num = 1;
            for(int j=1; j<=end; j++){
            
                if(j<=spaceCnt){
                    System.out.print(" ");
                }else{
                    System.out.print(num);
                    if(j<5){
                        num++;
                    }else{
                        num--;
                    }
                }
                
            }
            System.out.println();
            spaceCnt--;
            end++;
        }
    }
}
