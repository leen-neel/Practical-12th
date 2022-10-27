import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sixteen {

    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return str.equals(rev);
        
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence : ");
        String sentence = in.readLine();

        String[] words = sentence.split("\\s");

        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (isPalindrome(words[i])) {
                System.out.print(words[i] + " "); 
                count++;
            } 
        }

        if (count == 0) {
            System.out.println("No palindrome");
            return;
        }

        System.out.println("\nTotal count : " + count);

    }

}

/**
 * 
 * isPalindrime(String):
 * Step 1: Start
 * Step 2: Make the input string lower case
 * Step 3: Loop through the input string from the end index to 0, keep adding the corresponding character to a new string
 * Step 4: Return if the two string are equal or not
 * Step 5: End
 * 
 * main():
 * Step 1: Start
 * Step 2: Take sentence as input
 * Step 3: Split the sentence into an array of words
 * Step 4: Loop through the array and check if the word is a palindrome or not
 * Step 5: If the word is a palindrome, incriment a count variable and print the word
 * Step 6: If count is 0, print "No palindrome", else print the total count
 * Step 7: End
 * 
 */
