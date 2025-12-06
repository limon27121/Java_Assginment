public class problem02 {
    public static boolean isPrime(int n) {
        try {
            if (n <= 1) return false;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static void prime(int[] numbers) {
        try {
            int sum = 0;

            for (int num : numbers) {
                if (isPrime(num)) {
                    sum += num;
                }
            }

            System.out.println("sum of all prime numbers in the array is: " + sum);

        }
        catch (Exception e) {  // Handles all exceptions
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Execution completed."); // Runs always
        }

    }

    public static void main(String[] args) {
        int[] numbers = {11, 7, 2, 15, 6};
        prime(numbers);
    }
}
