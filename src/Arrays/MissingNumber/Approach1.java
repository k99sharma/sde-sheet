package Arrays.MissingNumber;

// Approach: Using auxiliary array
// Time Complexity: O(n)
// Space Complexity: O(n) for frequency array

import java.util.Scanner;

public class Approach1 {
    public static int findMissing(int[] nums){
        // freq
        int[] freq = new int[nums.length+1];

        for(int num : nums)
            freq[num]++;

        for(int i=0; i<freq.length; i++)
            if(freq[i] == 0) return i;

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int result = findMissing(nums);
        System.out.print(result);
    }
}
