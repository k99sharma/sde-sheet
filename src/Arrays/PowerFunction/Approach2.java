package Arrays.PowerFunction;

// Approach: Using recursion
// Time Complexity: O(n)
// Space Complexity: O(n) for recursive stack

import java.util.Scanner;

public class Approach2{
    public static double findPower(double x, int n){
        // base case
        if(n == 0)
            return 1.0;

        if(n%2 == 0)
            return findPower(x*x,n/2);

        return x * findPower(x*x, n/2);
    }
    public static double pow(double x, int n){
        if(n < 0)
            return 1.0/findPower(x,Math.abs(n));

        return findPower(x, n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int n = in.nextInt();

        double ans = pow(x,n);
        System.out.println(ans);
    }
}
