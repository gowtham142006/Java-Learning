package String;

import java.util.Scanner;

public class ReverseBeforeAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
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
