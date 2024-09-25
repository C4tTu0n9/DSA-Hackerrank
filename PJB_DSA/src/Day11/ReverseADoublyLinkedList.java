package Day11;

import java.util.Scanner;

public class ReverseADoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 0; i < N; i++) {
            list.insertNode(sc.nextInt());
        }
        list.head = Result.reverse(list.head);
        DoublyLinkedListPrintHelper.printList(list.head,"->");
    }
}
