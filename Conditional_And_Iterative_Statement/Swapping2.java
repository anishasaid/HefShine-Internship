class Swapping2{
    public static void main(String args[]){
        int a = 4 ;
        int b = 9;
        
        System.out.println("Before swapping :");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swapping :");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);

    
    }
}