package GTO;
// mcq question 
public class Question28 {
    public static void main(String[] args) {
        B obj = new B();
        obj.i=1;
        obj.j = 2;
        obj.display();
    }
}

class A{
    public int i;
    private int j;
}
class B extends A{
    void display(){
        super.j = super.i+1;
        System.out.println(super.i+" "+super.j);
    }
}
