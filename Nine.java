import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nine {

    static void sortTwoD(int arr[][]) {
        
        int n = arr.length;
        for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++) {
              for (int k = 0; k < n; k++) {
                 for (int l = 0; l < n; l++) {
                    if (arr[i][j] < arr[k][l]) {
                       // swap
                       int temp = arr[i][j];
                       arr[i][j] = arr[k][l];
                       arr[k][l] = temp;
                    }
                 }
              }
           }
        }

    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("M = ");
        int length = Integer.parseInt(in.readLine());

        System.out.print("N = ");
        int breadth = Integer.parseInt(in.readLine());

        System.out.println();

        int[][] arr = new int[length][breadth];

        int largest = arr[0][0];
        int largestRow = 0;
        int largestCol = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                System.out.print("Enter data for position (" + i + ", " + j + ") : ");
                arr[i][j] = Integer.parseInt(in.readLine());

                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                    largestRow = i;
                    largestCol = j;
                }

            }

        }

        System.out.println();

        System.out.println("Original matrix : ");
        printArray(arr);
        System.out.println("Largest number : " + largest);
        System.out.println("Row : " + largestRow);
        System.out.println("Column : " + largestCol);

        System.out.println();

        System.out.println("Sorted matrix : ");
        sortTwoD(arr);
        printArray(arr);
    }

}

/** 
 * Step 1: Start
 * Step 2: Initialize a two-dimensional array
 * Step 3: Print the array
 * Step 4: Loop through the array's rows
 * Step 5: Loop though the array's column
 * Step 6: Compare two terms of the array
 * Step 7: If the firsr one is greater than the other, swap them
 * Step 8: Loop through all elements and sort them
 * Step 9: Print the sorted array
 * Step 10: Stop
*/


