package Greedy.MinimumPlatforms;

// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.*;
public class Approach1 {
    public static int findPlatform(int n, int[] arr, int[] dept){
        Arrays.sort(arr);
        Arrays.sort(dept);

        int a = 0;
        int b = 0;
        int count = 0;

        while(a < n){
            if(arr[a] <= dept[b]){
                count++;
                a++;
            }else{
                b++;
                count--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = in.nextInt();

        int[] dept = new int[n];
        for(int i=0; i<n; i++)
            dept[i] = in.nextInt();

        int result = findPlatform(n, arr, dept);
        System.out.println(result);
    }
}
