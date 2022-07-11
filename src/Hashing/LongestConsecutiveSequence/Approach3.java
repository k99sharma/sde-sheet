package Hashing.LongestConsecutiveSequence;

// Approach: Using HashSet
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;
public class Approach3{
    public static int longestConsecutive(int[] nums) {
        // make a hashset and put all elements in it
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);

        int longestStreak = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;

                while(set.contains(currentNum+1)){
                    currentStreak += 1;
                    currentNum += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
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
