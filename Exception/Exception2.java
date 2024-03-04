package Exception;

public class Exception2 {
    public static void main(String[] args) {
        String name = "anisha";
        String n = "sha";
        System.out.println(name.indexOf(n));
        int a[] = {2,6,2,3,4,8,9};

        try{
            System.out.println(name.length());
            System.out.println(a[1]);
            System.out.println(5/0);
        }catch(NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
        // }catch(NullPointerException e ){
        //     System.out.println("null pointer exception catched");
        // }catch(Exception e){
        //     System.out.println(e.getMessage());//getMessage() - to get info about exception
        // }
    }
}
