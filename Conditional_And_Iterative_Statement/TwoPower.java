public class TwoPower {
    public static void main(String[] args) {
        int power = 5;
        int base = 2;
        int ans = 1;

        for(int i=1 ; i<= power; i++){
            //ans = ans * base;
            ans*= base;
        }
        System.out.println(ans);
    }
}
