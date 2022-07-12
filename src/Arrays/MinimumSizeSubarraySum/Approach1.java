package Arrays.MinimumSizeSubarraySum;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;
public class Approach1 {
    public static int miSubArrayLen(int[] nums, int target){
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            int currentSum = 0;

            for(int j=i; j<nums.length; j++){
                currentSum += nums[j];

                if(currentSum >= target){
                    smallest = Math.min(smallest, j-i+1);
                }
            }

            currentSum = 0;
        }

        return smallest != Integer.MAX_VALUE ? smallest : 0;
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
