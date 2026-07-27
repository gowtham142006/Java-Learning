import java.util.Scanner;

public class ArrayDuplicateElements {
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
            int flag=0;

            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                }
            }
            
            if(flag==0){
                for(int k=i+1;k<size;k++){
                    if(arr[k]==arr[i]){
                       // count++;
                       System.out.println("Duplicate elements are: "+arr[i]);
                       break;
                    }
                }
                
            
        }
    }
    
    }
}
