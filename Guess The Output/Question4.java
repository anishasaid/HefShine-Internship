package GTO;

public class Question4 {
    public static void displayNames(String... names){
        System.out.println(names.length);
        for(String word : names){
            System.out.println(word + " ");
        }
    }
    public static void main(String[] args) {
        displayNames("hi", "and", "hello" , "are", "hefshine.");
    }
}
