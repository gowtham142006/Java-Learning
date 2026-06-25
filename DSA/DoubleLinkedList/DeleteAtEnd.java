package DSA.DoubleLinkedList;

class Node {
    int data;
    Node next;
    Node pre;

    Node(int data){
        this.data= data;
        this.next=null;
        this.pre=null;
    }
}

public class DeleteAtEnd {
     Node head=null;

    void InsertEnd(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.pre=temp;
    }

    void DeleteAtEndPos(){
        
        if (head == null) {
            return;
        }
        
        if (head.next == null) {
            head = null;
            return;
        }
        
        Node temp = head;

    while (temp.next != null) {
        temp = temp.next;
    }

    temp.pre.next = null;
    temp.pre = null;

    }
    void display(){
        Node temp=head;
    
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
   
    public static void main(String[] args) {
        DeleteAtEnd obj=new DeleteAtEnd();
        obj.InsertEnd(10);
        obj.InsertEnd(20);
        obj.InsertEnd(30);
        obj.DeleteAtEndPos();
        obj.display();
        
    }

}
