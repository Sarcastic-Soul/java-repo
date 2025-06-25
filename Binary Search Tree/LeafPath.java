import java.util.ArrayList;

public class LeafPath {

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node buildBST(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = buildBST(root.left, val);
        } else {
            root.right = buildBST(root.right, val);
        }
        return root;
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    public static void root2leafPath(Node root, ArrayList<Integer> path) {
        if (root == null)
            return;
            
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        root2leafPath(root.left, path);
        root2leafPath(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }

        ArrayList<Integer> path = new ArrayList<>();
        root2leafPath(root, path);

    }
}