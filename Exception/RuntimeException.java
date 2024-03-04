package Exception;

public class RuntimeException {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
        d.arrayDemo();
        d.stringDemo();
        System.out.println("**************************************");


        int num1 = 52;
        int num2 = 2;
        int a[] = { 1, 2, 3, 4, 5, 6 };
        String name = null;
        int result = 0;

        try {
            result = num1 / num2;
            System.out.println("Element at given index is : "+ a[1]);
            System.out.println("Length of given string is : "+ name.length());

        } catch (ArithmeticException e) {
            System.out.println("Div : " + result);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception handled");
        }catch(NullPointerException e){
            System.out.println("name is null ...null pointer exeption handled ");
        }
        
    }
}

class Demo {
    void method1() {
        System.out.println("in method1");
        method2();
    }

    void method2() {
        System.out.println("in method2");
        method3();
    }

    void method3() {
        System.out.println("in method3");
        method4();
    }

    void method4() {
        System.out.println("in method4");
        // handling the exception.
        try {
            System.out.println(52 / 0);
        } catch (ArithmeticException e) {
            System.out.println("catched exception");
        }
        System.out.println("byeee");
    }

    void arrayDemo() {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        try {
            System.out.println(a[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of bound .....In arrayDemo()");
        }
    }

    void stringDemo() {
        String name = null;
        System.out.println(name);
        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("null pointer exception ...in stringDemo");
        }
    }
}
