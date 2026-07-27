import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("original is "+str);
        int A=str.length();
        for(int i=A-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        
    }
}
