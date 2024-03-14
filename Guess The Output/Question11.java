package GTO;

public class Question11 {
    public static void main(String[] args) {
        
        int numbers[] = {01111,02222,03333,04444,05555};
        for(int number : numbers){
            if(number == 2222){
                continue;
            }
            System.out.print(number+",");
        }
    }
}
