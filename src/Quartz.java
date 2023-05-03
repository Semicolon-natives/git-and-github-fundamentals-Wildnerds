public class Quartz {
    private int seconds;
    private int minutes;
    private int hours;
    public Quartz(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Quartz() {

    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getHours() {
        return 0;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getMinutes() {
        return 0;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getSeconds() {
        return 0;
    }
    public void timeClass(){
        this.seconds++;
        if (this.seconds >= 60){
            this.seconds =0;
            this.minutes++;
            if (this.minutes >= 60){
                this.minutes =0;
                this.hours++;
                if (this.hours >= 24){
                    this.hours =0;
                }
            }
        }

    }
}
