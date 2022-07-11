package Hashing.CountNumberOfSubarraysHavingGivenXOR;

// Approach:
// Time Complexity:
// Space Complexity:

import java.util.*;
public class Approach2{
    public static int count(int[] nums, int k){
        int count = 0;

        int[] xorPrefix = new int[nums.length];
        // creating xor prefix
        xorPrefix[0] = nums[0];
        for(int i=1; i<nums.length; i++)
            xorPrefix[i] = xorPrefix[i-1] ^ nums[i];

        // creating a hashmap
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            // find xor of currentPrefix with k
            int temp = k ^ xorPrefix[i];

            // if xor is k
            // then there is another previous prefix with same k
            count += (hmap.containsKey(temp) == false ? 0 : hmap.get(temp));

            if(xorPrefix[i] == k)
                count++;

            if(hmap.containsKey(xorPrefix[i]))
                hmap.put(xorPrefix[i], hmap.get(xorPrefix[i])+1);
            else
                hmap.put(xorPrefix[i], 1);
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

        int result = count(nums, k);
        System.out.println(result);
    }
}
