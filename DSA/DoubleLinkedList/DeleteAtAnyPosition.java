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

public class DeleteAtAnyPosition {
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
        newnode.pre=temp;
    }
    void DeleteAtFirstPos(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
         if (head.next == null) {
            head = null;
            return;
        }
        head=head.next;
        head.pre=null;

    }

    void DeleteAtAnyPos(int pos){
         Node temp=head;
          if(pos==1){
             DeleteAtFirstPos();
             return;
          }
         int i=1;
        while (temp!=null && i<pos) {
            temp=temp.next;
            i++;
        }
        
        if(temp==null){
            System.out.println("Invalid Index");
            return;
        }
        if(temp.next!=null){

            temp.next.pre=temp.pre;
        }
        
          temp.pre.next=temp.next;
         temp.pre = null;
    temp.next = null;
    }
    

    void display(){
        Node temp=head;
         if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        DeleteAtAnyPosition obj=new  DeleteAtAnyPosition();
        
        obj.insertEnd(10);
        obj.insertEnd(20);
        obj.insertEnd(30);
        obj.DeleteAtAnyPos(3);
        obj.display();
    }
}