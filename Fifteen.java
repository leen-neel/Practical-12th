import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Fifteen
 */
public class Fifteen {

    public static String encrypt(String str) {

        HashMap<Character, Character> alphabetMap = new HashMap<>();
        String encrypted = "";
        str = str.toUpperCase();

        alphabetMap.put('A', 'C');
        alphabetMap.put('B', 'D');
        alphabetMap.put('C', 'E');
        alphabetMap.put('D', 'F');
        alphabetMap.put('E', 'G');
        alphabetMap.put('F', 'H');
        alphabetMap.put('G', 'I');
        alphabetMap.put('H', 'J');
        alphabetMap.put('I', 'K');
        alphabetMap.put('J', 'L');
        alphabetMap.put('K', 'M');
        alphabetMap.put('L', 'N');
        alphabetMap.put('M', 'O');
        alphabetMap.put('N', 'P');
        alphabetMap.put('O', 'Q');
        alphabetMap.put('P', 'R');
        alphabetMap.put('Q', 'S');
        alphabetMap.put('R', 'T');
        alphabetMap.put('S', 'U');
        alphabetMap.put('T', 'V');
        alphabetMap.put('U', 'W');
        alphabetMap.put('V', 'X');
        alphabetMap.put('W', 'Y');
        alphabetMap.put('X', 'Z');
        alphabetMap.put('Y', 'A');
        alphabetMap.put('Z', 'B');

        for (int i = 0; i < str.length(); i++) {

            encrypted += alphabetMap.get(str.charAt(i));
            
        }

        return encrypted;
        
    }

    public static String revSentence(String sentence) {

        sentence = sentence.toUpperCase();
        String[] words = sentence.split("\\s");
        String rev = "";

        for (int i = words.length - 1; i >= 0; i--) {

            rev += words[i] += " ";
            
        }

        return rev;
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the value of N : ");
        int n = Integer.parseInt(in.readLine());

        String[] sentences = new String[n];

        System.out.println();

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = in.readLine();
        }

        System.out.println();

        for (int i = 0; i < sentences.length; i++) {
            
            if ((i + 1) % 2 != 0) {
                
                String[] words = sentences[i].split("\\s");
                String encryptedWord = "";

                for (int j = 0; j < words.length; j++) {
                    encryptedWord += encrypt(words[j]) + " ";
                }

                System.out.println(encryptedWord);

            } else {
               
                System.out.println(revSentence(sentences[i]));

            }

        }
    
    }
    
}

