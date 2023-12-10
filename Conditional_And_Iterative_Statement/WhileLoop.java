public class WhileLoop {
    private static void myCode(int n){
        int v1 = 0;
        int v2 = 0;
        while(n >0){
            if((n % 10) % 2 == 0){
                v1 = v1 + n%10;
            }else{
                v2 = v2 + n%10;
            }
            n = n / 10;
        }
        System.out.println("v1 : "+ v1 +"\nv2 : "+ v2);
    }
    public static void main(String[] args) {
        // int i = 1;
        // while(i <= 10){
        //     System.out.println("hi");
        //     i++;
        // }

       int n = 125346;
       myCode(n);
    }

}
