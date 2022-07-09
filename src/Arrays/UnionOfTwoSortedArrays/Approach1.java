package Arrays.UnionOfTwoSortedArrays;

// Approach: Using HashMap
// Time Complexity: O(n)
// Space Complexity: O(n) for hashmap

import java.util.*;
public class Approach1 {
    public static int doUnion(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int num : nums1){
            if(!hmap.containsKey(num))
                hmap.put(num, 1);
        }

        for(int num : nums2){
            if(!hmap.containsKey(num))
                hmap.put(num, 1);
        }

        return hmap.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] nums1 = new int[n];
        for(int i=0; i<n; i++)
            nums1[i] = in.nextInt();

        int[] nums2 = new int[m];
        for(int i=0; i<m; i++)
            nums2[i] = in.nextInt();

        int count = doUnion(nums1, nums2);

        System.out.println(count);
    }
}
