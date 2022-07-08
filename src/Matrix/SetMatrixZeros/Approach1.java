package Matrix.SetMatrixZeros;

// Approach: Using Extra Space
// Time Complexity: O(n x n)
// Space Complexity: O(n) for auxiliary space

import java.util.*;

public class Approach1 {
    public static void setZeroes(int[][] mat){
        HashSet<Integer> visitedRow = new HashSet<>();
        HashSet<Integer> visitedColumn = new HashSet<>();

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == 0){
                    visitedRow.add(i);
                    visitedColumn.add(j);
                }
            }
        }

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(visitedRow.contains(i) || visitedColumn.contains(j))
                    mat[i][j] = 0;
            }
        }
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

        setZeroes(mat);

        for(int[] row : mat)
            System.out.println(Arrays.toString(row));
    }
}
