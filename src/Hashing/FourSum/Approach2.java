package Hashing.FourSum;

// Approach: Using 2 Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
public class Approach2{
    public static List<List<Integer>> findSum(int[] nums, int target){
        List<List<Integer>> result = new LinkedList<>();

        // sort the array
        Arrays.sort(nums);

        for(int i=0; i<nums.length-3; i++){
            // taking care of repeating values
            if(i == 0 || i>0 && nums[i-1] != nums[i]){
                int sum = target - nums[i];

                for(int j=i+1; j<nums.length-2; j++){
                    int diff = sum - nums[j];
                    int low = j+1;
                    int high = nums.length-1;

                    while(low < high){
                        if(nums[low]+nums[high] == diff){
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[low]);
                            list.add(nums[high]);

                            result.add(list);

                            high--;
                            low++;

                            // taking care of repeating values
                            while(low < nums.length-1 && nums[low] == nums[low+1]) low++;
                            while(high > j+1 && nums[high] == nums[high-1]) high--;
                        }
                        else if(nums[low]+nums[high] < diff)
                            low++;
                        else
                            high--;
                    }
                }
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

        List<List<Integer>> result = findSum(nums, target);
        System.out.println(result);
    }
}
