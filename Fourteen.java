import java.util.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Fourteen {

   public static int getPotential(String str) {

        Map<Character, Integer> alphabets = new HashMap<>();
        str = str.toUpperCase();

        int count = 1;
        int potential = 0;

        for (char c = 'A'; c <= 'Z'; c++) {

            alphabets.put(c, count);
            count++;
            
        }
        
        for (int i = 0; i < str.length(); i++) {
            potential += alphabets.get(str.charAt(i));
        }

        return potential;

   }
   
   public static String sortByPotential(String str) {

        String[] words = str.split("\\s");
        int[] potentials = new int[words.length];
        Map<Integer, String> wordPotential = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            int potential = getPotential(words[i]);
            potentials[i] = potential;
            wordPotential.put(potential, words[i]);
        }

        Arrays.sort(potentials);
        String sortedSentence = "";

        wordPotential.forEach((k, v) -> System.out.println(v + " = " + k));

        for (int i = 0; i < potentials.length; i++) {
            sortedSentence += wordPotential.get(potentials[i]) + " ";
        }

        return sortedSentence.trim();
    
   }

   public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a sentence : ");
        String sentence = in.readLine();

        System.out.println();
        String sortedString = sortByPotential(sentence);
        System.out.println();

        System.out.println(sortedString);

   }

}
