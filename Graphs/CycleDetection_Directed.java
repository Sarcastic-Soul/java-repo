import java.util.ArrayList;

public class CycleDetection_Directed {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    /* Graph-1 -> True */
    // static void createGraph(ArrayList<Edge> graph[]) {
    //     for (int i = 0; i < graph.length; i++) {
    //         graph[i] = new ArrayList<>();
    //     }

    //     graph[0].add(new Edge(0, 2, 1));

    //     graph[1].add(new Edge(1, 0, 1));

    //     graph[2].add(new Edge(2, 3, 1));

    //     graph[3].add(new Edge(3, 0, 1));
    // }

    /* Graph-2 -> False */
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 3, 1));
    }

    // Disjoint graph
    public static boolean isCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack))
                    return true;
            }
        }
        return false;
    }

    // Actual cycle detection Code
    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) // cycle detected
                return true;
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph) ? "Cycle exist" : "No cycle exist");
    }
}
