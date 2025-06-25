public class Basics {
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

    public static int height(Node root) {
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int count(Node root) {
        if (root == null)
            return 0;

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static int treeSum(Node root) {
        if (root == null)
            return 0;
        int leftSum = treeSum(root.left);
        int rightSum = treeSum(root.right);
        return leftSum + rightSum + root.data;
    }

    /*
     * Diameter of Tree, #Approach 1
     * Time Complexity -> O(n^2)
     * public static int diameter(Node root) {
     * if (root == null)
     * return 0;
     * int leftDiameter = diameter(root.left);
     * int rightDiameter = diameter(root.right);
     * int leftHeight = height(root.left);
     * int rightHeight = height(root.right);
     * 
     * int selfDiameter = leftHeight + rightHeight + 1;
     * return Math.max(Math.max(rightDiameter, leftDiameter), selfDiameter);
     * }
     */

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    // Time Complexity -> O(n)
    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
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

        System.out.println("Height of tree: " + height(root));
        System.out.println("Total number of nodes of tree: " + count(root));
        System.out.println("Total sum of tree: " + treeSum(root));
        System.out.println("Diameter of tree: " + diameter(root).diam);
        
    }
}
