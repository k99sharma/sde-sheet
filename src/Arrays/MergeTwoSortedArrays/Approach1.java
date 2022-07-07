package Arrays.MergeTwoSortedArrays;

// Approach: Outplace merging
// Time Complexity: O(n + m)
// Space Complexity: O(n + m) for auxiliary array

import java.util.*;

public class Approach1 {
    public static int[] merge(int[] nums1, int[] nums2){
        int[] merged = new int[nums1.length + nums2.length];
        int counter = 0;

        int p = 0;
        int q = 0;

        while(p < nums1.length && q < nums2.length){
            if(nums1[p] < nums2[q]){
                merged[counter++] = nums1[p++];
            }else{
                merged[counter++] = nums2[q++];
            }
        }

        // left out elements
        while(p < nums1.length)
            merged[counter++] = nums1[p++];

        while(q < nums2.length)
            merged[counter++] = nums2[q++];

        return merged;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums1 = new int[n];
        for(int i=0; i<n; i++)
            nums1[i] = in.nextInt();

        int m = in.nextInt();
        int[] nums2 = new int[m];
        for(int i=0; i<m; i++)
            nums2[i] = in.nextInt();

        int[] result = merge(nums1, nums2);
        for(int i=0; i<result.length; i++)
            System.out.print(result[i] + " ");
    }
}
