package Arrays.MajorityElementsII;

// Approach: Extension of Boyre-Moore Voting Algorithm
// Time Complexity: O(n) for finding elements + O(n) to check if elements appear n/3
// Space Complexity: O(1)

import java.util.*;

public class Approach3{
    public static List<Integer> majorityElement(int[] nums){
        int number1 = Integer.MIN_VALUE, number2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;

        for(int num : nums){
            if(num == number1) count1++;

            else if(num == number2) count2++;

            else if(count1 == 0){
                number1 = num;
                count1 = 1;
            }

            else if(count2 == 0){
                number2 = num;
                count2 = 1;
            }

            else{
                count1--;
                count2--;
            }
        }

        List<Integer> result = new LinkedList<>();
        count1 = 0;
        count2 = 0;

        for(int num : nums){
            if(number1 == num) count1++;
            if(number2 == num) count2++;
        }

        int n = nums.length;
        if(count1 > n/3) result.add(number1);

        if(count2 > n/3) result.add(number2);

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
