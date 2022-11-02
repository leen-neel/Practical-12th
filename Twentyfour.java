import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Twentyfour
 */
public class Twentyfour {

    public static void main(String[] args) {
        
        Queue<Integer> myQueue = new Queue(3);



    }
    
}

public class Queue<T> {

    int front, rear, capacity;
    T arr[];

    public Queue(Class<T> c, int capacity)  {

        this.front = 0;
        this.rear = 0;
        this.capacity = capacity;

        @SuppressWarnings("unchecked")
        final T[] a = (T[]) Array.newInstance(c, capacity);
        this.arr = a;

   }

    void enqueue(T data) {

            if (capacity == rear) {
            System.out.println("\nQueue is full\n");
            return;
            }

            arr[rear] = data;
            rear++;

    }

   void dequeue() {

        if (front == rear) {
            System.out.println("\nQueue is empty\n"); 
        }

        for (int i = 0; i < rear - 1; i++) {
            arr[i] = arr[i + 1];
        }

        if (rear < capacity) {
            arr[rear] = 0;
        }

        rear--;

   }

   public String toString() {

        String ans = "";

        if (front == rear) {
           System.out.println("\nQueue is empty\n"); 
        }

        for (int i = 0; i < rear; i++) {
           ans += arr[i] + "<=";
        }

        return ans;

   }

}
