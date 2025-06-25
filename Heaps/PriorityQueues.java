import java.util.PriorityQueue;
// Note: PriorityQueue are implemented using Binary Tree internally

/* CBT (Complete Binary Tree)
 * A Binary Tree in which all the levels are completely filled except possibly the last one;
 * Filled from left -> right 
 */

public class PriorityQueues {
    // Add Interface to compare objects of Student class
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        // Override compareTo function from Comparable Interface
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));
        pq.add(new Student("E", 8));

        while (pq.size() > 0) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }

    }
}
