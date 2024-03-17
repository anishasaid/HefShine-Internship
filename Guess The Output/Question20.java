package GTO;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question20 {
    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("M+",5);
        Matcher matcher = pattern.matcher("M Merit Match MM m mM");
        while(matcher.find())
        System.out.print(matcher.group()+" ");
    }
}
