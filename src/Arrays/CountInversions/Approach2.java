package Arrays.CountInversions;

// Approach: Using merge sort approach
// Time Complexity: O(n log(n))
// Space Complexity: O(n) for sorting algorithm

import java.util.*;

public class Approach2 {
    public static int merge(int[] nums, int start, int mid, int end){
        int inversions = 0;

        // copy data into temp arrays
        int[] L = Arrays.copyOfRange(nums, start, mid+1);
        int[] R = Arrays.copyOfRange(nums, mid+1, end+1);

        // merge these temp array
        int i=0, j=0;
        int counter = start;

        while(i < L.length && j < R.length){
            if(L[i] <= R[j]){
                nums[counter++] = L[i++];
            }else{
                nums[counter++] = R[j++];
                inversions += (mid+1) - (start + i); // counting inversions
            }
        }

        // copy remaining elements
        while(i < L.length){
            nums[counter++] = L[i++];
        }

        while(j < R.length){
            nums[counter++] = R[j++];
        }

        return inversions;
    }
    public static int mergeSort(int[] nums, int start, int end){
        int count = 0;

        if(start < end){
            int mid = start + (end-start)/2;

            count += mergeSort(nums, start, mid);

            count += mergeSort(nums, mid+1, end);

            count += merge(nums, start, mid, end);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int count = mergeSort(nums, 0, n-1);
        System.out.println(count);
    }
}
