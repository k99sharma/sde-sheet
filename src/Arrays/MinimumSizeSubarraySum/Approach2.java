package Arrays.MinimumSizeSubarraySum;

// Approach: Using two pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
public class Approach2{
    public static int miSubArrayLen(int[] nums, int target){
        int j = 0;
        int minimum = Integer.MAX_VALUE;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];

            // keeping sum less than target and keeping minimum length
            while(sum >= target){
                minimum = Math.min(minimum, i-j+1);
                sum = sum - nums[j];
                j++;
            }
        }

        return minimum != Integer.MAX_VALUE ? minimum : 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();
        int target = in.nextInt();

        int result = miSubArrayLen(nums, target);
        System.out.println(result);
    }
}
