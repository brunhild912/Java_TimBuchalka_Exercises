public class Main {
    public static void main (String [] args){
        byte num_byte = 10;
        short num_short = 20;
        int num_integer = 50;
        long num_long = 5000L + 10L * (num_byte + num_short + num_integer);

        short num_short_TOTAL = (short) (num_long);
        System.out.println(num_short_TOTAL);


    }
}
