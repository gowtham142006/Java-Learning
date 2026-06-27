import java.util.Scanner;

public class SumOfMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        int sum=0;
        System.out.println("Enter a elements :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum of matrix is ");
        System.out.println(sum);
        sc.close();
    }
}


