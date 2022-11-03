import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Twentythree
 */
public class Twentytwo {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of teams : ");
        int teamNo = Integer.parseInt(in.readLine());

        System.out.println();
        
        String[] teams = new String[teamNo];
        int highestLength = 0;

        for (int i = 0; i < teamNo; i++) {
            
            System.out.print("Team " + (i + 1) + " : ");
            teams[i] = in.readLine();

            if (teams[i].length() > highestLength) {
                highestLength = teams[i].length();
            }

        }

        System.out.println();

        for (int i = 0; i < highestLength; i++) {

            for (int j = 0; j < teams.length; j++) {
                
                if (i >= teams[j].length()) {
                    System.out.print(" \t");
                } else {
                   System.out.print(teams[j].charAt(i) + "\t"); 
                }
                
            }

            System.out.println();
            
        }

    }    
    
}

/*
 * 
 * Step 1: start
 * Step 2: Take the number of teams as input and get their names in an array from the user
 * Step 3: Get the word with the highest length and store the highest length in a variable
 * Step 4: Now we loop through the 0 to highestLength (i) and we loop through the array inside the previous loop (j)
 * Step 5: If j is greater than or equals to the length of the current team name, we print a tab space
 * Step 6: Else we print the corresponding character
 * Step 7: End 
 * 
 */
