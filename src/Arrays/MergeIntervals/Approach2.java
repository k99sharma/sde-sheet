package Arrays.MergeIntervals;

// Approach: Using Stack
// Time Complexity: O(n log(n)) for sorting
// Space Complexity: O(n) for stack

import java.util.*;

public class Approach2 {
    public static int[][] merge(int[][] intervals){
        // sort the array
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> list = new ArrayList<>();
        Stack<Integer> st = new Stack<> ();

        for(int[] interval : intervals){
            // if stack is empty
            if(st.isEmpty()){
                st.push(interval[0]);
                st.push(interval[1]);
            }else{
                // if both current elements are smaller than previous
                if(interval[0] < st.peek() && interval[1] < st.peek())
                    continue;

                // if current interval first element is greater than top element
                if(interval[0] > st.peek()){
                    int second = st.pop();
                    int first = st.pop();
                    list.add(new int[] {first, second});

                    st.push(interval[0]);
                    st.push(interval[1]);
                }else{
                    st.pop();
                    st.push(interval[1]);
                }
            }
        }

        // add last interval left in stack
        int leftSecond = st.pop();
        int leftFirst = st.pop();
        list.add(new int[] {leftFirst, leftSecond});

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] intervals = new int[n][2];
        for(int i=0; i<n; i++){
            intervals[i][0] = in.nextInt();
            intervals[i][1] = in.nextInt();
        }

        int[][] result = merge(intervals);
        for(int[] x : result)
            System.out.print(Arrays.toString(x) + " ");
    }
}
