package GTO;

public class Question6 {
    public static void main(String[] args){
        byte y = 1;
        byte x  = 1;

        System.out.println(SRITCollege.code(x, y) + ", ");
        System.out.println("hef+ ");
        System.out.println("hi");
    }
    
}
class SRITCollege{
    protected static long code(byte x, byte y){
        return (short) (x / y * 2);
    }
}
