
//Print all even numbers between 1- 10
public class EvenNumber {

    private static void myCode(double A , double B){
        double x = (A == B ) ? A : B;
        System.out.println(x);
    }
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }

        // boolean a = true;
        // boolean b = false;
        // boolean c = b^ a ; // xor
        // System.out.println(c);
       
        float A = 3.14F;
        double B = 3.14;
        myCode(A,B);
    }
}
