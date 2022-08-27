import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
    
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

    // This function reverses a number and checks if the number is equal to the
    // parameter
    public static boolean isPalindrome(int n) {

        StringBuffer num = new StringBuffer(Integer.toString(n));
        int reverseNum = Integer.parseInt(num.reverse().toString());

        return n == reverseNum;
        
    }

    // This function takes the range as parameters and prints the numbers which are
    // prime and palindrome
    // The function prints the amount of values printed as well
    public static void printValues(int m, int n) {

        int count = 0;

        for (int i = m; i <= n; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println(count == 0 ? "\nInvalid input" : "\nFrequency of prime palindrome numbers is : " + count);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the lower limit : ");
        int m = Integer.parseInt(in.readLine());

        System.out.print("Enter the upper limit : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println();

        if (m < 3000 && n < 3000) {
            printValues(m, n);
        } else {
            System.out.println("Out of range.");
        }

    }

}

/**
 * isPrime(n):
 * Step 1: Start
 * Step 2: If n equals 0 or 1, return false
 * Step 3: Initialize variable factors
 * Step 4: Loop from 1 to n, if(n % i == 0) increment factors by 1
 * Step 5: Return (factors == 2)
 * Step 6: End
 * 
 * isPalindrome(n):
 * Step 1: Start
 * Step 2: Create StringBuffer num with n converted to string as a parameter
 * Step 3: Reverse num and parse it as an integer and name it reverseNum
 * Step 4: Return n == reverseNum
 * Step 5: End
 * 
 */
