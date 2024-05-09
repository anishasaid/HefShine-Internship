package GTO;

public class Question21 {
    public static void main(String[] args) {
        Output O = new Output();
        O.string();
    }
}

class Output{
    void string(){
        Output1 t = new Output1();
        System.out.println(t.x+" ");
        Output1 t2 = fix(t);
        System.out.println(t.x+" "+t2.x);
    }

    Output1 fix(Output1 tt){
        tt.x -= 42;
        return tt;
    }
}

class Output1 {
    byte x = 42;
}