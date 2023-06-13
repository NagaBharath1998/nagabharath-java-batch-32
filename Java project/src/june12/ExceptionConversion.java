package june12;

public class ExceptionConversion {
    public static void main(String[] args) {
        try {
            int hours = -1;
            int minutes = 75;

            if (hours < 0 || hours > 23) {
                throw new IllegalArgumentException("Invalid hours: " + hours);
            }

            if (minutes < 0 || minutes > 59) {
                throw new IllegalArgumentException("Invalid minutes: " + minutes);
            }

            System.out.println("Time: " + hours + ":" + minutes);
        } catch (IllegalArgumentException e) {
            try {
                // Converting IllegalArgumentException to TimeException
                throw new TimeException("error occurred while setting the time");
            } catch (TimeException te) {
                System.out.println("Caught TimeException: " + te.getMessage());
            }
        }
    }
}
