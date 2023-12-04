import static java.lang.Math.PI;

class TypeClass{
    public static void main(String args[]){
        //Implicit typecasting
        int  x = 8;
        float y = x;
        System.out.println(y);

        // explicit type casting
        double radious = 5.5;
        float area = (float) (PI * radious * radious);
        System.out.println("Area of circle is : "+area);

        double perimeter = 2 * PI * radious;
        System.out.println("perimeter of circe is  : "+ perimeter);

    }
}