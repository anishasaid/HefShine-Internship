package GTO;
// not solve
import java.util.Vector;

public class Question19 {
    public static void main(String[] args) {

        @SuppressWarnings("unchecked")
        Vector<String> vector = new Vector<String>();
        vector.add("One");
        vector.add("fivetwo");
        vector.add("twotwo");
        vector.add("Four");

        System.out.println("Original vector: "+vector);
        Vector<String> copy = (Vector<String>) vector.clone();
        System.out.println("After cloning: "+ copy);
    }
}
