import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Three {

    public static String sortedString(String str) {
        
        String[] words = str.split("//s");

        for (int i = 0; i < words.length; i++) {
            
            String temp = words[i];

            int j = i - 1;
            while (j >= 0 && temp.length() < words[j].length()) {
               words[j + 1] = words[j];
               j--; 
            }

            words[j + 1] = temp;

        }

        String sorted = "";

        for (int i = 0; i < words.length; i++) {
            sorted += words[i] + " ";
        }

        return sorted;

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string : ");
        String str = in.readLine();

        System.out.println(sortedString(str));

        // if (str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '?' || str.charAt(str.length() - 1) != '!') {

            
            
        // }
        
    }     
    
}
