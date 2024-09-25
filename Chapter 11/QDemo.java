import java.util.Queue;
import java.util.LinkedList;
public class QDemo {
   public static void main(String[] args) {

      Queue<Integer> input_queue = new LinkedList<>();
      input_queue.offer(150);
      input_queue.offer(300);
      input_queue.offer(450);
      input_queue.offer(600);
      System.out.println("The queue is as: " + input_queue);
      int removedNumber = input_queue.poll();
      System.out.println(" After removing an element "+ removedNumber);
      System.out.println(" the elements of the queue are: " +input_queue);
   }
}