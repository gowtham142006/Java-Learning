import java.util.Scanner;

public class MultipleOfChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i=0;
        while ( i<str.length()) {
            char ch =str.charAt(i);
            i++;
            int count=0;
            while(i<str.length()&&(str.charAt(i)>='0'&&str.charAt(i)<='9')){
                count=count*10+(str.charAt(i)-'0');
                i++;
            }
            for(int k=0;k<count;k++){
                System.out.print(ch);
        }
        }
        sc.close();
    }
}
