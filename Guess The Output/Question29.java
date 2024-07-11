package GTO;
// mcq question
public class Question29 {
    public static void main(String[] args) {
        Boolean pen = true;
        Boolean pencil = false;

        System.out.println(!pen.booleanValue());
        System.out.println(Boolean.compare(pen, pencil));
        System.out.println(pencil.compareTo(pen));
    }
}
