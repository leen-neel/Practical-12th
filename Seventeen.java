import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Seventeen
 */
public class Seventeen {

    public static boolean isPrime(int n, int i) {

        if (n <= 2) {
            return n == 2;
        }

        if (n % i == 0) {
            return false;
        }

        if (i * i > n) {
            return true; 
        }

        return isPrime(n, i + 1);
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println(isPrime(n, 2) ? "The number is a prime" : "The number isn\'t a prime");
    
    }
    
}
