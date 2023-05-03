import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    @Test
    void hourTest() {
        //given
        int hour = 0;
        int minutes = 0;
        int seconds = 0;
        Clock clock = new Clock(hour, minutes, seconds);
        //when
        clock.hourTest(1);
        //asserts3
        assertEquals(0, clock.getHour());
    }

    @Test
    void minuteTest() {
        int minutes = 0;
        int hour = 0;
        int seconds = 0;
        Clock clock = new Clock(hour, minutes, seconds);
        //when
        clock.setMinute(2);
        //asserts
        assertEquals(0, clock.getMinute());
        }
    @Test
    void secondTest() {
        int seconds = 0;
        int minutes = 0;
        int hour = 0;
        //given
       Clock clock = new Clock( hour, minutes, seconds);
       //when
        clock.setSecond(2);
        //asserts
        assertEquals(0, clock.getSeconds());
    }
    }




