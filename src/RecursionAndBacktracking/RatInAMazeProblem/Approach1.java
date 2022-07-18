package RecursionAndBacktracking.RatInAMazeProblem;

// Approach: Backtracking
// Space Complexity: O(n) for recursive stack
// Time Complexity: O(2^n)

import java.util.*;
public class Approach1 {
    public static void solve(int[][] mat, int row, int col, ArrayList<String> ans, String curr){
        // base case
        if(row == mat.length-1 && col == mat.length-1){
            ans.add(curr);
            return;
        }

        // if start point is blocked
        if(mat[0][0] == 0){
            ans.add("-1");
            return;
        }

        // up
        if((row-1) >= 0 && mat[row-1][col] != 0 && mat[row-1][col] != '#'){
            int temp = mat[row][col];
            mat[row][col] = '#';
            solve(mat, row-1, col, ans, curr + "U");
            mat[row][col] = temp;
        }

        // down
        if((row+1) < mat.length && mat[row+1][col] != 0 && mat[row+1][col] != '#'){
            int temp = mat[row][col];
            mat[row][col] = '#';
            solve(mat, row+1, col, ans, curr + "D");
            mat[row][col] = temp;
        }

        // left
        if((col-1) >= 0 && mat[row][col-1] != 0 && mat[row][col-1] != '#'){
            int temp = mat[row][col];
            mat[row][col] = '#';
            solve(mat, row, col-1, ans, curr + "L");
            mat[row][col] = temp;
        }

        // right
        if((col+1) < mat[0].length && mat[row][col+1] != 0 && mat[row][col+1] != '#'){
            int temp = mat[row][col];
            mat[row][col] = '#';
            solve(mat, row, col+1, ans, curr + "R");
            mat[row][col] = temp;
        }
    }

    public static ArrayList<String> findPath(int[][] mat){
        ArrayList<String> ans = new ArrayList<>();

        solve(mat, 0, 0, ans, "");

        return ans;
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

        ArrayList<String> result = findPath(mat);
        System.out.println(result);
    }
}
