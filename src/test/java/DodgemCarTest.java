import Rides.DodgemCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemCarTest {
    DodgemCar dodgem;

    @Before
    public void before() {
        dodgem = new DodgemCar(60, 4);
    }

    @Test
    public void hasDriveTime() {
        assertEquals(1, dodgem.driveDistance(60));
    }
}
