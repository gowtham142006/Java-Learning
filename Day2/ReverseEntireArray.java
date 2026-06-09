package Day2;
import java.util.Scanner;

public class ReverseEntireArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter a element of array: ");
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=size-1;
        int temp=0;
        while(start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reverse of array is :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
