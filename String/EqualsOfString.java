import java.util.Scanner;

public class EqualsOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1 :");
        String str1 = sc.nextLine();
        System.out.println("Enter string2 :");
        String str2 = sc.nextLine();
        //String str3 ="abc";
        //String str4 ="abc";
        if(str2.equals(str1)){
            System.out.println("String is equal");
        }
        else{
            System.out.println("string is not equal");
        }
        
    }
}
