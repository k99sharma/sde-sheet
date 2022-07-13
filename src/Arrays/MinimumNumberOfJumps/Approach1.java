package Arrays.MinimumNumberOfJumps;

// Approach: Greedy
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
public class Approach1 {
    public static int minJumps(int[] nums){
        int pos = 0;
        int jump = 0;
        int destination = 0;
        for (int i = 0; i < nums.length-1; i++)
        {
            destination = Math.max(destination, nums[i] + i);
            if (pos == i)
            {
                jump++;
                if(destination<=i)
                {
                    return -1;
                }
                pos = destination;
            }
        }
        return jump;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int result = minJumps(nums);
        System.out.println(result);
    }
}
