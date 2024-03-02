package Collection.Queue;
// QUEUE -
import java.util.PriorityQueue;

public class CreatePriorityQueue {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);

        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(10);
        queue2.add(20);
        queue2.add(30);
        queue2.add(40);
        queue2.add(50);
        queue2.add(60);
        queue2.add(70);
 
        //check equality of 2 queue
        for(int data : queue){
            if(queue2.contains(data)){
                System.out.println("yess");
            }else{
                System.out.println("No");
            }
        }

        //This method of printing of queue elements follows priority mechanism
        //it prints the elements priority wise.
        //if we print elements by using poll() method then it will give us different o/p 
        System.out.println(queue);


    }
}
