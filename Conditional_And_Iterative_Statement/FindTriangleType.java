public class FindTriangleType {
    public static void main(String[] args) {
        int s1 = 10;
        int s2 = 20;
        int s3 = 20;

        if(s1 == s2 && s2 == s3 && s1 == s3){
            System.out.println("Equilateral Triangle");
        }else if(s1 == s2 || s2 == s3 || s1 == s3){
            System.out.println("Isoscale Traianble");
        }else{
            System.out.println("Scalene Triangle");
        }
    }
}
