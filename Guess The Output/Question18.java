package GTO;

public class Question18 {
    public static void main(String[] args) {

        char [][] gods= {
            "Ganesh".toUpperCase().toCharArray(), "Karthikeya".toUpperCase().toCharArray()
        };
        int max = 2;
        int i=0;
        for(i=0; i<gods.length; i++){
            if(max > gods[i].length){
                max = gods[i].length;
            }
        }

        for(i=0; i<max; i++){
            char first = (i<gods[0].length ? gods[0][i] : 'A');
            char second = (i<gods[1].length ? gods[1][i] : 'A');
            char third = (char) (first + second - 'A');
            System.out.print(third);
        }
    }
}
