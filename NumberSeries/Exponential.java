import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + power + " is: " + result);
        sc.close();
    }
}

