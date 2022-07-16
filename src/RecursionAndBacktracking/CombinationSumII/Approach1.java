package RecursionAndBacktracking.CombinationSumII;

// Approach:
// Time Complexity:
// Space Complexity:

import java.util.*;
public class Approach1 {
    public static void solve(int[] nums, int idx, int target, List<Integer> current, List<List<Integer>> ans){
        // base case
        if(target == 0){
            ans.add(new LinkedList<> (current));
            return;
        }

        for(int i = idx; i < nums.length;i++) {
            if(i > idx && nums[i] == nums[i-1]) continue;

            if(nums[i] > target) break;

            current.add(nums[i]);
            solve(nums, i+1, target-nums[i], current, ans);
            current.remove(current.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum2(int[] nums, int target){
        List<List<Integer>> ans = new LinkedList<> ();
        List<Integer> current = new LinkedList<> ();

        Arrays.sort(nums);

        solve(nums, 0, target, current, ans);

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int target = in.nextInt();

        List<List<Integer>> result = combinationSum2(nums, target);
        System.out.println(result);
    }
}
