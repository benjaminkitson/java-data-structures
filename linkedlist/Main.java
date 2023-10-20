package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.append(10);

        myLinkedList.prepend(7);

        myLinkedList.insert(2, 50);

        myLinkedList.reverse();

        myLinkedList.print();
    }
}