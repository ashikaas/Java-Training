import java.util.Queue;
import java.util.LinkedList;

class TN {
    int key;
    TN left, right;

    TN(int key) {
        this.key = key;
        left = right = null;
    }
}

public class TreeBFS {

    void BFS(TN root) {
        if (root == null)
            return;

        Queue<TN> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            TN curr = q.peek(); 
            q.remove();         

            System.out.print(curr.key + " ");

            if (curr.left != null)
                q.add(curr.left);

            if (curr.right != null)
                q.add(curr.right);
        }
    }

    public static void main(String[] args) {

        TN root = new TN(10);
        root.left = new TN(15);
        root.right = new TN(2);
        root.left.left = new TN(3);
        root.left.right = new TN(9);
        root.right.left = new TN(7);
        root.right.right = new TN(4);

        TreeBFS tree = new TreeBFS();
        tree.BFS(root);
    }
}
