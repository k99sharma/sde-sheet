package Arrays.MergeIntervals;

// Approach: Sorting
// Time Complexity: O(n log(n))
// Space Complexity: O(log (n)) because sorting takes additional space

import java.util.*;

public class Approach1 {
    public static int[][] merge(int[][] intervals){
        // sort intervals based on first elements
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        ArrayList<int[]> list = new ArrayList<> ();
        for(int[] interval : intervals){
            // if list is empty
            // and current interval does not overlap with previous appended interval
            if(list.isEmpty() || list.get(list.size()-1)[1] < interval[0]){
                list.add(interval);
            }else{
                list.get(list.size()-1)[1] = Math.max(list.get(list.size()-1)[1], interval[1]);
            }
        }

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
