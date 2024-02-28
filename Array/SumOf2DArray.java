package Array;
// Make addtion of elements in 2D array.
public class SumOf2DArray {
    public static void main(String[] args) {
        
        int a[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int b[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // create new array to store 
        int c[][] = new int[a.length][a.length];

        // perform addition and add in c Array
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        //print
        for(int i=0; i<c.length;i++){
            for(int j=0; j<c.length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
