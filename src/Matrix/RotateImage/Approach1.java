package Matrix.RotateImage;

// Approach: Using auxiliary space
// Time Complexity: O(n^2)
// Space Complexity: O(n x n) for auxiliary array

import java.util.*;
public class Approach1 {
    public static int[][] rotateImage(int[][] mat){
        int[][] rotated = new int[mat.length][mat.length];

        // transpose
        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat.length; col++){
                rotated[row][col] = mat[col][row];
            }
        }

        // reverse rows
        for(int row=0; row<rotated.length; row++){
            int p = 0;
            int q = rotated.length-1;

            while(p < q){
                int temp = rotated[row][p];
                rotated[row][p] = rotated[row][q];
                rotated[row][q] = temp;

                p++;
                q--;
            }
        }

        return rotated;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] matrix = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        int[][] result = rotateImage(matrix);
        for(int[] row : result)
            System.out.println(Arrays.toString(row));
    }
}
