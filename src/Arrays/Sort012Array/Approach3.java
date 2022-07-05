package Arrays.Sort012Array;

// Approach: Optimization over counting sort approach
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Arrays;
import java.util.Scanner;

public class Approach3{
    public static void sortNumbers(int[] nums){
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for(int num : nums){
            if(num == 0) zeros++;
            if(num == 1) ones++;
            if(num == 2) twos++;
        }

        int index = 0;
        while(zeros > 0){
            nums[index] = 0;
            index++;
            zeros--;
        }

        while(ones > 0){
            nums[index] = 1;
            index++;
            ones--;
        }

        while(twos > 0){
            nums[index] = 2;
            index++;
            twos--;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        sortNumbers(nums);

        System.out.println(Arrays.toString(nums));
    }
}
