import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Three {
    
    public static boolean isKaprekar(int n) {
        
        // Since we know that 1 is a kaprekar number we return true
        // And on the other hand, we return false for 2 and 3
        if (n == 1) {
            return true;
        } else if (n == 2 || n == 3) {
            return false;
        }

        int squared = (int) Math.pow(n, 2);
        int d = Integer.toString(n).length(); // d as given in the question
        String squareNum = Integer.toString(squared);

        StringBuffer firstHalf = new StringBuffer();
        StringBuffer secondHalf = new StringBuffer();

        if (squareNum.length() % 2 == 0) {
            
            // If the number of digits in the square of the number is even
            // We divide the number in two equal parts

            firstHalf.append(squareNum.substring(0, squareNum.length() / 2));
            secondHalf.append(squareNum.substring(squareNum.length() / 2));

        } else {

            // If it isn't even, we divide it into two parts with (d - 1)

            firstHalf.append(squareNum.substring(0, d - 1));
            secondHalf.append(squareNum.substring(d - 1));

        }      


        return Integer.parseInt(firstHalf.toString()) + Integer.parseInt(secondHalf.toString()) == n;

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter lower limit (less than 5000) : ");
        int p = Integer.parseInt(in.readLine());

        System.out.print("Enter upper limit (less than 5000) : ");
        int q = Integer.parseInt(in.readLine());

        int count = 0;

        System.out.println();

        System.out.print("The Kaprekar numbers are : ");  
        if (p < 5000 && q < 5000) {
            
            for (int i = p; i <= q; i++) {
                
                if (isKaprekar(i)) {
                    System.out.print(i + " ");
                    count++;
                }

            }

            System.out.println("\nThe frequency of Kaprekar numbers is : " + count);

        }
            
    }

}

/**
 * 
 * isKaprekar(n):
 * Step 1: Start
 * Step 2: If n is 1, return true. Else if it's 2 or 3, return false
 * Step 3: Intitialize variable squared with the value of n squared
 * Step 4: Intialize variable d, with the value of length of n
 * Step 5: Initialize variable squareNum, with the value of squared converted to a string
 * Step 6: Initialize two StringBuffer objects named firstHalf and secondHalf
 * Step 7: If the length of squareNum is even, append first half of the string to firstHalf and the rest to secondHalf
 * Step 8: If the length of the squareNum is odd, append squareNum.substring(0, d - 1) to fist half and the rest from index (d - 1) till the end to secondhalf
 * Step 9: Return if the sum of firstHalf and secondHalf is equal to n
 * Step 10: End  
 * 
 */
