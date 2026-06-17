package Matrix;

import java.util.Scanner;

public class GreaterElementInColumn {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row size: ");
        int r = sc.nextInt();
        System.out.println("Enter a column size: ");
        int c = sc.nextInt();
        int arr1[][]=new int[r][c];
        System.out.println("Enter Element of matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<r;i++){
            int max=arr1[0][i];
            for(int j=0;j<c;j++){
                if(arr1[j][i]>max){
                    max=arr1[j][i];
                }
            }
            System.out.print(max+" ");
        }
        sc.close();
    }
}
