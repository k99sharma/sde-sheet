package Matrix.Search2DMatrix;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;

public class Approach1 {
    public static boolean searchMatrix(int[][] mat, int target){
        for(int row=0; row<mat.length; row++){
            for(int col=0; col<mat[row].length; col++){
                if(mat[row][col] == target)
                    return true;
            }
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
