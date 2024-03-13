package GTO;

public class Question10 {
    public static void main(String[] args) {
        
        String desktopComputer[] = {"Acer","Apple","Dell","IBM","Microsoft"};
        String noteBooks[] = {"KOBO","Google","ViewSonic","Microsoft"};

        System.arraycopy(desktopComputer, 1, noteBooks, 0, noteBooks.length);
        for(String element : noteBooks){
            System.out.println(element + " ");
        }

        
    }
}
