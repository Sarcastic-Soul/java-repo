public class KthAncestor {
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

    public static int KAncestor(Node root, int n, int k) {
        if (root == null)
            return -1;
        if (root.data == n)
            return 0;

        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        int ancestor = Math.max(leftDist, rightDist);
        if (ancestor + 1 == k)
            System.out.println(root.data);
        return ancestor + 1;
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

        KAncestor(root, 5, 2);
    }
}
