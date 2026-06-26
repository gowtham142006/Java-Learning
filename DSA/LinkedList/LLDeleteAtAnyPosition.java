package DSA.LinkedList;
class Node {
    int data;
    Node next;

    Node(int data){
       this. data= data;
        this.next=null;
    }
}

public class LLDeleteAtAnyPosition {
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

    void DeleteAtAnyPos(int pos){
         Node temp=head;
        for(int i=1;i<pos-1&&temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null||temp.next==null){
            System.out.println("Invalid Index");
            return;
        }
        temp.next=temp.next.next;

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
       LLDeleteAtAnyPosition obj=new LLDeleteAtAnyPosition();
        
        obj.insertEnd(10);
        obj.insertEnd(20);
        obj.insertEnd(30);
        obj.DeleteAtAnyPos(4);
        obj.display();
    }
}

