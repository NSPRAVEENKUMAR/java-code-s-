public class Insert {
    public static void main(String[] args) {

        //System.out.println("Hello, World!");
        LinkedList link=new LinkedList();
        link.insertAtBegin(100);
        link.insertAtBegin(200);
        link.insertAtBegin(300);
        link.display();


    }
}
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class LinkedList
{
    Node head, tail;
    void insert(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        if(head==null){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    void insertAtBegin(){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            tem=temp.next;
        }
    }


}