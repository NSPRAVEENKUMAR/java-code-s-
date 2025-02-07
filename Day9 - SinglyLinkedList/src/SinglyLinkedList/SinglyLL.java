package SinglyLinkedList;

public class SinglyLL {
    Node head, tail;

    void insert(int data) {
        Node newnode = new Node(data);
        //newnode.next=head;
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    void insertAtBegin(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insertMiddle(int data, int pos) {
        Node newnode = new Node(data);
        if (pos == 0) {  // Insert at head case
            newnode.next = head;
            head = newnode;
            return;
        }

        Node temp = head;
        int count = 0;

        // Traverse to the node before the insertion point
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        // Insert new node in the middle
        newnode.next = temp.next;
        temp.next = newnode;
    }
    // Delete from beginning
    public void deleteBegin() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    // Delete from end
    public void deleteEnd() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.data == data) {
            deleteBegin();
            return;
        }
        Node temp = head;
        Node prev = null;
        do {
            prev = temp;
            temp = temp.next;
            if (temp.data == data) {
                prev.next = temp.next;
                if (temp == tail) {
                    tail = prev;
                }
                return;
            }
        } while (temp != head);
        System.out.println("Element not found");
    }


    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
