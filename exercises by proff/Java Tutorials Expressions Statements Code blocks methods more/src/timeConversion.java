public class timeConversion {
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

    public static void main (String[] args){
        System.out.println(getDurationString(2, 0));
        System.out.println(getDurationString(2, 300));
    }
}
