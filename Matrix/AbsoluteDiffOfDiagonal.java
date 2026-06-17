package Matrix;

import java.util.Scanner;

public class AbsoluteDiffOfDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row size :");
        int r=sc.nextInt();
        System.out.println("Enter a column size :");
        int c = sc.nextInt();
        int arr[][]=new int[r][c];
        int p=0;
        int s=0;
        System.out.println("Enter a elements :");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            p+=arr[i][i];
            s+=arr[i][r-i-1];
        }
        if(p>s){
            System.out.println("Absolutediff is"+(p-s));
        }
        else{
            System.out.println("Absolutediff is"+(s-p));
        }
        sc.close();
    }
}
