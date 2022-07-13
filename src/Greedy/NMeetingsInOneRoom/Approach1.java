package Greedy.NMeetingsInOneRoom;

// Approach: Sorting
// Time Complexity: O(n log(n))
// Space Complexity: O(n) for arraylist

import java.util.*;
public class Approach1 {
    public static class Meeting{
        int start;
        int end;
        int pos;

        Meeting(int start, int end, int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }
    public static int maxMeetings(int n, int[] start, int[] end){
        ArrayList<Meeting> meetings = new ArrayList<>();
        // adding meeting data into meetings
        for(int i=0; i<n; i++)
            meetings.add(new Meeting(start[i], end[i], i+1));


        // sorting based on end time
        Collections.sort(meetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                return o1.end - o2.end;
            }
        });

        int count;

        // adding first meeting
        count = 1;
        int limit = meetings.get(0).end;

        for(int i=1; i<meetings.size(); i++){
            if(limit < meetings.get(i).start){
                count += 1;
                limit = meetings.get(i).end;
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

        int count = maxMeetings(n, start, end);
        System.out.println(count);
    }
}
