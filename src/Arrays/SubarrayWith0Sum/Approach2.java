package Arrays.SubarrayWith0Sum;

// Approach: Using Hashmap
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;
public class Approach2{
    public static boolean findSum(int[] nums){
        HashMap<Integer, Integer> hmap = new HashMap<>();

        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)
                return true;

            sum += nums[i];

            if(sum == 0)
                return true;

            if(hmap.containsKey(sum)){
                return true;
            }else{
                hmap.put(sum, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        boolean isPresent = findSum(nums);
        System.out.println(isPresent ? "Yes" : "No");
    }
}
