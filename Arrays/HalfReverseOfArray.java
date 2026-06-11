package Arrays;
import java.util.Scanner;

public class HalfReverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array :");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter a element of array "+i+":");
            arr[i]=sc.nextInt();
        }
        int mid=size/2-1;
        int start=0;
        int end=size-1;
        while(start<mid){
            int temp=arr[start];
            arr[start]=arr[mid];
            arr[mid]=temp;
            start++;
            mid--;
        }
        mid=size/2;
        while(mid<end){
            int temp=arr[mid];
            arr[mid]=arr[end];
            arr[end]=temp;
            mid++;
            end--;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
