public class timespan {
    int days;
    int hours;
    int minutes;
    int seconds;

    public void time(int seconds) {

        days = seconds / (24 * 60 * 60);
        //remaining seoncds = seconds%(24*60*60)
        hours = (seconds % (24 * 60 * 60)) / (60 * 60);
        //remaing seconds = seconds%(60*60)
        minutes = (seconds % (60 * 60)) / 60;
        seconds %= 60;

        System.out.println("days: " + days + " hours: " + hours + " minutes: " + minutes + " remainging seconds: " + seconds);
        // seconds = 120; = 2 min

    }
}
