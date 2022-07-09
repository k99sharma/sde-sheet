package Arrays.MoveAllNegativesToOneSide;

// Approach: Bruteforce
// Time Complexity: O(n) for putting negative + O(n) for putting positive numbers
// Space Complexity: O(n) for auxiliary array

import java.util.*;
public class Approach1 {
    public static int[] moveElements(int[] nums){
        int[] aux = new int[nums.length];
        int counter = 0;

        for(int num : nums)
            if(num >= 0) aux[counter++] = num;

        for(int num : nums)
            if(num < 0) aux[counter++] = num;

        return aux;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        nums = moveElements(nums);

        System.out.println(Arrays.toString(nums));
    }
}
