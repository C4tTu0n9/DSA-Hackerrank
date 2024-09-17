package Day6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeleteDuplicateValueNodeFromSortedLinkedList {

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print("->");
            }
        }
    }

    class Result {

        public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode llist) {
            // Write your code here
            SinglyLinkedListNode current = llist;
            while (current.next != null) {
                if(current.data == current.next.data) {
                    current.next = current.next.next;
                }
                else{
                    current = current.next;
                }
            }
            return llist;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            llist.insertNode(llistItem);
        }
        System.out.println("List input:");
        printSinglyLinkedList(llist.head);
        System.out.println();
        SinglyLinkedListNode llist1 = Result.removeDuplicates(llist.head);
        System.out.println("List result:");
        printSinglyLinkedList(llist1);
    }
}





