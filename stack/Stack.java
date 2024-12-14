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
    return top.value;
  }
}
