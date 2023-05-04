public class switchStatements {
    public static void main (String[] args){
        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("Inches to Feet Conversion: " + calculateFeetAndInchesToCentimeters(12));
                break;
            case 2:
                System.out.println("Time Conversion: " + getDurationString(20, 2));
                break;
            case 3:
                System.out.println("You entered 3.");
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }

    public static double calculateFeetAndInchesToCentimeters (double inches) {
        double feet;
        feet = (int) inches / 12;
        return feet;
    }

        private static String getDurationString(int minutes, int seconds) {
            if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
                int hours = (minutes / 60) + (seconds / 3600);
                String hoursString = hours + "h ";
                if (hours < 10){
                    hoursString = "0" + hoursString;
                }

                int remainingMinutes = minutes % 60;
                String minutesString = remainingMinutes + "m ";
                if (remainingMinutes < 10){
                    minutesString = "0" + minutesString;
                }

                int remainingSeconds = seconds % 3600;
                String secondsString = remainingSeconds + "s ";
                if (remainingSeconds < 10){
                    secondsString = "0" + secondsString;
                }

                return hoursString + minutesString + secondsString + "\n";
            } else {
                return "Invalid value!";
            }
        }

}
