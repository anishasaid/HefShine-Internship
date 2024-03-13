package GTO;

public class Question8 {
   public static void main(String[] args) {
        Moon O = new Moon();
        O.run();
   }
}

class Moon{
    public void run(){
        long [] a = {3,4,5};
        long [] b  = modify(a);
        System.out.println(a[0]+a[1]+a[2]+" ");
        System.out.println(b[0]+b[1]+b[2]);
    }

    long [] modify(long [] c){
        c[1] = 7;
        return c;
    }
}