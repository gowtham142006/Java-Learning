import java.util.Scanner;

public class RemoveDuplicateElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array :");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter a element of array "+i+":");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int count=0;
            int flag=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                }
            }
            if(flag==0){
            for(int k=i;k<size;k++){
                if(arr[i]==arr[k]){
                    count++;
                }
            }
            if(count==1){
            System.out.println("After removing repeted elements :"+arr[i]);
            
        }

            }
        }
        sc.close();
}
}
