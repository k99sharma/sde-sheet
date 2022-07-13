package Greedy.ActivitySelectionProblem;

// Approach: Sorting
// Time Complexity: O(n log(n))
// Space Complexity: O(n) for array list

import javax.accessibility.AccessibleIcon;
import java.util.*;
public class Approach1 {
    public static class Activity{
        int start;
        int end;

        Activity(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public static int activitySelection(int n, int[] start, int[] end){
        ArrayList<Activity> activities = new ArrayList<>();
        for(int i=0; i<n; i++)
            activities.add(new Activity(start[i], end[i]));

        // sort activities
        Collections.sort(activities, new Comparator<Activity>(){
            @Override
            public int compare(Activity a, Activity b){
                return a.end - b.end;
            }
        });

        int count = 1;
        int limit = activities.get(0).end;

        for(int i=1; i<activities.size(); i++){
            if(limit < activities.get(i).start){
                count++;
                limit = activities.get(i).end;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] start = new int[n];
        for(int i=0; i<n; i++)
            start[i] = in.nextInt();

        int[] end = new int[n];
        for(int i=0; i<n; i++)
            end[i] = in.nextInt();

        int max = activitySelection(n, start, end);
        System.out.println(max);
    }
}
