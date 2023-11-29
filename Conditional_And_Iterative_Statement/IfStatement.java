public class IfStatement {
    public static void main(String[] args) {
        System.out.println("h1");
        int num1 = 15;
        int num2 = 90;
        if(num1 > num2){
            System.out.println(num1 +" is greater than "+num2);
        }
        if(num1 < num2 ){
            System.out.println(num2 +" is greater than "+num1);
        }

        if(num1 < num2 ){
            System.out.println(num1 +" is smallest than the "+num2);
        }
        if (num1 > num2 ){
            System.out.println(num2 +" is smallest than the "+num1);
        }

        // if - else 
        if(num1 > num2 ){
            System.out.println(num1 + "is greater than "+num2);
        }else{
            System.out.println(num2 +" is greater than "+num1);
        }

        // find even or odd
        int num3 = 44;
        if(num3 % 2 == 0){
            System.out.println(num3 +" is even number");
        }else{
            System.out.println(num3 +" is an odd number");
        }
    }
}
