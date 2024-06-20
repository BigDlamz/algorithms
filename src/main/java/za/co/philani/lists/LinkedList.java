package za.co.philani.lists;

import java.util.Objects;

public class LinkedList {

    static class Node {
        int data;  // data stored in the node
        Node next; // reference to the next node

        // Constructor to initialize a node with given data
        Node(int data) {
            this.data = data;
        }
    }

    Node head; // head of the linked list

    // Method to add a new node at the end of the list
    public void append(int data) {
        // If the list is empty, create a new head node
        if (Objects.isNull(head)) {
            head = new Node(data);
        } else {
            // Start from the head node
            Node current = head;
            // Traverse to the last node (node with next as null)
            while (current.next != null) {
                current = current.next;
            }
            // Create a new node at the end
            current.next = new Node(data);
        }
    }

    // Method to add a new node at the beginning of the list
    public void prepend(int data) {
        Node newHead = new Node(data);
        // Make the current head the next node of the new head
        newHead.next = this.head;
        // Update the head to be the new node
        this.head = newHead;
    }

    // Method to delete the first occurrence of a node with given data
    public void deleteWithValue(int deleteData) {
        if (head == null) {
            return; // If list is empty, nothing to delete
        }
        if (head.data == deleteData) {
            this.head = this.head.next; // If head node has the data, update head
            return;
        }
        Node current = head;
        // Traverse until we find the node to delete or reach the end
        while (current.next != null) {
            if (current.next.data == deleteData) {
                current.next = current.next.next; // Skip the next node (delete it)
                return;
            }
            current = current.next;
        }
    }

    // Method to insert a new node at a given position
    public Node insertAtPosition(Node node, int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            // If inserting at the beginning, update the head
            newNode.next = node;
            return newNode;
        }

        Node current = node;
        // Traverse to the node just before the desired position
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current != null) {
            // Insert the new node by updating next pointers
            newNode.next = current.next;
            current.next = newNode;
        }

        return node; // Return the head of the list
    }

    // Method to detect a cycle in the linked list using Floyd's Cycle-Finding Algorithm
    public boolean hasCycle(Node head) {
        // If the list is empty or has only one node, there is no cycle
        if (head == null || head.next == null) {
            return false;
        }

        // Initialize two pointers, slow and fast
        Node slow = head;
        Node fast = head;

        // Traverse the list with the two pointers
        while (fast != null && fast.next != null) {
            // Move slow pointer by one step
            slow = slow.next;

            // Move fast pointer by two steps
            fast = fast.next.next;

            // If the slow pointer and fast pointer meet, there is a cycle
            if (slow == fast) {
                return true;
            }
        }

        // If we reach here, there is no cycle
        return false;
    }
}
