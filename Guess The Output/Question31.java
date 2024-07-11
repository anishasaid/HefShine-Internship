package GTO;

public class Question31 {
    public static void main(String[] args) {
        King k = new King();
        King.Elephant e = k.new Elephant();
        System.out.print("Output = ");
        System.out.println(e.step2(4,7));
    }
}

class King{
    interface Queen{
        float step2(int low, int high);
    }

    interface Pawn{
        float step3(int a, int b, int c);
    }

    abstract class Knight implements Queen, Pawn{

    }
    class Elephant implements Queen{
        public float step2 (int x, int y){
            return 2;
        }
    }
}
