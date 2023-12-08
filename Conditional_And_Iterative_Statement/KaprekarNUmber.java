public class KaprekarNUmber {
    public static void main(String[] args) {
        int num = 45;
        // copy of num 
        int temp = num;

        //calculate square
        int sq = num * num ;
        
        //calculate number of digits in a num
        int count = 0;
        while(num > 0){
            num = num/ 10;
            count ++;
        }
        System.out.println("count of num  : "+count);

        // calculae power
        int div =(int) Math.pow(10,count);

        // divide the square into 2 part
        int fpart = sq % div;
        int spart = sq / div;
        
        // addition of fpart and spart
        int sum = fpart + spart;

        //compare sum and temp 
        if(sum == temp ){
            System.out.println("kaprekar number");
        }else{
            System.out.println("not kaprekar number");
        }


    }
}
