package stack;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class StackTest {

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    } 
}