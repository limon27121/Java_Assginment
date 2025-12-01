import java.lang.reflect.Array;
import java.util.Arrays;
public class problem05 {
    public static void main(String[] args) {
      int [] numbers={1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
      Arrays.sort(numbers);
      int count=1;
      for (int i=0;i<numbers.length-1;i++){
          if(numbers[i]==numbers[i+1]){
              count++;
          }
          else{
              System.out.println(numbers[i]+":"+count);
              count=1;
          }
      }
        System.out.println(numbers[numbers.length-1]+":"+count);

    }
}
