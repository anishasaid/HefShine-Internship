package GTO;

public class Question12 {
    public static void main(String[] args) {
        char array[] = {'M','y','_','J','a','v','a','_','e','x','a','m','p','l','e'};

        String str = String.copyValueOf(array);
        System.out.print(str +", ");
        String subStr = String.copyValueOf(array, 3, 4);
        System.out.print(subStr + ", ");
        subStr = String.copyValueOf(array, 3, 6);
        System.out.println(subStr);
        str.getChars(5, 12, array, 0);
        System.out.println(array);
    }
}
