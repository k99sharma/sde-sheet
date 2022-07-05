package Arrays.MissingNumber;

import java.util.Scanner;

// Approach: Mathematical
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Approach2 {
    public static int findMissing(int[] nums){
        int n = nums.length+1;
        int expectedSum = (n*(n+1))/2;
        int sum = 0;
        for(int num : nums)
            sum += num;
        return expectedSum - sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int result = findMissing(nums);
        System.out.println(result);
    }
}
