import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        System.out.println("enter your input");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
//        String str = "1001";

        boolean flag=true;


        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='0' && ch!='1'){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
