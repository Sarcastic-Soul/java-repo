/* Find max number of meetings  that can be held in a room if their starting and ending time are given
 * Also print their index numbers
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class nMeetings {
    public static void main(String[] args) {
        int start[] = { 3, 0, 8, 1, 5, 5 };
        int end[] = { 4, 6, 9, 2, 7, 9 };

        java.util.ArrayList<Integer> ans = new ArrayList<>();

        // storing index of array before sorting
        int meetings[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            meetings[i][0] = i;
            meetings[i][1] = start[i];
            meetings[i][2] = end[i];
        }
        // sorting 2D array with comparators
        Arrays.sort(meetings, Comparator.comparingDouble(o -> o[2]));

        ans.add(meetings[0][0]);
        int lastEnd = meetings[0][2];
        for (int i = 1; i < end.length; i++) {
            if (meetings[i][1] >= lastEnd) {
                ans.add(meetings[i][0]);
                lastEnd = meetings[i][2];
            }
        }
        System.out.println("Max meetings: " + ans.size());
        System.out.println(ans);
    }
}