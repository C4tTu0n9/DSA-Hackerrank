package Day12;

import java.util.Scanner;

public class ReverseALinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SinglyLinkedList sll = new SinglyLinkedList();
        for (int i = 0; i < n; i++) {
            sll.insertNode(sc.nextInt());
        }
        sll.head = Result.reverse(sll.head);
        SinglyLinkedListPrintHelper.printList(sll.head, "->");
    }
}
