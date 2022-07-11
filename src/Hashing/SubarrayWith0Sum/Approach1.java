package Hashing.SubarrayWith0Sum;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;
public class Approach1 {
    public static boolean findSum(int[] nums){
        for(int i=0; i<nums.length; i++){
            int sum = nums[i];

            if(sum == 0)
                return true;

            for(int j=i+1; j<nums.length; j++){
                sum += nums[j];

                if(sum == 0) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        boolean isPresent = findSum(nums);
        System.out.println(isPresent ? "Yes" : "No");
    }
}
