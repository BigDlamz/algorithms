package za.co.philani.lists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    private LinkedList linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    void testAppend() {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        LinkedList.Node current = linkedList.head;
        assertEquals(1, current.data);
        current = current.next;
        assertEquals(2, current.data);
        current = current.next;
        assertEquals(3, current.data);
    }

    @Test
    void testPrepend() {
        linkedList.prepend(1);
        linkedList.prepend(2);
        linkedList.prepend(3);

        LinkedList.Node current = linkedList.head;
        assertEquals(3, current.data);
        current = current.next;
        assertEquals(2, current.data);
        current = current.next;
        assertEquals(1, current.data);
    }

    @Test
    void testDeleteWithValue() {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        linkedList.deleteWithValue(2);

        LinkedList.Node current = linkedList.head;
        assertEquals(1, current.data);
        current = current.next;
        assertEquals(3, current.data);
        assertNull(current.next);

        linkedList.deleteWithValue(1);
        current = linkedList.head;
        assertEquals(3, current.data);
        assertNull(current.next);

        linkedList.deleteWithValue(3);
        assertNull(linkedList.head);
    }

    @Test
    void testInsertAtPositionAtStart() {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(4);

        linkedList.head = linkedList.insertAtPosition(linkedList.head, 3, 0);

        LinkedList.Node current = linkedList.head;
        assertEquals(3, current.data);
        current = current.next;
        assertEquals(1, current.data);
        current = current.next;
        assertEquals(2, current.data);
        current = current.next;
        assertEquals(4, current.data);
    }

    @Test
    void testInsertAtPositionInMiddle() {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(4);

        linkedList.head = linkedList.insertAtPosition(linkedList.head, 3, 2);

        LinkedList.Node current = linkedList.head;
        assertEquals(1, current.data);
        current = current.next;
        assertEquals(2, current.data);
        current = current.next;
        assertEquals(3, current.data);
        current = current.next;
        assertEquals(4, current.data);
    }

    @Test
    void testInsertAtPositionAtEnd() {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        linkedList.head = linkedList.insertAtPosition(linkedList.head, 4, 3);

        LinkedList.Node current = linkedList.head;
        assertEquals(1, current.data);
        current = current.next;
        assertEquals(2, current.data);
        current = current.next;
        assertEquals(3, current.data);
        current = current.next;
        assertEquals(4, current.data);
    }

    @Test
    void testInsertAtPositionOutOfBounds() {
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        linkedList.head = linkedList.insertAtPosition(linkedList.head, 4, 5); // Position is out of bounds

        LinkedList.Node current = linkedList.head;
        assertEquals(1, current.data);
        current = current.next;
        assertEquals(2, current.data);
        current = current.next;
        assertEquals(3, current.data);
        assertNull(current.next);
    }

    @Test
    void testInsertAtPositionInEmptyList() {
        linkedList.head = linkedList.insertAtPosition(null, 1, 0);

        LinkedList.Node current = linkedList.head;
        assertEquals(1, current.data);
        assertNull(current.next);
    }

    @Test
    void testHasCycle() {
        LinkedList.Node node1 = new LinkedList.Node(1);
        LinkedList.Node node2 = new LinkedList.Node(2);
        LinkedList.Node node3 = new LinkedList.Node(3);
        LinkedList.Node node4 = new LinkedList.Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creating a cycle

        assertTrue(linkedList.hasCycle(node1));
    }

    @Test
    void testNoCycle() {
        LinkedList.Node node1 = new LinkedList.Node(1);
        LinkedList.Node node2 = new LinkedList.Node(2);
        LinkedList.Node node3 = new LinkedList.Node(3);
    }}