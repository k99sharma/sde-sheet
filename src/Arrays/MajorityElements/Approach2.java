package Arrays.MajorityElements;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;

public class Approach2{
    public static int majorityElement(int[] nums){
        int majorityCount = nums.length/2;
        int ans = 0;

        for(int num : nums){
            int count = 0;

            for(int x : nums){
                if(x == num) count++;
            }

            if(count > majorityCount) ans = num;
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
