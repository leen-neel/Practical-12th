import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Three {

    public static void sortedString(String[] s) {
        
        int n = s.length;

        for (int i=1 ;i < n; i++) {
            String temp = s[i];
     
            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }

    }

    public static String arrayToString(String[] words) {

        String str = "";

        for (int i = 0; i < words.length; i++) {
           str += words[i];
        }

        return str.trim();
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        String[] words = str.split("\\s");

        sortedString(words);
        // System.out.println(Arrays.toString(words));


        if (str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '?' || str.charAt(str.length() - 1) != '!') {

            
            
        }
        
    }     
    
}
