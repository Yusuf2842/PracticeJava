package playground;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        
        if (!summer) {
            if ((temperature >= 25) && (temperature <= 35)) {
                return true;
            } else {
                return false;
            }
        } else {
            if ((temperature >= 25) && (temperature <= 45)) {
                return true;
            } else {
                return false;
            }
        }

    }

    //Cat will play if temperature is 25 >= x <= 35
    //If summer, then 25 >= x <= 45
}