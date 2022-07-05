package Arrays.FindDuplicateNumber;

// Approach: Sorting
// Time Complexity: O(n log(n))
// Space Complexity: O(1)

import java.util.Scanner;
import java.util.Arrays;

public class Approach2{
    public static int findDuplicate(int[] nums){
        // sort the arrays
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1])
                return nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int result = findDuplicate(nums);
        System.out.println(result);
    }
}
