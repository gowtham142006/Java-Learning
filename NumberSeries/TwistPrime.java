package NumberSeries;
import java.util.Scanner;

public class TwistPrime {
    public static void main(String[] args) {
        System.out.println("Enter a num :");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        int rev = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count!=2)
        {
            System.out.println(num + " is not a prime number.");
        }
        else{
            while(temp > 0){
                int last = temp % 10;
                rev=rev*10+last;
                temp /= 10;
            }
            int count1=0;
            for(int i =1; i <= rev; i++){
                if(rev % i == 0){
                    count1++;
                }
            }
            if(count1 == 2){
                System.out.println(num + " is a twist prime number.");
            }
            else{
                System.out.println(num + " is not a twist prime number.");
            }
        }
        sc.close();
    }
    
}
