public class FindCompoundInterest {
    public static void main(String[] args) {
        int p = 1000;
        double r = 0.10;
        int n = 1 ;
        int t = 5;

        // p* (1+r/n)^n*t

        double fpart = 1+r/n;
        int spart = n*t;

        double CI = p * Math.pow(fpart, spart);
        System.out.println("compound interest is : "+ CI);
    }
}
