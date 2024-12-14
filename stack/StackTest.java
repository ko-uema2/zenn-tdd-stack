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
}