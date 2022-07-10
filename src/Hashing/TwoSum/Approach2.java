package Hashing.TwoSum;

// Approach: Using hashmap
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;
public class Approach2{
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++){
            int difference = target - nums[i];

            if(hmap.containsKey(difference)){
                result[0] = hmap.get(difference);
                result[1] = i;
            }else{
                hmap.put(nums[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int target = in.nextInt();

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
