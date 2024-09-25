package Day12;

import java.util.LinkedList;

public class Result {
    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        // Write your code here
        // n 1 2 3 4 5
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = llist;
        while (curr != null) {
            SinglyLinkedListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null || head2 == null) {
            return head1;
        }
        SinglyLinkedListNode current = null;
        if (head1.data <= head2.data) {
            current = head1;
            head1 = head1.next;
        } else {
            current = head2;
            head2 = head2.next;
        }
        SinglyLinkedListNode myHead = current;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                current = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                current = head2;
                head2 = head2.next;
            }
        }
        if (head1 != null) {
            current.next = head1;
        } else if (head2 != null) {
            current.next = head2;
        }

        return myHead;
    }

    public static int lastRemaining(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        n = n % 2 == 0 ? n : (n - 1);
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 2; i <= n; i += 2) {
            list.add(i);
        }
        int i = list.size() - 1;
        boolean toLast = true;
        while (list.size() != 1) {
            if (toLast == true) {
                for (int j = list.size() - 1; j >= 0; j -= 2) {
                    list.remove(j);
                }
                toLast = false;
            }
            if(list.size() == 1) break;
            if(toLast == false) {
                for (int j = 0; j < list.size(); j += 2) {
                    list.remove(j);
                    j--;
                }
                toLast = true;
            }
        }
        return list.get(0);
    }

    public static boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        return isPowerOfFour(n / 4) && n % 4 == 0;
    }

    public static SinglyLinkedListNode swapPairs(SinglyLinkedListNode head) {
        SinglyLinkedListNode cur = head;
        while(cur != null) {
            SinglyLinkedListNode next = cur.next;
            cur.next = cur.next.next;
            next.next = cur;
            cur = next.next;
        }
        return head;
    }

}
