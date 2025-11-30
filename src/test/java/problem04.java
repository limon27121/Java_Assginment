public class problem04 {
    public static int Length(int len){
        int res= len*(len+1)/2;
        return res;
    }
    public static void main(String[] args) {
        int sum=0;
        int [] numbers={0, 1, 2, 4, 5};
        for (int i:numbers){
            sum+=i;
        }
        int len=numbers.length;
        int number=Length(len)-sum;
        System.out.println("Missing number in the array is:"+number);
    }
}
