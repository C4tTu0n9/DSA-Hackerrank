package Day12;

import java.util.Scanner;

public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            SinglyLinkedList sll = new SinglyLinkedList();
            for (int j = 0; j < n; j++) {
                sll.insertNode(sc.nextInt());
            }
            int n2 = sc.nextInt();
            SinglyLinkedList sll2 = new SinglyLinkedList();
            for (int j = 0; j < n2; j++) {
                sll2.insertNode(sc.nextInt());
            }
            sll.head = Result.mergeLists(sll.head,sll2.head);
            SinglyLinkedListPrintHelper.printList(sll.head, "->");
        }
    }
}
