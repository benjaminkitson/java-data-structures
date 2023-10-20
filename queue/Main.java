package queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(4);

        myQueue.enqueue(2);

        myQueue.enqueue(5);

        myQueue.enqueue(10);

        myQueue.dequeue();

        myQueue.dequeue();

        myQueue.print();
    }
}