public class problem01 {
    public static void main(String[] args) {
        int[]numbers= {11, 7, 2, 15, 6};
        int max=numbers[0];
        int second_max=numbers[1];
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]>max){
                second_max=max;
                max=numbers[i];
            }
            else if (numbers[i]>second_max && numbers[i]<max) {
                second_max=numbers[i];
            }
        }
        System.out.println("difference between the maximum and second maximum value: "+(max-second_max));
    }
}
