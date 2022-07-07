package Arrays.PascalTriangle;

// Approach: Bruteforce
// Time Complexity: O(n^2)
// Space Complexity: O(1)

import java.util.*;

public class Approach1 {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new LinkedList<> ();

        // adding 1 to row=0
        result.add(Arrays.asList(1));

        if(numRows == 1)
            return result;

        for(int row=2; row<=numRows; row++){
            List<Integer> list = new LinkedList<> ();

            // 0 -> i
            for(int col=0; col<row; col++){
                if(col == 0 || col == row-1){
                    list.add(1);
                }
                else{
                    List<Integer> last = result.get(result.size()-1);
                    list.add(last.get(col-1) + last.get(col));
                }
            }

            result.add(list);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<List<Integer>> result = generate(n);
        for(int row=0; row<result.size(); row++){
            for(int col=0; col<result.get(row).size(); col++){
                System.out.print(result.get(row).get(col) + " ");
            }
            System.out.println();
        }
    }
}
