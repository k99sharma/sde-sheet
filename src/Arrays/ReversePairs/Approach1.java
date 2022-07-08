package Arrays.ReversePairs;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;

public class Approach1 {
    public static int reversePairs(int[] nums){
        int count = 0;

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > 2*nums[j]) count++;
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

        int count = reversePairs(nums);
        System.out.println(count);
    }
}
