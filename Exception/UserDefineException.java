package Exception;
// User define eceptions are - checked exception

public class UserDefineException {
    public static void main(String[] args) {
        Registered ob = new Registered();
        ob.registered(14);

        Operations o = new Operations();
        o.div(5, 0);
    }
}

class InvalidAgeException extends Exception{

    InvalidAgeException(String str){
        super(str);
    }
}

class Registered{
    void registered(int age){
        if(age < 18){
            //throw exception
            try{

                throw new InvalidAgeException("age < 18");

            }catch(InvalidAgeException e){
                //System.out.println("User is a minor");
                /*
                to print the stack strace but it doesn't show exception discription 
                so to show that discrption we should invoke a parameterised constructor.
                Then that constructor will internally call the exception class constructor.
                 */
                e.printStackTrace(); 
            }

        }else{
            System.out.println("User registered...Please follow further steps");
        }
    }
}

class Operations{
    void div(int num1,int num2){
        if(num2 == 0){

            try{
                throw  new ArithmeticException();
            }catch(ArithmeticException e){
                System.out.println("exeption handle...");
            }

        }else{
            System.out.println(num1 / num2);
        }
    }
}
