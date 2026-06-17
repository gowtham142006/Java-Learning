package Matrix;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size");
        int r = sc.nextInt();
        System.out.println("Enter column size");
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter matrix elements :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<c;i++){
            int sum=0;
            for(int j=0;j<r;j++){
                sum+=arr[j][i];
            }
            System.out.println("sum of column "+(i+1)+" is "+sum);
        }
sc.close();
    }
}
