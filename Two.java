import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
    
    // This function checks if a number is prime or not
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

    // This function reverses a number by using StringBuffer class
    public static int reverseNum(int n) {
        
        StringBuffer num = new StringBuffer(Integer.toString(n));
        return Integer.parseInt(num.reverse().toString());

    }
    
    // This function checks if a number is an Adam number or not
    public static boolean isAdam(int n) {
        
        int reversedNum = reverseNum(n);

        int squared = (int) Math.pow(n, 2);
        int reverseSquared = (int) Math.pow(reversedNum, 2);

        return squared == reverseNum(reverseSquared);

    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        System.out.print("Enter the lower limit : ");
        int m = Integer.parseInt(in.readLine());

        System.out.print("Enter the upper limit : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        System.out.print("The Adam-Prime numbers are : ");
        for (int i = m; i <= n; i++) {
            
            if (isAdam(i) && isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }

        }

        if (count == 0) {
            System.out.print("NIL");
        }

        System.out.println();

        System.out.println("Frequency of Adam-Prime numbers is " + count);

    }

}

/**
 * 
 * isPrime(n):
 * Step 1: Start
 * Step 2: If n equals 0 or 1, return false
 * Step 3: Initialize variable factors
 * Step 4: Loop from 1 to n, if(n % i == 0) increment factors by 1
 * Step 5: Return (factors == 2)
 * Step 6: End
 * 
 * reverseNum(n):
 * Step 1: Start
 * Step 2: Create StringBuffer num with n converted to string as a parameter
 * Step 3: Reverse num and parse it as an integer and return it
 * Step 4: End
 * 
 * isAdam(n):
 * Step 1: Start
 * Step 2: Initialize variable reversedNum with value of reverseNum(n)
 * Step 3: Initialize variable squared with the square of n using Math.pow(). Parse it as an int explicitly
 * Step 4: Initialize variable reverseSquared with the square of reversedNum using Math.pow(). Parse it as an int explicitly
 * Step 5: return squared == reverseNum(reverseSquared)
 * Step 5: End
 * 
 */
