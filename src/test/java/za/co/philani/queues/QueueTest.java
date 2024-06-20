package za.co.philani.queues;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueTest {

    private Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue();
    }

    @Test
    void testIsEmpty() {
        assertTrue(queue.isEmpty(), "Queue should be empty initially");
        queue.add(1);
        assertFalse(queue.isEmpty(), "Queue should not be empty after adding an element");
    }

    @Test
    void testPeek() {
        queue.add(1);
        assertEquals(1, queue.peek(), "Peek should return the first element without removing it");
        queue.add(2);
        assertEquals(1, queue.peek(), "Peek should still return the first element without removing it");
    }

    @Test
    void testAdd() {
        queue.add(1);
        assertFalse(queue.isEmpty(), "Queue should not be empty after adding an element");
        assertEquals(1, queue.peek(), "Peek should return the first element added");
        queue.add(2);
        assertEquals(1, queue.peek(), "Peek should still return the first element added");
    }

    @Test
    void testRemove() {
        queue.add(1);
        queue.add(2);
        assertEquals(1, queue.remove(), "Remove should return and remove the first element");
        assertEquals(2, queue.remove(), "Remove should return and remove the next element");
        assertTrue(queue.isEmpty(), "Queue should be empty after removing all elements");
    }

    @Test
    void testRemoveUntilEmpty() {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        assertEquals(1, queue.remove(), "Remove should return and remove the first element");
        assertEquals(2, queue.remove(), "Remove should return and remove the second element");
        assertEquals(3, queue.remove(), "Remove should return and remove the third element");
        assertTrue(queue.isEmpty(), "Queue should be empty after removing all elements");
    }
}
