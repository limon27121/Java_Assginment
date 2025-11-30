public class Problem02 {

    public static boolean Is_prime(int n){
        if(n<=1){
            return false;
        }
        for (int i=0;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void prime(int[]numbers) {
        int sum=0;
        for (int num:numbers){
           if(Is_prime(num)){
               sum+=num;
           }
        }
        System.out.println("sum of all prime numbers in the array is:"+sum);

}

    public static void main(String[] args) {
              int[]numbers={11, 7, 2, 15, 6};
              prime(numbers);
    }

}
