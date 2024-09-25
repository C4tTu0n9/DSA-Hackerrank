package Day13;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TreePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = MyTree.insert(root, sc.nextInt());
        }
        List<String> list = Result.binaryTreePaths(root);
        System.out.println(list);
    }
}
