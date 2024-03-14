package GTO;

public class Question13 {
    public static void main(String[] args) {
        System.out.println((5>3) && (8>5));
        System.out.println((5>3) && (4<5));

        System.out.println((5<3) || (8>5));
        System.out.println((5>3) || (8<5));
        System.out.println((5<3) || (4<5));

        System.out.println(!(5==3));
        System.out.println(!(5>3));
    }
}
