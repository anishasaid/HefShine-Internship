package GTO;

public class Question5 {
    public static void main(String[] args) {
        VariableTest ob = new VariableTest();
        System.out.println(ob.a++ + +ob.d + ++VariableTest.i);
    }
}

class VariableTest{
    static int i;
    final double d = 58.3395;
    int a ;
}