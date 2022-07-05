package Arrays.FindDuplicateNumber;

// Approach: Negative Marking
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

public class Approach4{
    public static int findDuplicate(int[] nums){
        int duplicate = -1;

        for(int i=0; i<nums.length; i++){
            int curr = Math.abs(nums[i]);
            if(nums[curr] < 0){
                duplicate = curr;
                break;
            }

            nums[curr] *= -1;
        }

        // restore numbers
        for(int i=0; i<nums.length; i++)
            nums[i] = Math.abs(nums[i]);

        return duplicate;
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
