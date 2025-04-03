// This code will give us brief information about how cirular Linked List works in JAVA.

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    // Constructor
    public CircularLinkedList() {
        this.head = null;
    }

    // Method to add a new node at the end of the circular linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head; // Point to itself
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head; // Make it circular
        }
    }

    // Method to display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Method to delete a node from the circular linked list
    public void delete(int key) {
        if (head == null) return;

        Node current = head, prev = null;

        // If the node to be deleted is the head node
        if (current.data == key) {
            // If there's only one node
            if (current.next == head) {
                head = null;
            } else {
                // Find the last node
                while (current.next != head) {
                    current = current.next;
                }
                current.next = head.next; // Link last node to the second node
                head = head.next; // Move head to the next node
            }
            return;
        }

        // Search for the node to be deleted
        while (current.next != head && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the node was not found
        if (current.data != key) {
            System.out.println("Node with data " + key + " not found.");
            return;
        }

        // Unlink the node from the list
        prev.next = current.next;
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.add(4);
        cll.add(5);

        System.out.println("Circular Linked List:");
        cll.display();

        cll.delete(3);
        System.out.println("After deleting 3:");
        cll.display();

        cll.delete(1);
        System.out.println("After deleting 1:");
        cll.display();
    }
}
