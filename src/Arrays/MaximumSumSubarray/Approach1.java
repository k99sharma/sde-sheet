package Arrays.MaximumSumSubarray;

// Approach: Kadane's Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class Approach1 {
    public static int findMaximumSubarray(int[] nums){
        if(nums.length == 1)
            return nums[0];

        int currSum = 0;
        int sum = Integer.MIN_VALUE;

        for(int num : nums){
            currSum += num;
            sum = Math.max(sum, currSum);

            if(currSum < 0) currSum = 0;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++) nums[i] = in.nextInt();

        int result = findMaximumSubarray(nums);
        System.out.println(result);
    }
}
