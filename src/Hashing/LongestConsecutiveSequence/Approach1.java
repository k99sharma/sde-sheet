package Hashing.LongestConsecutiveSequence;

// Approach: Bruteforce
// Time Complexity: O(n^3)
// Space Complexity: O(1)

import java.util.*;
public class Approach1{
    private static boolean arrayContains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }

        return false;
    }

    public static int longestConsecutive(int[] nums) {
        int longestStreak = 0;

        for (int num : nums) {
            int currentNum = num;
            int currentStreak = 1;

            while (arrayContains(nums, currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
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
