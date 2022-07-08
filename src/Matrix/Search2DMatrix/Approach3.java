package Matrix.Search2DMatrix;

// Approach: Binary Search
// Time Complexity: O(log(n))
// Space Complexity: O(1)

import java.util.*;

public class Approach3{
    public static boolean searchMatrix(int[][] mat, int target){
        int i = 0, j = mat[0].length-1;
        // i is representing rows
        // j is representing columns
        while(i < mat.length && j >= 0){
            if(mat[i][j] == target) return true;

            else if(mat[i][j] > target) j--;

            else i++;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[][] mat = new int[m][n];
        for(int row=0; row<m; row++){
            for(int col=0; col<n; col++){
                mat[row][col] = in.nextInt();
            }
        }

        int target = in.nextInt();

        boolean ans = searchMatrix(mat, target);
        System.out.println(ans);
    }
}
