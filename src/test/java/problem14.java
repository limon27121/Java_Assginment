import java.util.Scanner;

public class problem14 {
    public static void main(String[] args) {
        System.out.println("enter your amount");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
//        int amount = 546;
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int note:notes){
            int count=amount/note;
            if (count!=0){
                System.out.println(note + " x " + count);
                amount-=note*count;
            }
        }

    }
}
