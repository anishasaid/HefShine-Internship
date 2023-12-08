// write a progam to print pell series
class PellSeries{
    public static void main(String[] args) {

        int userChoice = 10;

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for(int i=1; i<=userChoice-2;i++){
            int c = (b * 2) + a;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}