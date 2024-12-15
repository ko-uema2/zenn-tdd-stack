package stack;

class Stack {
  private Stack top;
  private Stack next;
  private int value;
  private int stackSize;

  Stack() {
    top = null;
    stackSize = 0;
  }

  private Stack(final int value, final Stack next) {
    this.value = value;
    this.next = next;
  }

  boolean isEmpty() {
    return top == null;
  }

  void push(final int value) {
    top = new Stack(value, top);
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
