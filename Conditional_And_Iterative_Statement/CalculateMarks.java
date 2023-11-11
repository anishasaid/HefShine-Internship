class CalculateMarks{
    public static void main(String[] args) {
        int sub1 = 45;
        int sub2 = 78;
        int sub3 = 78;
        int sub4 = 46;
        int sub5 = 98;

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (total * 100 ) / 500 ;

        System.out.println(percentage);
        if(percentage >= 90){
            System.out.println("Grade A");
        }else if(percentage >= 80){
            System.out.println("Grade B");
        }else if(percentage >= 70){
            System.out.println("Grade C");
        }else if(percentage >= 60){
            System.out.println("Grade D");
        }else if(percentage >= 40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }
    }
}