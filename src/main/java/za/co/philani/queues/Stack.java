package za.co.philani.queues;

/**
 * Last In, First Out (LIFO) Stack implementation using a linked list.
 **/
public class Stack {

    private Node top; // The top of the stack

    // Node class to represent each element in the stack
    private static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        // Constructor to initialize a node with given data
        Node(int data) {
            this.data = data;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Method to get the value at the top of the stack without removing it
    public int peek() {
        return top.data;
    }

    // Method to add a new element to the top of the stack
    public void push(int data) {
        Node node = new Node(data); // Create a new node with the given data
        node.next = top; // Link the new node to the current top
        top = node; // Update the top to be the new node
    }

    // Method to remove and return the value at the top of the stack
    public int pop() {
        int data = top.data; // Get the data from the top node
        top = top.next; // Move the top to the next node
        return data; // Return the removed data
    }
}
