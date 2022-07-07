package Arrays.MajorityElements;

// Only works if numbers are positive

// Approach: By finding frequency
// Time Complexity: O(n)
// Space Complexity: O(n) for auxiliary space

import java.util.*;

public class Approach1 {
    public static int majorityElement(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int num : nums)
            max = Math.max(max, num);

        int[] freq = new int[max+1];
        for(int num : nums)
            freq[num]++;

        int ans = 0;
        int last = 0;
        for(int i=0; i<freq.length; i++){
            if(last < freq[i]){
                last = freq[i];
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int result = majorityElement(nums);
        System.out.println(result);
    }
}
