import java.util.Scanner;

public class DecimalToOctal {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num :");
        int num = sc.nextInt();
        String octal = "";
        while(num>0){
            octal=(num%8)+octal;
            num/=8;
        }
        System.out.println(octal);
        sc.close();
    }
}
