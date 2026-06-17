package Matrix;

import java.util.Scanner;

public class CompareTwoMatrix {
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
        int flag=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr1[i][j]!=arr2[i][j]){

                flag=1;
                break;
                }
            }
        }
        if(flag==0){
            System.out.println("True");
        }
        else{
            System.out.println("Flase");
        }
        sc.close();
    }
}
