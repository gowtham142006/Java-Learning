import java.util.Scanner;

public class MinAndMaxInArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the array element: ");
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min of array is: "+min);
        int max=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max of array is: "+max);
        

    }
}
