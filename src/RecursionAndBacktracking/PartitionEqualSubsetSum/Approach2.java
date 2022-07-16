package RecursionAndBacktracking.PartitionEqualSubsetSum;

// Approach: Memoization
// Time Complexity: O(n)
// Space Complexity: O(n) for recursive stack + O(n) for auxiliary array

import java.util.*;
public class Approach2{
    public static boolean solve(int[] nums, int idx, int target, int[][] dp){
        // base case
        if(idx == 0)
            return nums[idx] == target;

        if(target == 0)
            return true;

        if(dp[idx][target] != -1) return dp[idx][target] == 1;

        boolean notTake = solve(nums, idx-1, target, dp);

        boolean take = false;
        if(nums[idx] <= target)
            take = solve(nums, idx-1, target-nums[idx], dp);

        dp[idx][target] = take || notTake ? 1 : 0;

        return take || notTake;
    }
    public static String equalPartition(int n, int[] nums){
        // find sum of all elements
        int sum = 0;
        for(int x : nums)
            sum += x;

        if(sum%2 == 1)
            return "NO";

        sum = sum/2;

        // auxiliary array
        int[][] dp = new int[n][sum+1];
        for(int[] row : dp)
            Arrays.fill(row, -1);

        return solve(nums, n-1, sum, dp) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        String result = equalPartition(n, nums);
        System.out.println(result);
    }
}
