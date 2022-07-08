package Arrays.ReversePairs;

// Approach: Divide and Conquer
// Time Complexity: O(n log(n))
// Space Complexity: O(n) for sorting algorithm

import java.util.*;

public class Approach2{
    public static int merge(int[] nums, int start, int mid, int end){
        int inversions = 0;

        // copy data into temp arrays
        int[] L = Arrays.copyOfRange(nums, start, mid+1);
        int[] R = Arrays.copyOfRange(nums, mid+1, end+1);


        // counting inversions
        // here we are checking if nums[i] > 2 x nums[j] in nums
        // using two loops
        int j = mid+1;
        for (int i = start; i <= mid; i++) {
            while (j <= end && nums[i] > (2 * (long) nums[j]))
                j++;
            inversions += j - (mid + 1);
        }

        // merge these temp array
        int i=0;
        j=0;
        int counter = start;

        while(i < L.length && j < R.length){
            if(L[i] <= R[j]){
                nums[counter++] = L[i++];
            }else{
                nums[counter++] = R[j++];
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
    public static int reversePairs(int[] nums){
        return mergeSort(nums, 0, nums.length-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int count = reversePairs(nums);
        System.out.println(count);
    }
}
