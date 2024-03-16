package GTO;

public class Question15 {
    public static void main(String[] args) {
        final int result = 50;
        final int assign ;
        Final f = new Final();
        assign = 80;
        f.print(result);
        System.out.println(Final.process(result)+", "+assign+", "+f.assign);
    }

}

class Final{
    final int assign = 35;
    Final(){
        final int assign = 10;
        print(assign);
    }

    static int process(int a){
        return a + 5;
    }

    void print(int assign){
        System.out.print(assign + ", ");
    }
}