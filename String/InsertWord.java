import java.util.Scanner;

public class InsertWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=sc.nextLine();
        System.out.println("Enter a another string :");
        String word=sc.nextLine();
        System.out.println("Enter a index to insert :");
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
