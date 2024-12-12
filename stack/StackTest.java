package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
    public void testPush() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.top.value);
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.peek());
    }
}