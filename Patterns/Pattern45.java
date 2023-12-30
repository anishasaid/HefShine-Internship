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
//42,81,83...
public class Pattern45 {
    public static void main(String[] args) {

        int spaceCnt = 4;
        int end = 5;
        int num = 1;
        for(int i=1; i<=9; i++){
            int num2 = num;
            for(int j=1; j<=end; j++){
                if(j<=spaceCnt){
                    System.out.print(" ");
                }else{
                    System.out.print(num2);
                    num2--;
                }
            }
            System.out.println();
            if(i<5){
                spaceCnt--;
                num++;

            }else{
                spaceCnt++;
                num--;
            }
        }
       
    }
}
