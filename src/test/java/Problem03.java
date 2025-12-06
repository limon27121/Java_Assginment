import java.util.HashSet;

public class Problem03 {
    public static void main(String[] args)throws Exception {
        int sum=0;
        int[] numbers = {11, 7, 7, 11, 2, 15, 6, 6};
        HashSet<Integer>set=new HashSet<>();
        for (int num:numbers){
            set.add(num);
        }
        for (int value:set){
            sum+=value;
        }

        System.out.println("Sum of the unique elements:"+sum);


    }
}
