package GTO;

public class Question2 {
    public static void main(String[] args) {

        int z = 6;

        for(int i=0; i<2; i++){
            switch (z) {
                case 3:
                    System.out.println((z = z + 1) + " ");
                case 5:
                    System.out.println((z = z + 2) + " ");
                    break;
                default:
                    System.out.println((z = z + 8)+ " ");
                case 6:
                    System.out.println((z = z + 4 )+ " ");
                    
            }
        }
    }
}
