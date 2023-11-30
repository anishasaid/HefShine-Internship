 // write a program to display if a character is an alphabet , number or special character 
public class IsCharNum {
    public static void main(String[] args) {
        char ch = '5';

        if(ch >= 'A' && ch <= 'Z' ||  ch >= 'a' && ch <= 'z'){
            System.out.println("Alphabet : " + ch );
        }else if(ch >= '0' && ch <= '9'){
            System.out.println("number : "+ ch);
        }else{
            System.out.println("special Character : " + ch);
        }    
    }
}
