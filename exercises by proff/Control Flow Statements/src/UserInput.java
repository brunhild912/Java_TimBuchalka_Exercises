import java.util.Scanner;

public class UserInput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your dob: \n");

        String dob = scanner.nextLine();

        int dobParsed = Integer.parseInt(dob);

        int age = 2023 - dobParsed;

        System.out.print("Your age is: " + age);

        scanner.close();


    }
}
