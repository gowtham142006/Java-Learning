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

public class InsertAtAnyPosition {
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

    void InsertAnyPosition(int data,int pos){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        if(temp==null||temp.next==null){
            System.out.println("Invalid position");
            return;
        }
        newnode.next=temp.next;
        temp.next.pre=newnode;
        newnode.pre=temp;
        temp.next=newnode;
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
    void displayrev(){
        Node temp=head;

        while (temp.next!=null) {
            temp=temp.next;
        }

        while (temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.pre;
        }
        System.out.println("null");
    }
     public static void main(String[] args) {
        InsertAtAnyPosition obj= new InsertAtAnyPosition();
        
        obj.InsertEnd(10);
        obj.InsertEnd(20);
        obj.InsertEnd(30);
        obj.InsertAnyPosition(40,4);
       obj.display();
        obj.displayrev();
    }
}
