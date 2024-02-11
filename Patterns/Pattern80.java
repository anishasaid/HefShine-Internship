package Patterns;

/*
11111
11122
11333
14444
55555
 */
public class Pattern80 {
    public static void main(String[] args) {
      
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(1);
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println("*******************************");

        int spaceCnt = 4;
        int num =1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if(j<=spaceCnt){
                    System.out.print(1);
                }else{
                    System.out.print(num);
                }
            }
            System.out.println();
            num++;
            spaceCnt--;
        }
    }
        
    
}
