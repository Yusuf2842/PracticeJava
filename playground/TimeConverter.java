package playground;

public class TimeConverter{
    
    public static void main(String[] args) {
        
        String time = getDurationString(-20);
        System.out.println("The time is " + time);
        String time2 = getDurationString(-20, -40);
        System.out.println("The time is " + time2);

        
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return ("Invalid number");
        }
        
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return ("Invalid numbers (second method)");
        }
        
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return (hours + "h " + remainingMinutes + "m " + seconds + "s ");
         //XXh YYm ZZs
    }

}