package RecursionAndBacktracking.PartitionEqualSubsetSum;

// Approach: Tabulation
// Time Complexity: O(n)
// Space Complexity: O(n) for auxiliary array

import java.util.*;
public class Approach3{
    public static String equalPartition(int n, int[] nums){
        // find sum of all elements
        int sum = 0;
        for(int x : nums)
            sum += x;

        if(sum%2 == 1)
            return "NO";

        sum = sum/2;

        // auxiliary array
        boolean[][] dp = new boolean[n][sum+1];

        // base case
        for(int idx=0; idx<nums.length; idx++)
            dp[idx][0] = true;

        for(int t=0; t<=sum; t++)
            dp[0][t] = t == nums[0];

        for(int idx=1; idx<nums.length; idx++){
            for(int target=1; target<=sum; target++){
                boolean notTake = dp[idx-1][target];
                boolean take = false;
                if(nums[idx] <= target)
                    take = dp[idx-1][target-nums[idx]];

                dp[idx][target] = (take || notTake);
            }
        }

        return dp[nums.length-1][sum] ? "YES" : "NO";
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
