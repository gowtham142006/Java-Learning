import java.util.Scanner;

public class AnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string 1 :");
        String str1 = sc.nextLine();
        System.out.println("Enter a string 2 :");
        String str2 = sc.nextLine();
        int arr[] = new int[254];

        for(int i=0;i<str1.length();i++){
            arr[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            arr[str2.charAt(i)]--;
        }
        int flag=0;
        for(int k=0;k<254;k++){
            if(arr[k]!=0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }

    }
}
