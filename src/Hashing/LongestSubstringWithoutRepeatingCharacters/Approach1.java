package Hashing.LongestSubstringWithoutRepeatingCharacters;

// Approach: Bruteforce
// Time Complexity: O(n^3)
// Space Complexity: O(n) for auxiliary array

import java.util.*;
public class Approach1 {
    public static boolean isValid(String str){
        if(str.length() == 1) return true;

        int[] charArray = new int[256];

        for(char ch : str.toCharArray()){
            charArray[ch]++;
        }

        for(int i=0; i<charArray.length; i++)
            if(charArray[i] > 1) return false;

        return true;
    }
    public static int findLongest(String str){
        int max = 0;

        for(int i=0; i<str.length(); i++){
            String temp = "";

            for(int j=i; j<str.length(); j++){
                temp += str.charAt(j);

                if(isValid(temp)){
                    max = Math.max(max, temp.length());
                }else{
                    break;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        int result = findLongest(str);
        System.out.println(result);
    }
}
