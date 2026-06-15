package String;

import java.util.Scanner;

public class OccurenceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            int count=1;
            int flag=0;
            char ch = str.charAt(i);
            for(int j=0;j<i;j++){
                if(ch==str.charAt(j)&&ch!=' '){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
            for(int k=i+1;k<str.length();k++){
                if(ch==str.charAt(k)&&ch!=' '){
                count++;
            }
            }
            System.out.println(ch+"-"+count);
            
        }
    }
    sc.close();
}
}
