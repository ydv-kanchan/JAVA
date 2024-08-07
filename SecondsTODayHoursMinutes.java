public class SecondsTODayHoursMinutes {
    public static void main(String[] args) {
        time(300);
    }
    
    public static void time(int seconds) {

        int days = seconds / (24 * 60 * 60);
        int hours = (seconds % (24 * 60 * 60)) / (60 * 60);
        int minutes = (seconds % (60 * 60)) / 60;
        int remainingSeconds = seconds % 60;

        System.out.println("days: " + days + " hours: " + hours + " minutes: " + minutes + " remainging seconds: " + remainingSeconds);
        // seconds = 120; = 2 min

    }
}
