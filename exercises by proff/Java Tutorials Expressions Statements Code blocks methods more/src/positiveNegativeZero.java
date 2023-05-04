public class positiveNegativeZero {
    public static void checkNumber (int number) {
        if (number > 0){
            System.out.println("Positive");
        }
        else if (number < 0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args){
        checkNumber(24);
        checkNumber(0);
        checkNumber(-12);
    }
}
