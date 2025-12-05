public class problem13 {
    public static void main(String[] args) {
        String text = "A Core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece of mouse, what will be my total cost after giving 15% discount?";
        String numbers=text.replaceAll("[^0-9 ]","");
        //
        numbers = numbers.trim().replaceAll("\\s+", " ");
        System.out.println(numbers);
        String[] arr = numbers.split(" ");
        int laptop = Integer.parseInt(arr[1]);
        int mouse = Integer.parseInt(arr[2]);
        double total_price=laptop+mouse;
        double discount=total_price*0.15;
        double final_price=total_price-discount;
        //
        String formatted = String.format("%,d tk", (int)final_price);
        System.out.println(formatted);




    }
}
