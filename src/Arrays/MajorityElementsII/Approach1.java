package Arrays.MajorityElementsII;

// Approach: Using extra space
// Time Complexity: O(n)
// Space Complexity: O(n) for auxiliary space

import java.util.*;

public class Approach1 {
    public static List<Integer> majorityElement(int[] nums){
        Integer limit = nums.length/3;

        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int num : nums){
            if(hmap.containsKey(num))
                hmap.put(num, hmap.get(num) + 1);
            else
                hmap.put(num, 1);
        }

        List<Integer> result = new LinkedList<>();
        for(Map.Entry<Integer, Integer> map : hmap.entrySet()){
            if(map.getValue()>limit)
                result.add(map.getKey());
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
