import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
/**
 * Twenty
 */
public class Twenty {

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
    
    public static String computeDate(int day, int year) {
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String monthNames[] = {"JANUARY", "FEBRUARY", "MARCH", 
                                "APRIL", "MAY", "JUNE", 
                                "JULY", "AUGUST", "SEPTEMBER", 
                                "OCTOBER", "NOVEMBER", "DECEMBER"};
                                
        boolean leap = isLeapYear(year);
        
        if (leap) {
            monthDays[1] = 29;
        }
        
        int i = 0;
        int daySum = 0;
        for (i = 0; i < monthDays.length; i++) {
            daySum += monthDays[i];
            if (daySum >= day) {
                break;
            }
        }
        
        int date = day + monthDays[i] - daySum;
        
        StringBuffer sb = new StringBuffer();
        sb.append(date);
        sb.append("TH ");
        sb.append(monthNames[i]);
        sb.append(", ");
        sb.append(year);
        
        return sb.toString();
    }
    
    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("DAY NUMBER: ");
        int dayNum = Integer.parseInt(in.readLine());

        System.out.print("YEAR: ");
        int year = Integer.parseInt(in.readLine());

        System.out.print("DATE AFTER (N DAYS): ");
        int n = Integer.parseInt(in.readLine());
        
        if (dayNum < 1 || dayNum > 366) {
            System.out.println("DAY NUMBER OUT OF RANGE");
            return;
        }
         
        if (n < 1 || n > 100) {
            System.out.println("DATE AFTER (N DAYS) OUT OF RANGE");
            return;
        }
        
        String dateStr = computeDate(dayNum, year);
        
        int nDays = dayNum + n;
        int nYear = year;
        boolean leap = isLeapYear(year);
        
        if (leap && nDays > 366) {
            nYear = nYear + 1;
            nDays = nDays - 366;
        } else if (nDays > 365) {
            nYear = nYear + 1;
            nDays = nDays - 365;
        }
        
        String nDateStr = computeDate(nDays, nYear);
        
        System.out.println();
        System.out.println("DATE: " + dateStr);
        System.out.println("DATE AFTER " + n 
                            + " DAYS: " + nDateStr);
    }

}

/**
 * 
 * Step 1: Start
 * Step 2: Get the input from the user
 * Step 3: Add the number of days to the given date
 * Step 4: End
 * 
 */
