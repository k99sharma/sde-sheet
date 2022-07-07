package Arrays.PowerFunction;

// Approach: Using Iterative Approach
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

public class Approach3{
    public static double pow(double x, int n){
        int p = Math.abs(n);

        double ans = 1.0;

        while(p > 0){
            if(p%2 == 0){
                x *= x;
                p = p/2;
            }else{
                ans *= x;
                p--;
            }
        }

        if(n < 0)
            return 1.0/ans;

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int n = in.nextInt();

        double ans = pow(x,n);
        System.out.println(ans);
    }
}
