import java.util.HashSet;

public class problem07 {
    public static void main(String[] args) {
        String str="abcaabbcc";
        HashSet<Character>set=new HashSet<>();
        for (char c:str.toCharArray()){
            set.add(c);
        }
        System.out.print("Unique characters:");
        for (char c:set){
            System.out.print(c+"");
        }
        System.out.println();
        System.out.println("total unique elements are:"+set.size());
    }
}
