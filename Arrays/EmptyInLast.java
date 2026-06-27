import java.util.Scanner;

public class EmptyInLast {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        /*int r[]=new int[size];
        int index=0;
        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                r[index]=arr[i];
                index++;
            }
        }*/
        int index=0;
        for(int i=0;i<size;i++){       //Another method without creating new array
             if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
              }
            } 
        while(index<size){
            arr[index]=0;
            index++;
            }
        System.out.println("After removing empty element");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
}
}
