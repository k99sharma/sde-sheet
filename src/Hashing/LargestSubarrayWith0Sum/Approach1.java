package Hashing.LargestSubarrayWith0Sum;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;
public class Approach1 {
    public static int maxLen(int[] nums){
        int longest = 0;

        for(int i=0; i<nums.length; i++){
            int sum = nums[i];

            for(int j=i+1; j<nums.length; j++){
                sum += nums[j];

                if(sum == 0)
                    longest = Math.max(longest, j-i+1);
            }
            System.out.println();
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int result = maxLen(nums);
        System.out.println(result);
    }
}
