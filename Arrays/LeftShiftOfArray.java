import java.util.Scanner;
public class LeftShiftOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array :");
         int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no of rotation");
        int k = sc.nextInt();
        k=k%size;
        int r[]=new int[size];
        for(int i=0;i<size;i++){
            r[i]=arr[(i+k)%size];
        }
        System.out.println("Array k times shift is");
        for(int i=0;i<size;i++){
            System.out.println(r[i]+" ");
        }
        
    }
}