package Arrays.CyclicRotateArrayByOne;

// Approach: Shifting array elements by 1
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;

public class Approach1 {
    public static void rotate(int[] nums){
        int lastElement = nums[nums.length-1];

        // shift elements by 1
        for(int i=nums.length-1; i>0; i--){
            nums[i] = nums[i-1];
        }

        nums[0] = lastElement;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = in.nextInt();
        }

        rotate(nums);

        System.out.println(Arrays.toString(nums));
    }
}
