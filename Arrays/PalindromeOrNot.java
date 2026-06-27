import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array :");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter a element of array "+i+":");
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=size-1;
        int flag=0;
        for(int i=0;i<size;i++){
            if(arr[start]!=arr[end]){
               flag=1;
            }
            start++;
            end--;
        }
        if(flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
        sc.close();
    }

}
