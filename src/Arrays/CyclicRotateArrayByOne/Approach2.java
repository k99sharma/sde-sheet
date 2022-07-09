package Arrays.CyclicRotateArrayByOne;

// Approach:
// Time Complexity:
// Space Complexity:

import java.util.*;
public class Approach2 {
    public static void rotate(int[] nums){
        if(nums.length == 1)
            return;

        int[] aux = new int[nums.length];

        for(int i=0; i<nums.length-1; i++){
            aux[i+1] = nums[i];
        }

        aux[0] = nums[nums.length-1];

        // copy into nums;
        for(int i=0; i< nums.length; i++){
            nums[i] = aux[i];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        rotate(nums);

        System.out.println(Arrays.toString(nums));
    }
}
