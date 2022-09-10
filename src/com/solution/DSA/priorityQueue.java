//What is the output of the following program? 
import java.util.*;
 
public class priorityQueue {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> queue
            = new PriorityQueue<>();
        queue.add(11);
        queue.add(10);
        queue.add(22);
        queue.add(5);
        queue.add(12);
        queue.add(2);
 
        while (queue.isEmpty() == false)
            System.out.printf("%d ", queue.remove());
 
        System.out.println("\n");
    }
}

//Explanation: Priority queue always outputs the minimum element from the queue when remove() method is called, no matter what the sequence of input is.
