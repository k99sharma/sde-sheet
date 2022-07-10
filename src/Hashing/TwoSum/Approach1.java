package Hashing.TwoSum;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;
public class Approach1 {
    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int target = in.nextInt();

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
