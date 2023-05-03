public class ClockMain {
    public static void main(String[] args) {
        Clock clock = new Clock(12, 30, 0);
        System.out.println(clock);

        clock.millisec();
        System.out.println(clock);

        clock.setMinute(45);
        System.out.println(clock);

        clock.setHour(23);
        clock.setMinute(59);
        clock.setSeconds(59);
        System.out.println(clock);
        clock.millisec();
        System.out.println(clock);

    }
}
