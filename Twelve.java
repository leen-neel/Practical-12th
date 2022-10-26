import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Twelve {

    public static int[][] rotateArray(int[][] arr) {
       
        int[][] newArr = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                newArr[j][arr.length - 1 - i] = arr[i][j];
            }
        }

        return newArr;

    }

    public static void printArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the length of the matrix (less than 10 and greater than 2) : ");
        int length = Integer.parseInt(in.readLine());

        if (!(length > 2 && length < 10)) {

            System.out.println("Out of range");
            return;

        }

        int[][] arr = new int[length][length];
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());

            }
        }

       System.out.println("Original matrix : "); 
       printArr(arr);

       int[][] rotatedArr = rotateArray(arr);
       System.out.println();
        
       System.out.println("Rotated matrix : ");
       printArr(rotatedArr);

    }

}

/*
 * 
 * Step 1: Start
 * Step 2: Take array as input
 * Step 3: Make a new array with the same size
 * Step 4: Put the current element of the array into [j][length - 1 - i] of the new array
 * Step 5: Return new array
 * Step 6: End
 * 
 */