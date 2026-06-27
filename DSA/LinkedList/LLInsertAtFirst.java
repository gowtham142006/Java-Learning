 class Node {
    int data;
    Node next;

    Node(int data){
       this. data= data;
        this.next=null;
    }
}

public class  LLInsertAtFirst{
    Node head=null;

    void insertFirst(int data){
        Node newnode =new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        
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
        LLInsertAtFirst obj=new LLInsertAtFirst();
        
        obj.insertFirst(10);
        obj.insertFirst(20);
        obj.insertFirst(30);
        obj.display();
    }
}

