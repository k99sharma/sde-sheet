package Arrays.FindDuplicateNumber;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.Scanner;

public class Approach1 {
    public static int findDuplicate(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            int curr = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(curr == nums[j])
                    return curr;
            }
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
