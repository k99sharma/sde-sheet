package Arrays.Sort012Array;

// Approach: Sorting Algorithm (Built-in)

/*
    It uses Dual-Pivot Quick Sorting algorithm
    This algorithm offers O(n log(n)) performance on many data sets that cause other quicksort to degrade to quadratic performance, and is typically faster than traditional (one-pivot) Quicksort implementations.
*/

// Time Complexity: O(n log(n)) where n is size of array
// Space Complexity: O(1)

import java.util.Arrays;
import java.util.Scanner;

public class Approach1 {
    public static void sortNumbers(int[] nums){
        // Using built-in function
        Arrays.sort(nums);
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
