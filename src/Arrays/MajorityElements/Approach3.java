package Arrays.MajorityElements;

// Approach: Sorting
// Time Complexity: O(n (log(n))
// Space Complexity: O(1)

import java.util.*;

public class Approach3{
    public static int majorityElement(int[] nums){
        // sort array
        Arrays.sort(nums);

        if(nums.length%2 == 1)
            return nums[nums.length/2];

        return nums[(nums.length/2) - 1];
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
