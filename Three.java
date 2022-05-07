import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Three
 */
public class Three {

    public static int mobiusNumber(int n) {
        
        if (n == 1) {
            return 1;
        }

        // Make a new list and a set
        ArrayList<Integer> factors = new ArrayList<Integer>();
       
       for (int i = 2; i < n; i++) {
          while (n % i == 0) {
              factors.add(i);
              n = n / i;
          } 
       }
       
       if (n > 2) {
          factors.add(n); 
       }

       // Make a new Set with factors list
       Set<Integer> set = new HashSet<Integer>(factors);

       if (set.size() < factors.size()) {
           return 0;           
       }

       if (factors.size() == 2) {
           return 1;
       }

       return -1; 
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int number = Integer.parseInt(in.readLine());

        System.out.println("The mobius function is : " + mobiusNumber(number));

    }
    
}
