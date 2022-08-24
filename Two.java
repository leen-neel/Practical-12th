import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two {
     
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

    public static int reverseNum(int n) {
        
        StringBuffer num = new StringBuffer(Integer.toString(n));
        return Integer.parseInt(num.reverse().toString());

    }
    
    public static boolean isAdam(int n) {
        
        int reversedNum = reverseNum(n);

        int squared = (int) Math.pow(n, 2);
        int reversSquared = (int) Math.pow(reversedNum, 2);

        return squared == reverseNum(reversSquared);

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
