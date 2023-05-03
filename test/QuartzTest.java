import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuartzTest {

    @Test
    void hoursInTimeTest(){
    int hours = 0;
    int minutes =0;
    int seconds = 0;

    Quartz quartz  = new Quartz(hours, minutes, seconds);
    quartz.setHours(hours);
    assertEquals(0, quartz.getHours());
    }

    @Test
    void minutesInTimeTest(){
        int hours = 0;
        int minutes =0;
        int seconds = 0;
        Quartz quartz  = new Quartz(hours, minutes, seconds);
        quartz.setMinutes(minutes);
        assertEquals(0,quartz.getMinutes());
    }

    @Test
    void secondsInTimeTest(){
        int hour = 0;
        int minutes = 0;
        int seconds = 0;
        Quartz quartz = new Quartz(hour, minutes, seconds);
        quartz.setSeconds(hour);
        assertEquals(0,quartz.getSeconds());
    }
}
