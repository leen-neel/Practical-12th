import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Five {

    public static String toWords(int n) {

        StringBuffer number = new StringBuffer(Integer.toString(n));
        String result = "";

        for (int i = 0; i < number.length(); i++) {
           
            switch (number.charAt(i)) {
                case '0':
                    result += "Zero ";
                    break;
                case '1':
                    result += "One ";
                    break;
                case '2':
                    result += "Two ";
                    break;
                case '3':
                    result += "Three ";
                    break;
                case '4':
                    result += "Four ";
                    break;
                case '5':
                    result += "Five ";
                    break;
                case '6':
                    result += "Six ";
                    break;
                case '7':
                    result += "Seven ";
                    break;
                case '8':
                    result += "Eight ";
                    break;
                case '9':
                    result += "Nine ";
                    break;
            
            }

        
        
        }

        return result.trim().toString();
    
    }

    public static void denominate(int number) {
       
        int[] notes = {1000 , 500 , 100 , 50 , 20 , 10 , 5 , 2 , 1};

        for (int i = 0; i < notes.length; i++) {
           int count =  number / notes[i];
           
           if (count != 0) {
               System.out.println(notes[i] + "\t*\t" + count + "\t=\t" + (count * notes[i]));
               number = number % notes[i];
           }
        }
        
    }

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the amount : ");
        int amount = Integer.parseInt(in.readLine());

        System.out.println();

        System.out.println("The amount in words : " + toWords(amount));
        System.out.println();
        denominate(amount);

    }

}