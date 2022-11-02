import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Nineteen
 */
public class Nineteen {

    public static int gcd(int a, int b) {

        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        if (a == b) {
           return a; 
        }

        if (a > b) {
           return gcd(a - b, b) ;
        }

        return gcd(a, b - a);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first number : ");
        int a = Integer.parseInt(in.readLine());
        
        System.out.print("Enter the second number : ");    
        int b = Integer.parseInt(in.readLine());

        System.out.println("\nThe HCF is : " + gcd(a, b)); 

    }
    
}
