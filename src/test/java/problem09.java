import java.util.Random;

public class problem09 {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String special = "@#&*";

        String all=upper+lower+digits+special;

        String password="";
        Random rand=new Random();

        password+=upper.charAt(rand.nextInt(upper.length()));
        password+=lower.charAt(rand.nextInt(lower.length()));
        password+=digits.charAt(rand.nextInt(digits.length()));
        password+=special.charAt(rand.nextInt(special.length()));
        for (int i=0;i<4;i++){
            password+=all.charAt(rand.nextInt(all.length()));
        }
        System.out.println(password);


    }
}
