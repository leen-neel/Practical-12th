import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Four {
    
    // Check if a number is a prime number or not
    public static boolean isPrime(int n) {
        
        if (n == 1)
            return false;

        int factors = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }

        return factors == 2;

    }

    public static void findPrimes(int n) {
        
        ArrayList<Integer> differences = new ArrayList<Integer>();

        int difference = 0;

        for (int i = 0; i <= n; i++) {
            
            if (isPrime(i)) { // Checks if i is a prime number
                difference = n - i;

                // Checks if the difference already exists, if it does the loop continues
                if (!differences.contains(i)) {

                    if (isPrime(difference)) {

                        differences.add(difference); 
                        System.out.println(i + " + " + difference + " = " + n); // Prints the difference between n and i
                    
                    }   
                
                }
            
            }

        }
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter an even number between 10 to 49 : ");
        int n = Integer.parseInt(in.readLine());

        if (n > 9 && n < 50 && n % 2 == 0) {
            
            findPrimes(n);

        } else {

            System.out.println("Invalid input");
            
        }

    }

}

/*
 *
 * isPrime(n):
 * Step 1: Start
 * Step 2: If n equals 0 or 1, return false
 * Step 3: Initialize variable factors
 * Step 4: Loop from 1 to n, if(n % i == 0) increment factors by 1
 * Step 5: Return (factors == 2)
 * Step 6: End
 * 
 * findPrimes(n):
 * Step 1: Start
 * Step 2: Initialize ArrayList object differences which will be used to store the differences between two numbers
 * Step 3: Initialize int difference
 * Step 4: Loop from 0 to n with variable i
 * Step 5: If i is a prime number, difference = n - i
 * Step 6: If differences contains i already, check if difference is a prime number. If it is a prime number, add difference to differences and print corresponding output
 * Step 7: End
 * 
 */
