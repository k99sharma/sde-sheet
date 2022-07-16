package RecursionAndBacktracking.PartitionEqualSubsetSum;

// Approach: Recursion
// Time Complexity: O(2^n)
// Space Complexity: O(n)

import java.util.*;
public class Approach1 {
    public static boolean solve(int[] nums, int idx, int target){
        // base case
        if(idx == 0)
            return nums[idx] == target;

        if(target == 0)
            return true;

        boolean notTake = solve(nums, idx-1, target);

        boolean take = false;
        if(nums[idx] <= target)
            take = solve(nums, idx-1, target-nums[idx]);

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

        return solve(nums, n-1, sum) ? "YES" : "NO";
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
