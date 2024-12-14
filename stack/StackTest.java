package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StackTest {

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());
    } 

    @Test
    public void testPushAndPeek() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.peek());
    }

    @Test
    public void testPushAndPop() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.pop());
    }

    @Test
    public void testPopThrowsExceptionWhenStackIsEmpty() {
        Stack stack = new Stack();

        try {
            stack.pop();
            fail("pop() should throw an exception when the stack is empty");
        } catch (Exception e) {
            assertTrue(e instanceof StackEmptyException);
            assertEquals("Stack is empty", e.getMessage());
        }
    }

    @Test
    public void testPeekThrowsExceptionWhenStackIsEmpty() {
        Stack stack = new Stack();

        try {
            stack.peek();
            fail("peek() should throw an exception when the stack is empty");
        } catch (Exception e) {
            assertTrue(e instanceof StackEmptyException);
            assertEquals("Stack is empty", e.getMessage());
        }
    }

    @Test
    public void testPushMultipleElementsAndPopInOrder() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        Stack stack = new Stack();
        assertEquals(0, stack.size());

        stack.push(1);
        assertEquals(1, stack.size());

        stack.push(2);
        assertEquals(2, stack.size());

        stack.pop();
        assertEquals(1, stack.size());
    }
}