package Matrix;

import java.util.Scanner;

public class PrintMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter a elements :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");

        }
        sc.close();
    }
}
