/*Inorder Traversal in BST always gives ascending order array
 * Search Time Complexity:
 * Binary Tree -> O(n)
 * Binary Search Tree -> O(h)  ('h' is height of tree; h=log(n))
 */

public class BST {
    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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

    public static boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key)
            return true;
        if (root.data > key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // Single Child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Double Child
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null)
            return;
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.left, k1, k2);
        } else {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if (search(root, 5))
            System.out.println("Found"); 
        else
            System.out.println("Not Found");

        delete(root, 3);
        inorder(root);
        System.out.println();

        printInRange(root, 5, 12);
    }
}