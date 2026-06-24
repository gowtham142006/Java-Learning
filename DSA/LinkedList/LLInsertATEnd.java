package DSA.LinkedList;
 class Node {
    int data;
    Node next;

    Node(int data){
       this. data= data;
        this.next=null;
    }
}

public class LLInsertATEnd {
    Node head=null;

    void insertEnd(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.err.print("null");
    }
    public static void main(String[] args) {
        LLInsertATEnd obj=new LLInsertATEnd();
        
        obj.insertEnd(10);
        obj.insertEnd(20);
        obj.insertEnd(30);
        obj.display();
    }
}
