package tree;

public class BinarySearchTree {
    private class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) return new Node(value);

        if (value < root.data)
            root.left = insertRec(root.left, value);
        else
            root.right = insertRec(root.right, value);

        return root;
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}