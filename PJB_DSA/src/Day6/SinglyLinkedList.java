package Day6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static Day6.DeleteDuplicateValueNodeFromSortedLinkedList.printSinglyLinkedList;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
    public SinglyLinkedListNode(int data) {
        this.data = data;
    }
    public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class SinglyLinkedList {
    SinglyLinkedListNode head;
    SinglyLinkedListNode tail;
    public SinglyLinkedList() {
        head = null;
        tail = null;
    }
    public void insertNode(int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        return;
    }
    public void display() {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if(head1 == null || head2 == null) {
            return head1;
        }
        SinglyLinkedListNode current = null;
        if(head1.data <= head2.data) {
            current = head1;
            head1 = head1.next;
        }
        else {
            current = head2;
            head2 = head2.next;
        }
        SinglyLinkedListNode myHead = current;
        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                current.next = head1;
                current = head1;
                head1 = head1.next;
            }
            else {
                current.next = head2;
                current = head2;
                head2 = head2.next;
            }
        }
        if(head1 != null) {
            current.next = head1;
        }
        else if(head2 != null) {
            current.next = head2;
        }

        return myHead;
    }
//    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.insert(1);
//        list.insert(2);
//        list.insert(3);
//
//        SinglyLinkedList list2 = new SinglyLinkedList();
//        list2.insert(3);
//        list2.insert(4);
//
//        mergeLists(list.head,list2.head);
//        list.display();
//
//    }
private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            SinglyLinkedList llist1 = new SinglyLinkedList();

            int llist1Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist1Count; i++) {
                int llist1Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist1.insertNode(llist1Item);
            }

            SinglyLinkedList llist2 = new SinglyLinkedList();

            int llist2Count = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llist2Count; i++) {
                int llist2Item = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist2.insertNode(llist2Item);
            }

            SinglyLinkedListNode llist3 = mergeLists(llist1.head, llist2.head);

            printSinglyLinkedList(llist3);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
