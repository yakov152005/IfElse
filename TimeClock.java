public class TimeClock {
    public static void main(String[] args) {

        long numOfMilliseconds = System.currentTimeMillis();
        long numOfSeconds = numOfMilliseconds/1000;
        long numOfMinutes = numOfSeconds/60;
        long numOfHours = numOfMinutes/60;

        int currentHour = (int)(numOfHours%24);
        int currentMinutes = (int)(numOfMinutes%60);

        print(currentHour + ":" + currentMinutes + "GMT");

    }

    public static void print(String s) {
        System.out.println(s);
    }
}
