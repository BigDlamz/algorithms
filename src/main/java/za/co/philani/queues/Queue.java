package za.co.philani.queues;

/**
 * First In, First Out (FIFO) Queue implementation using a linked list.
 **/
public class Queue {
    private Node head; // The front of the queue
    private Node tail; // The end of the queue

    // Node class to represent each element in the queue
    private static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        // Constructor to initialize a node with given data
        Node(int data) {
            this.data = data;
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to get the value at the front of the queue without removing it
    public int peek() {
        return head.data;
    }

    // Method to add a new element to the end of the queue
    public void add(int data) {
        Node newNode = new Node(data); // Create a new node with the given data

        if (tail != null) {
            tail.next = newNode; // Link the new node to the end of the queue
        }
        tail = newNode; // Update the tail to be the new node
        if (head == null) {
            head = newNode; // If the queue was empty, the new node is also the head
        }
    }

    // Method to remove and return the value at the front of the queue
    public int remove() {
        int data = head.data; // Get the data from the front node
        head = head.next; // Move the head to the next node

        if (head == null) {
            tail = null; // If the queue is now empty, set tail to null as well
        }
        return data; // Return the removed data
    }
}

