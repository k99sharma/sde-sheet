package Arrays.MajorityElements;

// Approach: Boyer-Moore Voting Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class Approach4{
    public static int majorityElement(int[] nums){
        int count = 0;
        int ans = 0;

        for(int num : nums){
            if(count == 0)
                ans = num;

            count += (ans == num) ? 1 : -1;
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
