public class Clock {
    private int seconds;
    private int minutes;
    private int hour;
    public Clock(int hour, int minutes, int seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hour = hour;
    }
    public Clock() {
    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        this.hour = hour;
        return this.hour;
    }


    public void hourTest(int hour) {
        return;
    }

    public void setMinute(int minutes) {
    }

    public int getMinute() {
        return this.minutes;
    }

    public void setSeconds(int seconds) {
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void millisec() {
        this.seconds++;
        if (this.seconds >= 60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes >= 60) {
                this.minutes = 0;
                this.hour++;
                if (this.hour >= 24) {
                    this.hour = 0;

                }
            }
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minutes, this.seconds);
    }

    public void setSecond(int seconds) {
    }
}


