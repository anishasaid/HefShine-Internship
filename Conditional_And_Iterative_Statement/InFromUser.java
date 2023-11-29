
import java.util.*;

class InFromUser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int
        System.out.println("Enter two Integer numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();  
        System.out.println(a + b); 
        
        //short
        System.out.println("Enter two short number :");
        short c = sc.nextShort();
        short d = sc.nextShort();
        System.out.println(c +" and "+ d);

        //long
        System.out.println("ENter two long number : ");
        long e = sc.nextLong();
        System.out.println(e);

        //byte
        System.out.println("Enter byte number : ");
        byte f = sc.nextByte();
        System.out.println(f);

        //String
        System.out.println("Enter some text ");
        String s = sc.next();
        System.out.println( " the string is : "+s);

        //float
        System.out.println("Enter float number : ");
        float g = sc.nextFloat();
        System.out.println(g);

        //boolean
        System.out.println("enter boolean vlaue : ");
        boolean h = sc.nextBoolean();
        System.out.println(h);

        //double
        System.out.println("Enter double value : ");
        double i = sc.nextDouble();
        System.out.println(i);

        //char
        System.out.println("Ener some character : ");
        char cc = sc.next().charAt(0);
        System.out.println(cc);

    }
}