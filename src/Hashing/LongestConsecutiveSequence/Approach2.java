package Hashing.LongestConsecutiveSequence;

// Approach: Sorting
// Time Complexity: O(n log(n))
// Space Complexity: O(1) or O(n) based on sorting algorithm

import java.util.*;
public class Approach2{
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        // sort the array
        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){ // takes care of duplicates
                if(nums[i] == nums[i-1]+1){
                    currentStreak += 1;
                }else{
                    longestStreak = Math.max(longestStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }

        int result = longestConsecutive(nums);
        System.out.println(result);
    }
}
