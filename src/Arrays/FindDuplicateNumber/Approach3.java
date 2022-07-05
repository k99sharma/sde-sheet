package Arrays.FindDuplicateNumber;

// Approach: Using HashSet
// Time Complexity: O(n)
// Space Complexity: O(n) for set

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Approach3{
    public static int findDuplicate(int[] nums){
        Set<Integer> seen = new HashSet<> ();
        for(int num : nums){
            if(seen.contains(num)) return num;

            seen.add(num);
        }

        return -1;
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
