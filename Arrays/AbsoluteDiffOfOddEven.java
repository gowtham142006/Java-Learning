import java.util.Scanner;

public class AbsoluteDiffOfOddEven {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Size :");
    int size =sc.nextInt();
    int [] arr = new int[size ];

    for(int i =0; i<size ; i++){
        System.out.print("Enter a array element "+i+":");
        arr[i] = sc.nextInt();
    }
    int oddSum =0;
    int evenSum =0;
    for(int i =0; i<size ;i++){
        if(arr[i]%2==0){
         evenSum+=i;
        }
        if(arr[i]%2==1){
         oddSum+=i;
        }

    }
    
    if(oddSum>evenSum){
      int  diff = oddSum -evenSum;
      System.out.println("The Difference is :"+diff);
        
    }
     if(evenSum>oddSum){
      int  diff = evenSum-oddSum;
      System.out.println("The Diff is :"+ diff);
        
    }

    
    }
}
