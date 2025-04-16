import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class NextDayCaculatorTest {
    @Test
    void testNextDay() {
        String result = NextDayCaculator.findNextDay(1,1,2018);

    }
    @Test
    void testNextDay2() {
        String result = NextDayCaculator.findNextDay(31,1,2018);

    }
}