import java.util.Scanner;
public class FrequencyNumberCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array size");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            int count=1;
            int flag=0;

            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    flag=1;
                }
            }
            
            if(flag==0){
                for(int k=i+1;k<size;k++){
                    if(arr[k]==arr[i]){
                        count++;
                    }
                }
                System.out.println(arr[i] +"-"+ count);
            }
    }
        sc.close();
    }
}
