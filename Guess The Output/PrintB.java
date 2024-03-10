package GTO;

public class PrintB {
    public static void printB(String str){
        System.out.println(Boolean.valueOf(str) ? "true" : "false");
    }
    public static void main(String[] args) {
        printB("false");
        printB("true");
    }
}
