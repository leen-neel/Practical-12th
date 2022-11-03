import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Twentyone
 */
public class Twentyone {

    public static boolean isLeapYear(int y) {
        
        if (y % 400 == 0) {
            return true;
        }
        else if (y % 100 == 0) {
            return false;
        }
        else if (y % 4 == 0) {
            return true;
        }
        
        return false;
        
    }

    public static boolean isValid(int d, int m, int y) {
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check if the year is a leap year and the date is 29th Feb
        if (isLeapYear(y) && d == 29 && m == 2) {
            return true;
        }

        if (monthDays[m - 1] < d) {
            return false;
        }

        if (d < 0) {
            return false;
        }

        return true;

    }


    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your date of birth in DD\\MM\\YYYY : ");
        
        System.out.print("DD : ");
        int d = Integer.parseInt(in.readLine());

        System.out.print("MM : ");
        int m = Integer.parseInt(in.readLine());

        System.out.print("YYYY : ");
        int y = Integer.parseInt(in.readLine());

        System.out.println();

        System.out.println(isValid(d, m, y) ? "Valid date" : "Invalid date");

    }
    
}

/*
 * 
 * Step 1: Start
 * Step 2: Take the date as input
 * Step 3: Check if the year is a leap year and return true if the date is Feb 29th
 * Step 4: If the number of days is more than the corresponding number of days in a month, return false
 * Step 5: If the number of day is less than 0, return false
 * Step 6: If we reach this part of the code we return true
 * Step 7: End
 * 
 */
