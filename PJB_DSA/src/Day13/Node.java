package Day13;

public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class MyTree{
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    public static void preOder(Node root) {
        if(root == null) {
            return;
        }
        preOder(root.left);
        preOder(root.right);
        System.out.print(root.data + " ");
    }
}