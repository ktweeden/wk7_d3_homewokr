import Rides.QuadBike;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {

    QuadBike quadBike;
    @Before
    public void before() {
        quadBike = new QuadBike(60, 250);
    }

    @Test
    public void hasDriveDistance() {
        assertEquals(1, quadBike.driveDistance(60));
    }
}
