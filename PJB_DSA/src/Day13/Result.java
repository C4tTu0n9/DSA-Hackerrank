package Day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Result {

    public static int height(Node root) {
        // Write your code here.
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        int a = height(root.left) + 1;
        int b = height(root.right) + 1;
        return Math.max(a, b);
    }

    public static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
//            Node cur = q.peek();
//            System.out.print(cur.data + " ");
//            q.remove();
            Node cur = q.poll(); // poll is peek and remove
            System.out.print(cur.data + " ");
            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
    }

    public static Node lca(Node root, int v1, int v2) {
      	// Write your code here.
            while(root!=null)
        {
            if((root.data>v1 && root.data<v2)||(root.data>v2 && root.data<v1)||
            root.data==v1 || root.data==v2 )
            {
                return root;
            }else if(root.data>v1)
            {
                return lca(root.left, v1, v2);
            }else{
                return lca(root.right, v1, v2);
            }
        }
        return root;  
    }

    //    public static List<String> binaryTreePaths(Node root) {
////        List<String> paths = new LinkedList<>();
////        if (root == null) return paths;
////        Queue<Node> q = new LinkedList<>();
////        q.add(root);
////        while (!q.isEmpty()) {
////            Node cur = q.poll();
////            if (cur.left != null) q.add(cur.left);
////            if (cur.right != null) q.add(cur.right);
////            paths.add(cur.data + "");
////        }
////        return paths;
//////        List<String> paths = new LinkedList<>();
//////        if (root == null) return paths;
//////        if (root.left == null && root.right == null) {
//////            paths.add(String.valueOf(root.data));
//////        } else if (root.left != null) {
//////            paths.add(String.valueOf(root.left.data));
//////            binaryTreePaths(root.left);
//////        }
//////        if (root.right != null) {
//////            paths.add(String.valueOf(root.right.data));
//////            binaryTreePaths(root.right);
//////        }
//////        return paths;
//    }
    static void traverse(Node root, List<String> a1, String s) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            a1.add(s + root.data);
            return;
        }
        traverse(root.left, a1, s + root.data + "->");
        traverse(root.right, a1, s + root.data + "->");
    }

    public static List<String> binaryTreePaths(Node root) {
        List<String> a1 = new ArrayList<>();
        traverse(root, a1, "");
        return a1;
    }

    Node first,mid,last,prev;
    public void inorder(Node root)
    {
        if(root==null)
            return ;
        inorder(root.left);
        if(prev!=null&&root.data<prev.data)
        {
            if(first==null)
            {
                first=prev;
                mid=root;
            }
            else
                last=root;
        }
        prev=root;
        inorder(root.right);
    }
    public void recoverTree(Node root) {
        first=last=mid=null;
        prev=new Node(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null&&last!=null)
        {
            first.data=first.data^last.data;
            last.data=first.data^last.data;
            first.data=first.data^last.data;
        }
        else if(first!=null&&mid!=null)
        {
            first.data=first.data^mid.data;
            mid.data=first.data^mid.data;
            first.data=first.data^mid.data;
        }

    }
}
