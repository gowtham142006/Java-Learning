import java.util.Scanner;

public class Spiral {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the row : ");
        int row = sc.nextInt();
        System.out.print("Enter the size of the matrix : ");
        int c = sc.nextInt();
        int arr[][] = new int[row][c];
        System.out.println("Enter the matrix elements : ");
        int a[]=new int [row*c];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Element [" + i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }
         int index=0,l=0,r=c-1,t=0,b=row-1;
         while(t<=b && l<=r){
        for(int i=l;i<=r;i++){
            a[index++]=arr[t][i];
            
        }
        t++;
        for(int j=t;j<=b;j++){
            a[index++]=arr[j][r];
            
        }
        r--;
        if(t<=b){
        for(int k=r;k>=l;k--){
            a[index++]=arr[b][k];
            
        }
        b--;
    }
        if(l<=r){
        for(int m=b;m>=t;m--){
            a[index++]=arr[m][l];
    
        }
        l++;
    }
        }
        System.out.println("Matrix ELements : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        for(int z=0;z<index;z++){
            System.out.print(a[z]+" ");
        }
        sc.close();
    }
}
