package Arrays.CountPairWithGivenSum;

// Approach: Using Hashmap
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;
public class Approach2{
    public static int count(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;
        for (int num : arr) {
            int diff = k - num;

            if (map.containsKey(diff)) {
                count += map.get(diff);
            }
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = in.nextInt();

        int k = in.nextInt();

        int numberOfPairs = count(nums, k);
        System.out.println(numberOfPairs);
    }
}
