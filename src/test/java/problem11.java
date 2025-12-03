public class problem11 {
    public static void main(String[] args) {
        String input="I am a SQA Engineer";
        String output=input.replaceAll("[aeiouAEIOU]","");
        System.out.println("expected output:"+output);
    }
}
