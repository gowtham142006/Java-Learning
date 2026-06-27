import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter a array elements "+i+":");
            arr[i]=sc.nextInt();
        }
        int count=0;
        int count1=0;
        for(int i=0;i<size-1;i++){
            if(arr[i]<arr[i+1]){
                count++;
            }
            else if(arr[i]>arr[i+1]){
                count1++;
            }
        }
       if(count==size-1||count1==size-1){
        System.out.println("Array is sorted");
       }
       else{
        System.out.println("Array is not sorted");
       }
       sc.close();
    }
    
}
