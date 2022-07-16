package RecursionAndBacktracking.CombinationSum;

// Approach: Recursion
// Time Complexity: O(2^n)
// Space Complexity: O(n) for recursive stack

import java.util.*;
public class Approach1 {
    public static void solve(int[] candidates, int idx, int target, List<List<Integer>> ans, List<Integer> current){
        // base case
        if(idx < 0 || target < 0)
            return;

        if(target == 0){
            ans.add(new LinkedList<>(current));
            return;
        }

        current.add(candidates[idx]);
        solve(candidates, idx, target - candidates[idx], ans, current);

        current.remove(current.size()-1);
        solve(candidates, idx-1, target, ans, current);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> ans = new LinkedList<> ();
        List<Integer> current = new LinkedList<>();

        solve(candidates, candidates.length-1, target, ans, current);

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int target = in.nextInt();

        List<List<Integer>> result = combinationSum(nums, target);
        System.out.println(result);
    }
}
