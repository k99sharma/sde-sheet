package Matrix.Search2DMatrix;

// Approach: Binary Search in rows
// Time Complexity: O(n (log(n)) -> n for traversing the rows + log(n) for searching target in row
// Space Complexity: O(1)

import java.util.*;

public class Approach2{
    // iterative binary search method
    public static boolean binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(target > arr[mid]) low = mid+1;
            else if(target < arr[mid]) high = mid-1;
            else return true;
        }

        return false;
    }
    public static boolean searchMatrix(int[][] mat, int target){
        for(int row=0; row<mat.length; row++){
            boolean isFound = binarySearch(mat[row], target);

            if(isFound) return true;
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
