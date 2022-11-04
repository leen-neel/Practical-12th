import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Eleven {
  public static void spiralMatrixPrint(int[][] arr) {

  int rows = arr.length;
  int cols = arr[0].length;
  // Defining the boundaries of the matrix.
  int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
  
  // Defining the direction in which the array is to be traversed.
  int dir = 1;
 
  while (top <= bottom && left <= right) {

    if (dir == 1) {    // moving left->right
      for (int i = left; i <= right; ++i) {
        System.out.print(arr[top][i] + " ");
      }
      // Since we have traversed the whole first
      // row, move down to the next row.
      ++top;
      dir = 2;
    } 
    else if (dir == 2) {     // moving top->bottom
      for (int i = top; i <= bottom; ++i) {
          System.out.print(arr[i][right]+ " ");
      }
      // Since we have traversed the whole last
      // column, move left to the previous column.
      --right;
      dir = 3;
    } 
    else if (dir == 3) {     // moving right->left
      for (int i = right; i >= left; --i) {
          System.out.print(arr[bottom][i]+ " ");
      }
      // Since we have traversed the whole last
      // row, move up to the previous row.
      --bottom;
      dir = 4;
    } 
    else if (dir == 4) {     // moving bottom->up
      for (int i = bottom; i >= top; --i) {
          System.out.print(arr[i][left]+ " ");
      }
      // Since we have traversed the whole first
      // col, move right to the next column.
      ++left;
      dir = 1;
    }
  }   
}
  public static void main(String[] args) throws IOException { 
    
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("Enter the size of the matrix : ");
      int n = Integer.parseInt(in.readLine());

      int[][] arr = new int[n][n];
      System.out.println();

      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
          System.out.print("Enter data for position (" + i + ", " + j + ") : ");
          arr[i][j] = Integer.parseInt(in.readLine());
        }
      }

      System.out.println();

      spiralMatrixPrint(arr);
  
  } 
} 

/**
 * 
 * Step 1: Start
 * Step 2: Take array as input
 * Step 3: Move from left to right
 * Step 4: Move from top to bottom
 * Step 5: Move from right to left
 * Step 6: Move from bottom to up
 * Step 7: End
 * 
 */
