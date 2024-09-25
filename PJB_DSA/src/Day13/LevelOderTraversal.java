package Day13;

import java.util.Scanner;

public class LevelOderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = MyTree.insert(root, sc.nextInt());
        }
        Result.levelOrder(root);
    }
}
