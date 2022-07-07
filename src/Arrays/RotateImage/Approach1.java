package Arrays.RotateImage;

// Approach:
// Time Complexity:
// Space Complexity:

import java.util.*;

public class Approach1 {
    public static void transpose(int[][] mat){
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = tmp;
            }
        }
    }

    public static void reverse(int[][] mat){
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = mat[i][j];
                mat[i][j] = mat[i][n - j - 1];
                mat[i][n - j - 1] = tmp;
            }
        }
    }

    public static void rotateImage(int[][] mat){
        // transpose
        transpose(mat);

        // reverse rows
        reverse(mat);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = in.nextInt();
            }
        }

        rotateImage(mat);
        for(int[] x : mat)
            System.out.println(Arrays.toString(x));
    }
}
