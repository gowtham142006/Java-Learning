import java.util.Scanner;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int num;
            if (i % 2 == 1) {
                num = 1;
            } else {
                num = 0;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num;
            }

            System.out.println();
        }

        sc.close();
    }
}