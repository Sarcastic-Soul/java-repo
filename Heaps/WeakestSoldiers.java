
/* Find k weakest soldier rows
 * Strength level of rows:
 * 1. Number of soldiers in a row
 * 2. If number of soldiers are same row idx number tells row strength
 */
import java.util.PriorityQueue;

public class WeakestSoldiers {
    static class Row implements Comparable<Row> {
        int soldiers;
        int idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2) {
            if (this.soldiers == r2.soldiers) {
                return this.idx - r2.idx;
            } else {
                return this.soldiers - r2.soldiers;
            }
        }
    }

    public static void main(String[] args) {
        int army[][] = { { 1, 0, 0, 0 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 0 } };

        int k = 2;

        PriorityQueue<Row> pq = new PriorityQueue<>();

        for (int i = 0; i < army.length; i++) {
            int count = 0;
            for (int j = 0; j < army[0].length; j++) {
                count += army[i][j];
            }
            pq.add(new Row(count, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }
    }
}
