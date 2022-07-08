package Matrix.RotateImage;

// Approach:
// Time Complexity:
// Space Complexity:

import java.util.*;
public class Approach2 {
    public static void reverse(int[] nums){
        int p = 0;
        int q = nums.length-1;

        while(p < q){
            int temp = nums[p];
            nums[p] = nums[q];
            nums[q] = temp;

            p++;
            q--;
        }
    }

    public static void rotate(int[][] nums){
        // transpose
        for(int row=0; row<nums.length; row++){
            for(int col=row; col<nums[row].length; col++){
                int temp = nums[row][col];
                nums[row][col] = nums[col][row];
                nums[col][row] = temp;
            }
        }

        // reverse row
        for(int[] row : nums)
            reverse(row);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] nums = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                nums[i][j] = in.nextInt();
            }
        }

        rotate(nums);

        for(int[] row : nums)
            System.out.println(Arrays.toString(row));
    }
}
