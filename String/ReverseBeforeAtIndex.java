import java.util.Scanner;

public class ReverseBeforeAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=sc.nextLine();
        System.out.println("Enter a index :");
        int index=sc.nextInt();
        for(int i=index-1;i>=0;i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }
        for(int i=index;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.print(ch);
        }
        sc.close();
    }
}
