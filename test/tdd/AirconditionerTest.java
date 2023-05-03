package tdd;

import Airconditioner.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AirconditionerTest {
    AirConditioner airConditioner = new AirConditioner();

    @Test
    public void AirConditionerExists() {
        //given
        AirConditioner Samsung;
        //when
        Samsung = new AirConditioner();

        //assert
        assertNotNull(Samsung);
    }

    @Test
    public void AirConditionerOnTest(){




        }


    }



