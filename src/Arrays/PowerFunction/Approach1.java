package Arrays.PowerFunction;

// Approach: Bruteforce
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

public class Approach1 {
    public static double pow(double x, int n){
        int p = Math.abs(n);
        double ans = 1;

        for(int i=0; i<p; i++){
            ans *= x;
        }

        if(n > 0)
            return ans;

        return 1/ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int n = in.nextInt();

        double ans = pow(x,n);
        System.out.println(ans);
    }
}
