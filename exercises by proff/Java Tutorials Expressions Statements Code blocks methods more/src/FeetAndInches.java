public class FeetAndInches {
    public static double calculateFeetAndInchesToCentimeters (double feet, double inches){
        double centimeter;
        feet = feet + calculateFeetAndInchesToCentimeters (inches);
        centimeter = 30.48 * feet;
        return centimeter;
    }

    public static double calculateFeetAndInchesToCentimeters (double inches){
        double feet;
        feet = (int) inches / 12;
        return feet;
    }

    public static void main (String [] args){

        double conversion = calculateFeetAndInchesToCentimeters(6, 0);
        System.out.println(conversion);

        double feet = calculateFeetAndInchesToCentimeters(100);
        System.out.print(feet);

    }
}
