package za.co.philani.queues;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class StackTest {

    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty(), "Stack should be empty initially");
        stack.push(1);
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element");
    }

    @Test
    void testPeek() {
        stack.push(1);
        assertEquals(1, stack.peek(), "Peek should return the top element without removing it");
        stack.push(2);
        assertEquals(2, stack.peek(), "Peek should return the new top element without removing it");
    }

    @Test
    void testPush() {
        stack.push(1);
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element");
        assertEquals(1, stack.peek(), "Peek should return the pushed element");
        stack.push(2);
        assertEquals(2, stack.peek(), "Peek should return the new top element after pushing another element");
    }

    @Test
    void testPop() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop(), "Pop should return and remove the top element");
        assertEquals(1, stack.pop(), "Pop should return and remove the next element");
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");
    }

    @Test
    void testPopUntilEmpty() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.pop(), "Pop should return and remove the top element");
        assertEquals(2, stack.pop(), "Pop should return and remove the next element");
        assertEquals(1, stack.pop(), "Pop should return and remove the last element");
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");
    }
}
