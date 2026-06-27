import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a num :");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }
        System.out.println("Reverse of the number is: " + rev);
        sc.close();
}
}
