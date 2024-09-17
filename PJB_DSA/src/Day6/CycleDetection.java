package Day6;

public class CycleDetection {
    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null) {
            return false;
        }

        SinglyLinkedListNode a = head;
        SinglyLinkedListNode b = head;

        while (b != null && b.next != null) {
            a = a.next;
            b = b.next.next;

            if (a == b) {
                return true;
            }
        }

        return false;
    }

    static SinglyLinkedListNode createLinkedListWithCycle(int[] values, int cyclePos) {
        if (values == null || values.length == 0) {
            return null;
        }

        SinglyLinkedListNode head = new SinglyLinkedListNode(values[0]);
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode cycleNode = null;

        for (int i = 1; i < values.length; i++) {
            current.next = new SinglyLinkedListNode(values[i]);
            current = current.next;

            if (i == cyclePos) {
                cycleNode = current;
            }
        }

        if (cyclePos >= 0 && cyclePos < values.length) {
            current.next = cycleNode;
        }

        return head;
    }

    public static void main(String[] args) {
        // Test case 1: No cycle
        SinglyLinkedListNode list1 = createLinkedListWithCycle(new int[]{1, 2, 3, 4, 5}, -1);
        System.out.println("List 1 has cycle: " + hasCycle(list1));

        // Test case 2: With cycle
        SinglyLinkedListNode list2 = createLinkedListWithCycle(new int[]{1, 2, 3, 4, 5}, 2);
        System.out.println("List 2 has cycle: " + hasCycle(list2));

        // Test case 3: Empty list
        SinglyLinkedListNode list3 = null;
        System.out.println("List 3 has cycle: " + hasCycle(list3));

        // Test case 4: Single element, no cycle
        SinglyLinkedListNode list4 = createLinkedListWithCycle(new int[]{1}, -1);
        System.out.println("List 4 has cycle: " + hasCycle(list4));

        // Test case 5: Single element, with cycle
        SinglyLinkedListNode list5 = createLinkedListWithCycle(new int[]{1}, 0);
        System.out.println("List 5 has cycle: " + hasCycle(list5));
    }

}
