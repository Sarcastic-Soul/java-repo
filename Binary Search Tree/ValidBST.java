/*Check whether given tree is Binary tree is BST or not
 * Approach 1 -> Get Inorder path and check if it's sorted
 * Approach 2 -> {
 * Get max val in left subtree; 
 * Get min val in right subtree;
 * Compare each root and update max and min
 * }
 */

public class ValidBST {
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

    // Approach 2
    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null)
            return true;

        if (min != null && root.data <= min.data)
            return false;
        else if (max != null && root.data >= max.data)
            return false;

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);

    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }

        if (isValidBST(root, null, null))
            System.out.println("Valid BST");
        else
            System.out.println("Invalid BST");
    }
}
