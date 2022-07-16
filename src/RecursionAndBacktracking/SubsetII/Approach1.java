package RecursionAndBacktracking.SubsetII;

// Approach: Recursion
// Time Complexity: O(2^n)
// Space Complexity: O(n) for recursive stack

import java.util.*;
public class Approach1 {
    public static void solve(int[] nums, int idx, List<Integer> curr, HashSet<List<Integer>> result){
        // base case
        if(idx >= nums.length){
            result.add(new LinkedList<>(curr));
            return;
        }

        // take element at current index
        curr.add(nums[idx]);
        solve(nums, idx+1, curr, result);

        // do not take element at current index
        curr.remove(curr.size()-1);
        solve(nums, idx+1, curr, result);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums){
        HashSet<List<Integer>> result = new HashSet<>();
        List<Integer> curr = new LinkedList<>();

        Arrays.sort(nums);

        solve(nums, 0, curr, result);

        return new LinkedList<>(result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums  = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        List<List<Integer>> result = subsetsWithDup(nums);
        System.out.println(result);
    }
}
