import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void calling() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.accelerate();
        bike.accelerate();
        bike.decelerate();


        bike.turnOn();
        assertEquals(1, bike.getSpeed());
        assertEquals(1, bike.getGear());

        bike.turnOff();
        assertEquals(1, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }




    }

