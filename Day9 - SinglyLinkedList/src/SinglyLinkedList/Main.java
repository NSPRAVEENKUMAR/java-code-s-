package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLL sll=new SinglyLL();
        sll.insert(100);
        sll.insert(200);
        sll.insert(300);
        sll.insertAtBegin(500);
        sll.insertMiddle(400,2);
        sll.display();
        sll.deleteBegin();
        sll.deleteEnd();
        sll.delete(300);
        //sll.display();
    }
}
