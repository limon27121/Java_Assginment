public class problem10 {
    public static void main(String[] args) {
        String input="s@atur!day";
        String output=input.replaceAll("[^a-zA-Z]","");
        System.out.println("expected output:"+output);
    }
}
