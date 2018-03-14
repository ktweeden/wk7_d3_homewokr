import Driver.Driver;
import Rides.DodgemCar;
import Rides.QuadBike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriverTest {

    Driver driver;
    QuadBike quad;
    DodgemCar dodgem;

    @Before
    public void before() {
        quad = new QuadBike(60, 250);
        dodgem = new DodgemCar(60, 2);
        driver = new Driver(quad);
    }

    @Test
    public void canDrive() {
        assertEquals(1, driver.drive(60));
    }

    @Test
    public void canSetRide() {
        driver.setRide(dodgem);
        assertEquals(dodgem, driver.getRide());
    }

}
