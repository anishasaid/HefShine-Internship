import java.util.Scanner;
public class HM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("Enter a Number : ");
            int num = sc.nextInt();
            
            System.out.println("Enter your choice : ");

            System.out.println("ENTER 1 FOR PRIME NUMBER");
            System.out.println("ENTER 2 FOR EVEN NUMBER");
            System.out.println("ENTER 3 FOR ODD NUMBER");
            System.out.println("ENTER 4 FOR STOP");

            int choice = sc.nextInt();
    
            if(choice == 1){ // prime number
                int count = 0;
                for(int i=1; i<=num; i++){
                    if(num % i == 0){
                        count ++;
                    }
                }
                if(count == 2){
                    System.out.println("PRIME NUMBER");
                }else{
                    System.out.println("NOT PRIME NUMBER");
                }
            }

            if(choice == 2){   // Even number
                if(num % 2 == 0){
                    System.out.println("even number");
                }
            }

            if(choice == 3){  // Odd number

                if(num % 2 != 0){
                    System.out.println("odd number");
                }
            }

            if(choice == 4 ){
                System.out.println("stop");
                break;
            }
            System.out.println("***************************************************************");
        }
    }
}
