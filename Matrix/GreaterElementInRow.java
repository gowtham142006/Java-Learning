import java.util.Scanner;

public class GreaterElementInRow {
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
            int max=arr1[i][0];
            for(int j=0;j<c;j++){
                if(arr1[i][j]>max){
                    max=arr1[i][j];
                }
            }
            System.out.print(max+" ");
        }
        sc.close();
    }
}
