package String;
import java.util.Scanner;

public class PalindromeOrNot {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        int start=0;
        int end=str.length()-1;
        int flag=0;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                flag=1;
                break;
            }
            start++;
            end--;
        }
        if(flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
}
    
}
    