import java.util.Scanner;

public class PrintExtraChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1=sc.nextLine();
        System.out.println("Enter second string: ");
        String str2=sc.nextLine();
        int sum1=0;
        int sum2=0;
        
        for(int i=0;i<str1.length();i++){
            sum1=sum1+str1.charAt(i);
        }
        for(int j=0;j<str2.length();j++){
            sum2=sum2+str2.charAt(j);
        }
         char ch= (char)(sum2-sum1);
        System.out.print(ch);
        
    }
}
