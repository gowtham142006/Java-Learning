package String;

import java.util.Scanner;

public class InsertWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String word=sc.nextLine();
        int index=sc.nextInt();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i==index){
                System.out.print(word);
            }
                System.out.print(ch);
        }
    if(index==str.length()+1){
        System.out.print(word);
    }
    sc.close();
    }
}
