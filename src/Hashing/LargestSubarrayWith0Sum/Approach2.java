package Hashing.LargestSubarrayWith0Sum;

// Approach: Using hashmap
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;
public class Approach2 {
    public static int maxLen(int[] nums){
        HashMap<Integer, Integer> hmap = new HashMap<>();

        int longest = 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            // adding num to current sum
            sum += nums[i];

            // if longest is still 0 and num is 0
            if (nums[i] == 0 && longest == 0)
                longest = 1;

            // if sum gets 0
            if (sum == 0)
                longest = i + 1;

            // checking if hash map contains sum
            if(hmap.containsKey(sum)){
                longest = Math.max(longest, i-hmap.get(sum));
            }else{
                hmap.put(sum, i);
            }
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
