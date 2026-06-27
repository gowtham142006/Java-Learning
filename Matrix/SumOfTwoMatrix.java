import java.util.Scanner;

public class SumOfTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row size: ");
        int r = sc.nextInt();
        System.out.println("Enter a column size: ");
        int c = sc.nextInt();
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        System.out.println("Enter Element of 1st matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Element of 2st matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("sum of two matrix is : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.err.print(arr1[i][j]+arr2[i][j]);
                if(j<c-1){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}
