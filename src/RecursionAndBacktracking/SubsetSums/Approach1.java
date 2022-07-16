package RecursionAndBacktracking.SubsetSums;

// Approach: Recursion
// Time Complexity: O(2^n)
// Space Complexity: O(2^n)

import java.util.*;
public class Approach1 {
    public static void solve(int[] nums, int idx, int curr, ArrayList<Integer> result){
        // base case
        if(idx == nums.length){
            result.add(curr);
            return;
        }

        solve(nums, idx+1, curr, result);
        solve(nums, idx+1, curr + nums[idx], result);
    }
    public static ArrayList<Integer> printSubsetSums(int[] nums, int n){
        ArrayList<Integer> result = new ArrayList<>();

        solve(nums,0,0, result);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        ArrayList<Integer> result = printSubsetSums(nums, nums.length);
        System.out.println(result);
    }
}
