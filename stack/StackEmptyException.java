package stack;

class StackEmptyException extends RuntimeException {
    public StackEmptyException() {
        super("Stack is empty");
    }
}
