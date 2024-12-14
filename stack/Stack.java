package stack;

class Stack {
  StackNode top;

  boolean isEmpty() {
    return top == null;
  }

  void push(int value) {
    top = new StackNode(value);
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
    top = null;
    return value;
  }
}
