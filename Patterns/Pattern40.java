package Patterns;

/*
        1 
       2 2
      3 3 3
     4 4 4 4 
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
 */
public class Pattern40 {
    public static void main(String[] args) {

        int end = 9;
        int spaceCnt = 8;
        int num = 1;

        for(int i=1; i<=9; i++){
            for(int j=1; j<=end; j++){
                if(j<=spaceCnt){
                    System.out.print(" ");
                }else{
                    System.out.print(num+" ");
                }
            }
            System.out.println();
            spaceCnt--;
            num++;

        }
    }
}
