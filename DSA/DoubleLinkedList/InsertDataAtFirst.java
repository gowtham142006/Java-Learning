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

public class InsertDataAtFirst {
    Node head=null;

    void InsertFirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        head.pre=newnode;
        newnode.next=head;
        head=newnode;

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
        InsertDataAtFirst obj=new InsertDataAtFirst();
         obj.InsertFirst(10);
        obj.InsertFirst(20);
        obj.InsertFirst(30);
        obj.display();
        obj.displayrev();
    }
}
