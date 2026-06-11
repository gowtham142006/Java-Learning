package Arrays;

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
        int r[]=new int[size];
        int index=0;
        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                r[index]=arr[i];
                index++;
            }
        }
        System.out.println("After removing empty element");
        for(int i=0;i<size;i++){
            System.out.print(r[i]+" ");
        }
        sc.close();
}
}
