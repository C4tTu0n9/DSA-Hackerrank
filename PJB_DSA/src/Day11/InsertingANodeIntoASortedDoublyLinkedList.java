package Day11;

public class InsertingANodeIntoASortedDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertNode(1);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(10);
        Result.sortedInsert(list.head,5);
        DoublyLinkedListPrintHelper.printList(list.head,"->");
    }
}
