import java.util.Deque;
import java.util.LinkedList;

/**
 * Twentyfive
 */
public class Twentyfive {

    public static void main(String[] args) {
        
       Deque<String> deque = new LinkedList<String>(); 

       // Adds element to the dedque
       deque.add("Element 1");

       // Adds element to the beginning of the deque
       deque.addFirst("First");

       // Adds element to the end of the deque
       deque.offer("Element last");

       System.out.println(deque);

    }
    
}
