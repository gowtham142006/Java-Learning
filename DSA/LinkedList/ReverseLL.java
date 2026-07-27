class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class ReverseLL{
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
        System.out.println("null");
    }
    void  Reverse(){
        Node pre=null;
        Node cur=head;
        while(cur!=null){
            Node next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        head= pre;
    }
    public static void main(String[] args) {
        ReverseLL obj = new ReverseLL();
        obj.insertEnd(10);
        obj.insertEnd(20);
        obj.insertEnd(30);
        obj.display();
        obj.Reverse();
        obj.display();

    }
    }
