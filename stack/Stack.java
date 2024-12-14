package stack;

class Stack {
  Stack top;
  int stackSize;

  Stack() {
    top = null;
    stackSize = 0;
  }

  boolean isEmpty() {
    return top == null;
  }

  void push(int value) {
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
