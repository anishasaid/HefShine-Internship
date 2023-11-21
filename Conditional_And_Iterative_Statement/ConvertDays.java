// convert days into year , month , week and days.
// % gives - reminder   &&  / gives - quetient
public class ConvertDays {
    public static void main(String[] args) {
        int days = 710;
        int year = days / 365;
        int rem = days % 365;
        System.out.println("Year : "+year);

        int month = rem/30;
        int rem2 = rem%30;
        System.out.println("Month : "+month);

        int week = rem2/7;
        int day = rem2%7;
        System.out.println("Weeks : "+week);
        System.out.println("Remaining days : "+day );
    }
}
