package Day6;

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
    public void insert(int data) {
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
        SinglyLinkedListNode currentHead = head1.data <= head2.data ? head1 : head2;
        SinglyLinkedListNode currentTail = currentHead.data <= head2.data ? currentHead : head2;
        currentTail = currentTail.data <= head1.data ? currentTail : head1;
        currentHead.next = currentTail;
        while(currentTail.next != null) {
            if(currentTail.data == head1.data) {
                head1 = head1.next;
                if(head1.data < head2.data){
                    currentTail.next = head1;
                    head1 = head1.next;
                }
                else {
                    currentTail.next = head2;
                    head2 = head2.next;
                }
                currentTail = currentTail.next;
            }
            else {
                head2 = head2.next;
                if(head1.data < head2.data){
                    currentTail.next = head1;
                    head1 = head1.next;
                }
                else {
                    currentTail.next = head2;
                    head2 = head2.next;
                }
            }
        }
        return currentHead;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(7);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insert(1);
        list2.insert(2);

//        mergeLists(list.head,list2.head);
        list.display();

    }
}
