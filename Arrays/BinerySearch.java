package Arrays;
import java.util.Scanner;
public class BinerySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter a target value ");
        int s =sc.nextInt();
        int start=0;
        int end=size-1;
        int index=-1;
        while (start<=end) {
            int mid=(start+end)/2;
        if(arr[mid]==s){
            index=mid;
            break;
        }
        else if(s>arr[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    if(index!=-1)
    {
        System.out.println(" found"+index);
    }
    else{
        System.out.println("not found");
    }
    sc.close();
    }
}
