import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thirteen {

    public static String[] sortWords(String[] words) {
       
        String temp = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                
                if (words[i].compareTo(words[j]) > 0) {
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }

            }
        }

        return words;

    }

    public static String arrayToString(String[] words) {
        
        String str = "";
        for (int i = 0; i < words.length; i++) {
            str += words[i] + " ";
        }

        return str.trim(); 

    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a sentence : ");
        String str = in.readLine();

        System.out.println();
        String[] words = str.split("\\s");

        System.out.println("Length : " + words.length);
        System.out.println(arrayToString(sortWords(words)));
    
    }
    
}
