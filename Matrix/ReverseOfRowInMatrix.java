import java.util.Scanner;

public class ReverseOfRowInMatrix {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row size: ");
        int r = sc.nextInt();
        System.out.println("Enter a column size: ");
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter Element of matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=c-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
