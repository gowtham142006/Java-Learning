import java.util.Scanner;

public class ArrQueue{
    int front=-1;
    int rear=-1;
    int size;
    int queue[];
    ArrQueue(int size){
        this.size=size;
        queue=new int[size];
    }
    int  isEmpty(){
        if(rear==-1&&front==-1){
            return 1;
        }
        return 0;
    }

     int isFull(){
        if(rear==size-1){
            return 1;
        }
        return 0;
    }
    void enQueue(int data){
        if(isFull()!=1){
            if(front==-1){
                queue[++rear]=data;
                front++;
            }
            else{
                queue[++rear]=data;
                
            }
        }
        else{
            System.out.println("Queue is Empty");
        }
    }

    void dequeue(){
        if(isEmpty()==1){
            System.out.println("Queue is Empty");
        }
        else if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
    }
   
    void disp(){
        System.out.print("\nfront->");
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" : ");
        }
        System.out.print("<-rear\n");
    }
    public static void main(String[] args){
        ArrQueue obj=new ArrQueue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.disp();
        obj.dequeue();
        obj.disp();
    }
}