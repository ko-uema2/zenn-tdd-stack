package stack;

class Stack {
  private Node top;
  private int stackSize;

  private class Node {
    private final Node next;
    private final int value;

    private Node(final int value, final Node next) {
      this.value = value;
      this.next = next;
    }
  }

  private Stack() {
    top = null;
    stackSize = 0;
  }


  static Stack create() {
    return new Stack();
  }

  boolean isEmpty() {
    return top == null;
  }

  void push(final int value) {
    top = new Node(value, top);
    stackSize++;
  }

  int peek() {
    if (isEmpty()) {
      throw new StackEmptyException();
    }

    return top.value;
  }

  int pop() {
    if (isEmpty()) {
      throw new StackEmptyException();
    }

    int value = top.value;
    top = top.next;
    stackSize--;

    return value;
  }

  int size() {
    return stackSize;
  }
}
