package Arrays.FindDuplicateNumber;

// Approach: Binary Search
// Time Complexity: O(n log(n)) ===> O(n log(n)) for sorting + O(n log(n)) in searching as O(log(n)) for binary search and O(n) for sequential search
// Space Complexity: O(1)

import java.util.*;

public class Approach5{
    public static int findDuplicate(int[] nums){
        Arrays.sort(nums); // sort the array

        int low = 1;
        int high = nums.length-1;
        int duplicate = -1;

        while(low <= high){
            int curr = (low+high)/2;
            int count = 0;
            for(int num : nums)
                if(num <= curr) count++;

            if(count > curr){
                duplicate = curr;
                high = curr - 1;
            }else {
                low = curr + 1;
            }
        }

        return duplicate;
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
