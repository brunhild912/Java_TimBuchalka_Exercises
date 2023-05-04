import java.util.Scanner;

public class minAndMaxInput {
    public static void main (String[] args){
        int min  = 0;
        int max = 0;
        boolean flag = true;

        // this will make a scanner that will read user input
        Scanner scanUserInput = new Scanner(System.in);

        while (true){
            System.out.println("Enter number: ");

            // making a variable that will be true if input is an Integer
            boolean isAnInteger = scanUserInput.hasNextInt();

            if (isAnInteger){

                //if input is an integer, read the line
                int number = scanUserInput.nextInt();

                // set min/max value to first number entered
                if (flag){
                    flag = false; // so that this condt. executes first time only
                    max = number;
                    min = number;
                }
                if (number > max){
                    max = number;
                } else if (number < min){
                    min = number;
                }
            } else {
                break;
            }

            //handle enter
            scanUserInput.nextLine();
        }

        scanUserInput.close();

        System.out.println("max = " + max + ", min = " + min);
    }
}
