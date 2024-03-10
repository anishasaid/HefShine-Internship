package GTO;

public class Question1 {
    public static void printB(String str){
        System.out.println(Boolean.valueOf(str) ? "true" : "false");
    }
    public static void main(String[] args) {
        printB("tRuE");
        printB("false");
    }
}
