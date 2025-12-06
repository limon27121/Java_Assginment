public class problem01 {
    public static void main(String[] args) {
        int max = 0;
        int second_max=0;
        try {
            int[] numbers = {11, 7, 2, 15, 6};
            max = numbers[0];
            second_max = numbers[1];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    second_max = max;
                    max = numbers[i];
                }
                else if (numbers[i] > second_max && numbers[i] < max) {
                    second_max = numbers[i];
                }

            }
        }
        catch (Exception e) {
            System.out.println("handled exception");
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("difference between the maximum and second maximum value: " + (max - second_max));
        }

    }
}
