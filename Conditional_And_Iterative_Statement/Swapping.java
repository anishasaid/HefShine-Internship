class Swapping{
    public static void main(String args[]){
        int a = 4 ;
        int b = 9;
        int temp;
        System.out.println("Before swapping :");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);

        temp = a ;
        a = b;
        b = temp;

        System.out.println("Aftert swapping :");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);

    }
}