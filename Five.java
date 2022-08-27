import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Five {


    public static boolean isPrime(int n) {

        int factors = 0;

        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors == 2;

    }

    public static int mobiusNumber(int n) {
        
        // If the number is 1, return 1
        if (n == 1) {
            return 1;
        }

       ArrayList<Integer> factors = new ArrayList<Integer>(); // This ArrayList stores the factors
      

       // Find the factors and add them to the factors list
       for (int i = 2; i < n; i++) {
          while (n % i == 0 && isPrime(i)) {
              factors.add(i);
              n = n / i;
          } 
       }
       
       if (n > 2) {
          factors.add(n); 
       }

       // This set will store the same values as the factors list
       Set<Integer> set = new HashSet<Integer>(factors);

       // Since sets can't store duplicates, if the size of set is larger than the factors list, we assume that there's been repetition of elements and we return 0
       if (set.size() < factors.size()) {
           return 0;           
       }

       // If the number of factors is 2, we return 1
       if (factors.size() == 2) {
           return 1;
       }

       // If the code reaches this point, we return -1
       return -1; 
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int number = Integer.parseInt(in.readLine());

        System.out.println("The mobius function is : " + mobiusNumber(number));

    }
    

}

/**
 * 
 * mobiusNumber():
 * Step 1: If the number is 1, return 1
 * Step 2: Create an ArrayList
 * Step 3: Find the factors and add them to the ArrayList
 * Step 4: Create a set
 * Step 5: If the size of the set is larger than the size of the ArrayList, we assume that there's been repetition of elements and we return 0
 * Step 6: Return -1 if the code reaches this point
 * Step 7: End 
 * 
 */
