class TN {
    int key;
    TN left, right;

    TN(int key) {
        this.key = key;
        left = right = null;
    }
}

public class BinaryTree {

    void PreOrder(TN root) {
        if (root == null)
            return;

        System.out.print(root.key + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    void InOrder(TN root) {
        if (root == null)
            return;

        InOrder(root.left);
        System.out.print(root.key + " ");
        InOrder(root.right);
    }

    void PostOrder(TN root) {
        if (root == null)
            return;

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.key + " ");
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        TN root = new TN(10);
        root.left = new TN(15);
        root.right = new TN(2);
        root.left.left = new TN(3);
        root.left.right = new TN(9);
        root.right.left = new TN(7);
        root.right.right = new TN(4);

        System.out.print("PreOrder: ");
        tree.PreOrder(root);

        System.out.print("\nInOrder: ");
        tree.InOrder(root);

        System.out.print("\nPostOrder: ");
        tree.PostOrder(root);
    }
}