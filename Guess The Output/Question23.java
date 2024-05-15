package GTO;

public class Question23 {
    public static void main(String[] args) {
        char c = 'A';
        int i=0;
        for(; i<2; i++, m(i,c)){
            c += i;
        }
        m(i,c);
    }
    private static void m(int i, char c){
        for(int j=0; j<i; j++){
            System.out.print(c);
        }
    }
}
