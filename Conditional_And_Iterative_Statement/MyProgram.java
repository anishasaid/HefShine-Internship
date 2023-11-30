// print following message on console 
// i - Hef"Shine
// ii - "HefShine"
class MyProgram {
    public static void main(String[] args) {

        char ch = '"';
        System.out.println("Hef"+ch+"Shine");
        // by using back slash we can remove the special property of " .
        System.out.println("Hef\"Shine");

        System.out.println("\"HefShine\"");

        // print a meassage on two lines only one sys out statement 
        // output : Hef
        //          Shine
        System.out.println("Hef\nShine");
    }
}