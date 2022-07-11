package Hashing.FourSum;

// Approach: Bruteforce
// Time Complexity: O(n^4) for traversing + O(n (log(n)) for sorting
// Space Complexity: O(1)

import java.util.*;
public class Approach1 {
    public static List<List<Integer>> findSum(int[] nums, int target){
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2; j++){
                for(int k=j+1; k<nums.length-1; k++){
                    for(int l=k+1; l<nums.length; l++){
                        if((nums[i]+nums[j]+nums[k]+nums[l]) == target){
                            List<Integer> temp = new LinkedList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);

                            if(!result.contains(temp))
                                result.add(temp);
                        }
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
