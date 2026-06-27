import java.util.Scanner;

public class Isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str =sc.nextLine();
        System.out.println("Enter a string :");
        String str1 =sc.nextLine();
        int map1[]=new int[254];
        int map2[]=new int[254];
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            char ch1 =str1.charAt(i);
            if(map1[ch]==0&&map2[ch1]==0){
                map1[ch]=ch1;
                map2[ch1]=ch;
            }
            else if(map1[ch]!=ch1||map2[ch1]!=ch){
                System.out.println("Not Isomarphic");
                break;
            }
            else{
                System.out.println("Isomarphic");
            }
        }
        sc.close();

    }
}
