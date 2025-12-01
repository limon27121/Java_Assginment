import java.util.Arrays;
public class problem06 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 6, 7};

        Arrays.sort(numbers);
        boolean print=false;
        System.out.println("Repeated Number");
        for (int i=0;i<numbers.length-1;i++){
            if (numbers[i]==numbers[i+1]){
                if (!print){
                    System.out.println(numbers[i]);
                    print=true;
                }
            }
            else {
                print=false;
            }
        }


    }
}
