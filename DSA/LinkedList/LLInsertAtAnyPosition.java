package DSA.LinkedList;

 class Node {
    int data;
    Node next;

    Node(int data){
       this. data= data;
        this.next=null;
    }
}

public class LLInsertAtAnyPosition {
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

        void insertAtAnyPos(int data,int pos){
        Node newnode=new Node(data);
        Node temp=head;
        for(int i=1;i<pos-1&&temp!=null;i++){
            temp=temp.next;

        }
        if(temp==null){
            System.out.println("Invalid Index");
            return;
        }

        newnode.next=temp.next;
        temp.next=newnode;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
       LLInsertAtAnyPosition obj=new LLInsertAtAnyPosition();
        
        obj.insertEnd(10);
        obj.insertEnd(20);
        obj.insertEnd(30);
        obj.insertAtAnyPos(15,2);
    
        obj.display();
    }
}
