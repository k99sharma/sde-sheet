package Hashing.LongestSubstringWithoutRepeatingCharacters;

// Approach: Using hashmap
// Time Complexity: O(n)
// Space Complexity: O(n) for auxiliary array

import java.util.*;
public class Approach2 {
    public static int findLongest(String s){
        if(s.length() == 1)
            return 1;

        int longestStreak = 0;
        int i=0;
        int j=0;

        int[] charArray = new int[256];

        while(i < s.length() && j < s.length()){
            char ch = s.charAt(j);

            // character not encountered yet
            if(charArray[ch] == 0){
                longestStreak = Math.max(longestStreak, j-i+1);
                charArray[ch]++;
                j += 1;
            }else{
                charArray[s.charAt(i)]--;
                i += 1;
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        int result = findLongest(str);
        System.out.println(result);
    }
}
