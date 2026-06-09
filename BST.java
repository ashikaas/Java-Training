class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class BST {

    Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.val)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {

        BST tree = new BST();
        Node root = null;

        int[] arr = {34,75,59,15,89,46,2,63,28,96,52,80,10,73};

        for (int x : arr)
            root = tree.insert(root, x);

        System.out.print("Inorder: ");
        tree.inorder(root);

        System.out.print("\nPreorder: ");
        tree.preorder(root);

        System.out.print("\nPostorder: ");
        tree.postorder(root);
    }
}
    