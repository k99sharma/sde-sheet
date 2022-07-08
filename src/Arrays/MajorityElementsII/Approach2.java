package Arrays.MajorityElementsII;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;

public class Approach2{
    public static List<Integer> majorityElement(int[] nums){
        List<Integer> result = new LinkedList<>();

        if(nums.length == 1){
            result.add(nums[0]);
            return result;
        }

        if(nums.length == 2){
            if(nums[0] == nums[1]){
                result.add(nums[0]);
            }else{
                result.add(nums[0]);
                result.add(nums[1]);
            }

            return result;
        }

        int limit = nums.length/3;

        for(int i=0; i<nums.length; i++){
            int count = 1;

            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]) count++;

                if(count > limit)
                    result.add(nums[i]);
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

        List<Integer> result = majorityElement(nums);
        System.out.println(result);
    }
}
