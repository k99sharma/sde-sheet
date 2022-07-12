package Arrays.MaximumProductSubarray;

// Approach:
// Time Complexity:
// Space Complexity:

import java.util.*;
public class Approach1 {
    public static int maxProduct(int[] nums){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            int current = nums[i];

            if(current > max)
                max = current;

            for(int j=i+1; j<nums.length; j++){
                current *= nums[j];

                max = Math.max(max, current);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int result = maxProduct(nums);
        System.out.println(result);
    }
}
