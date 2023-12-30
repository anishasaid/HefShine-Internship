package Patterns;

/*
1        1
22      22
333    333
4444  4444
5555555555
 */
public class Pattern44 {
    public static void main(String[] args) {

        int firstTriEndPoint = 1;
        int secondTriStartPoint = 10;
        int num = 1 ;
        for(int i=1; i<=5; i++){
           
            for(int j=1; j<=10; j++){
                if(j<=firstTriEndPoint || j>=secondTriStartPoint){
                    System.out.print(num);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            num++;
            firstTriEndPoint++;
            secondTriStartPoint--;

        }
    }
}
