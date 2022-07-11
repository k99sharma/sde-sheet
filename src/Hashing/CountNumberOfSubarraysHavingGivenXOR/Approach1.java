package Hashing.CountNumberOfSubarraysHavingGivenXOR;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;
public class Approach1 {
    public static int count(int[] nums, int k){
        int count = 0;

        for(int i=0; i<nums.length; i++){
            int xor = nums[i];
            if(xor == k)
                count++;

            for(int j=i+1; j<nums.length; j++){
                xor = xor ^ nums[j];

                if(xor == k)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int k = in.nextInt();

        int result = count(nums, k);
        System.out.println(result);
    }
}
