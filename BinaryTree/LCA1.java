/* 
Lowest Common Ancestor 
 Approach 1
 Time Complexity -> O(n)
 Space Complexity -> O(n)
 */

import java.util.ArrayList;

public class LCA1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getPath(Node root, int n, ArrayList<Integer> path) {
        if (root == null)
            return false;

        path.add(root.data);
        if (root.data == n)
            return true;

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if (foundLeft || foundRight)
            return true;

        path.remove(path.size() - 1);
        return false;
    }

    public static void lca(Node root, int n1, int n2) {
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for (; i < Math.min(path1.size(), path2.size()); i++) {
            if (path1.get(i) != path2.get(i))
                break;
        }

        System.out.println(path1.get(i - 1));

    }

    public static void main(String[] args) {
        /*
         * 1
         * 2 3
         * 4 5 6 7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        lca(root, 4, 7);
    }
}
