import java.io.IOException;
import java.util.ArrayList;

public class Twentythree { 

    public static void main(String[] args) throws IOException {
        
        Stack<Integer> myStack = new Stack<>(3);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println("The stack after pushing 10, 20 and 30 : " + myStack);
        
        myStack.pop();

        System.out.println("The stack after popping : " + myStack);

    }

}

public class Stack<T> {

    ArrayList<T> A;

    int top = -1;
    int size;

    Stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void push(T X) {

        if (top + 1 == size) {
            System.out.println("Stack overflow"); 
            return;
        }

       top += 1;
       
       if (A.size() > top) {
            A.set(top, X);
       } else {
            A.add(X);
       }

    }

    T top() {

        if (top == -1) {
            System.out.println("Stack overflow");
            return null;
        }
        
        return A.get(top);

    }

    void pop() {

        if (top == -1) {
            System.out.println("Stack overflow");
        }

        top--;

    }

    boolean empty() {
        return top == -1;
    }

    public String toString() {

        String ans = "";

        for (int i = 0; i < top; i++) {
           ans += String.valueOf(A.get(i) + "=>");
        }

        ans += String.valueOf(A.get(top));

        return ans;

    }

}

