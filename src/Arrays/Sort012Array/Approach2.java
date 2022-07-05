package Arrays.Sort012Array;

// Approach: Counting Sort Approach
// Time Complexity: O(n)
// Space Complexity: O(n) for auxiliary array + O(maximum element+1) i.e O(3) so constant

import java.util.Arrays;
import java.util.Scanner;

public class Approach2{
    public static int[] sortNumbers(int[] nums){
        // since max element present in nums is 2
        int[] freq = new int[3];

        // auxiliary array
        int[] aux = new int[nums.length];

        // find frequency of each element
        for(int x : nums)
            aux[x] += 1;

        // prefix the array
        for(int i=1; i<3; i++)
            freq[i] += freq[i-1];

        // shift elements towards right by 1
        for(int i=1; i<3; i++)
            freq[i] = freq[i-1];
        freq[0] = 0;

        // putting element in correct order
        for (int currentNumber : nums) {
            aux[freq[currentNumber]] = currentNumber;
            freq[currentNumber]++;
        }

        return aux;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        nums = sortNumbers(nums);

        System.out.println(Arrays.toString(nums));
    }
}
