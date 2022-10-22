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

/*
 * getPotential(String):
 * Step 1: Start
 * Step 2: Make a HashMap to store the alphabets with the corresponding "potentials"
 * Step 3: Loop through the input string's characters and add the corresponding potential from the HashMap
 * Step 4: Return the calculated potential
 * Step 5: End
 * 
 * sortByPotential(String):
 * Step 1: Start
 * Step 2: Split the given sentence into a array of words, make an array to store the potentials of the same length
 * Step 3: Make a HashMap to store the potential of a word as the key and the word itself as the value
 * Step 4: Sort the "potentials" array
 * Step 5: Loop through the potentials array and get the word from the HashMap, append it to a string
 * Step 6: Trim the string and return it
 * Step 7: End
 * 
 * main():
 * Step 1: Start
 * Step 2: Take sentence as input
 * Step 3: Instantiate a variable and set it to the value of sortPotential(sentence)
 * Step 4: Print the variable
 * Step 5: End
 * 
 */
