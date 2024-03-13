package GTO;

public class Question9 {

    private static String meth(char[] input){
        int totalIndex = input.length;
        int writeIndex = 1;
        
        if(input[0] == 'b'){
            writeIndex = 0;
        }

        for(int i=1; i<totalIndex ; ++i){
            if(input[i] == 'b'){
                continue;
            }

            if(input[i] == 'c'){
                if(input[writeIndex - 1] == 'a'){
                    writeIndex--;
                    continue;
                }
            }
            input[writeIndex] = input[i];
            writeIndex++;
        }
        return new String (input, 0, writeIndex);
    }
    public static void main(String[] args) {
        String inputStrng = "hefshine";
        char characters[] = inputStrng.toCharArray();
        System.out.println(meth(characters));
    }
}
