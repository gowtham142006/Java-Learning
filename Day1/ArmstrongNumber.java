package Day1;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter a num :");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp > 0) {
            int last = temp % 10;
            count++;
            temp /= 10;
        }
        int sum = 0;
        int temp1 = num;
        while (temp1 > 0) {
            int last = temp1 % 10;
            int result = 1;
            for (int i = 1; i <= count; i++) {
                result *= last;
            }
            sum += result;
            temp1 /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    }

}
