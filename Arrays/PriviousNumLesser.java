import java.util.Scanner;

public class PriviousNumLesser {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array :");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter a element of array "+i+":");
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        System.out.println(min);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                System.out.println(min);
            }
        }
        sc.close();
}
}

