package doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(4);

        myDoublyLinkedList.append(5);

        myDoublyLinkedList.prepend(30);

        myDoublyLinkedList.insert(3, 2);

        myDoublyLinkedList.remove(2);

        myDoublyLinkedList.print();
    }
}