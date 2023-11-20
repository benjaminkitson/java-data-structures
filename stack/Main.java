package stack;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);

        newStack.push(7);

        newStack.push(2);

        newStack.pop();

        newStack.printStack();
    }
}