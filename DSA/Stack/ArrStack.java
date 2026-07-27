import java.util.Scanner;

public class ArrStack{
    int top=-1;
    int size;
    int stack[];
    ArrStack(int size){
        this.size=size;
        stack=new int[size];
    }
    int  isEmpty(){
        if(top==-1){
            return 1;
        }
        return 0;
    }

     int isFull(){
        if(top==size-1){
            return 1;
        }
        return 0;
    }

    void push(int data){
        if(isFull()==1){
            System.out.println("stack is full");
        }
        else{
            stack[++top]=data;
        }
    }

     void pop(){
        if(isEmpty()==1){
            System.out.println("Stack is empty");
        }
        else{
            top--;
        }
    }

     void display(){
        if(isEmpty()==1){
            System.out.println("Stack is empty (underflow)");
        }
        else{
            System.out.print("top-> ");
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]+" > ");
            }
            System.out.print("end\n");
        }
    }

    void peek(){
        if(isEmpty()==1){
            System.out.print("Nothing to peek fool");
        }
        else{
            System.out.println("Peek Element : "+stack[top]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
       ArrStack obj=new ArrStack(size);
       obj.push(10);
       obj.push(20);
       obj.push(30);
       obj.display();
       obj.pop();
       obj.display();
       obj.peek();
       
    }
}
