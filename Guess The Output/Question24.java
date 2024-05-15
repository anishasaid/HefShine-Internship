package GTO;

public class Question24 {
    public static void main(String[] args) {
        byte x;
        int a = 100;
        double b = 96.128;
        x = (byte) a;
        System.out.println("a and x "+ a + " "+ x);
        a = (int) b;
        System.out.println(("b and a "+ b + " "+a));
        x = (byte) b;
        System.out.println("b and x "+b+" "+x);
    }
}
