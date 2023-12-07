public class IsPerfectSquare {
    public static void main(String[] args) {
        int num = 20;
        int count = 0;
        for(int i=1; i<=num; i++){
            if(i *i == num){
                count ++;
            }
        }
        if(count == 1){
            System.out.println("perfect square");
        }else{
            System.out.println("not a perfect square");
        }
    }
}
