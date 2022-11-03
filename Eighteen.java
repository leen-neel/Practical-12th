import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Eighteen
 */
public class Eighteen {

    public static int getBinary(int n) {
    
        if (n == 0) {
            return 0;
        } else {
            return (n % 2 + 10 * getBinary(n / 2));
        }
        
    }

    public static void main(String[] args) throws IOException {
    
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number : ");
        int n = Integer.parseInt(in.readLine());

        System.out.println("The number in binary is : " + getBinary(n));

    }
    
}

/*
 * 
 * Step 1: Start
 * Step 2: Get the number
 * Step 3: Get the binary of the number recursively
 * Step 4: End
 * 
 */
